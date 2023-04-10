package com.januscole.openlibrary.viewmodels

import androidx.lifecycle.SavedStateHandle
import app.cash.turbine.test
import com.januscole.openlibrary.data.BookResult
import com.januscole.openlibrary.data.fixtures.MockBookSearchResults
import com.januscole.openlibrary.data.models.toBookList
import com.januscole.openlibrary.use_cases.FetchBookUseCaseImpl
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.*
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito

@OptIn(ExperimentalCoroutinesApi::class)
class BookDetailsViewModelTest {

    // Mocks
    private lateinit var mockFetchBookUseCase: FetchBookUseCaseImpl

    private var mockSavedStateHandle: SavedStateHandle = SavedStateHandle().apply {
        set(BOOK_DETAILS_UI_STATE, BookDetailsViewModel.BookDetailsUiState())
    }

    private lateinit var bookDisplayViewModel: BookDetailsViewModel

    private val dispatcher = StandardTestDispatcher()

    @Before
    fun setup() {
        Dispatchers.setMain(dispatcher)

        mockFetchBookUseCase = Mockito.mock(
            FetchBookUseCaseImpl::class.java
        )

        bookDisplayViewModel = BookDetailsViewModel(
            mockFetchBookUseCase,
            mockSavedStateHandle
        )
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
    }

    @Test
    fun `Searching For A Book Id Returns The Correct Book`() = runTest {

        // Setup
        Mockito.`when`(
            mockFetchBookUseCase.invoke(
                MockBookSearchResults.VALID_BOOK_TITLE_SEARCH_CRITERIA,
                MockBookSearchResults.VALID_BOOK_ID_SEARCH_CRITERIA
            )
        ).thenReturn(
            BookResult.Success(MockBookSearchResults().getMockBookSearchResults().toBookList()[0])
        )

        val expectedResult = MockBookSearchResults().getMockBookSearchResults().toBookList()[0]
        bookDisplayViewModel.fetchBook(
            MockBookSearchResults.VALID_BOOK_TITLE_SEARCH_CRITERIA,
            MockBookSearchResults.VALID_BOOK_ID_SEARCH_CRITERIA
        )

        // Results
        val job = launch {
            bookDisplayViewModel.bookDetailsUiState.test {
                val result = awaitItem()
                assertEquals(
                    expectedResult,
                    result.book
                )
                assertNull(result.exception)
                assertFalse(result.isLoading)
            }
        }
        job.cancel()
    }

    @Test
    fun `Receiving An Error Sets The Error In The UI State`() = runTest {

        // Setup
        Mockito.`when`(
            mockFetchBookUseCase.invoke(
                MockBookSearchResults.VALID_BOOK_TITLE_SEARCH_CRITERIA,
                MockBookSearchResults.VALID_BOOK_ID_SEARCH_CRITERIA
            )
        ).thenReturn(
            BookResult.Failure(Exception())
        )

        val expectedResult = null
        bookDisplayViewModel.fetchBook(
            MockBookSearchResults.VALID_BOOK_TITLE_SEARCH_CRITERIA,
            MockBookSearchResults.VALID_BOOK_ID_SEARCH_CRITERIA
        )

        // Results
        val job = launch {
            bookDisplayViewModel.bookDetailsUiState.test {
                val result = awaitItem()
                assertEquals(
                    expectedResult,
                    result.book
                )
                assertNotNull(result.exception)
                assertFalse(result.isLoading)
            }
        }
        job.cancel()
    }

    @Test
    fun `Failing Result Cast Sets The Error In The UI State`() = runTest {

        // Setup
        Mockito.`when`(
            mockFetchBookUseCase.invoke(
                MockBookSearchResults.VALID_BOOK_TITLE_SEARCH_CRITERIA,
                MockBookSearchResults.VALID_BOOK_ID_SEARCH_CRITERIA
            )
        ).thenReturn(
            BookResult.Success(MockBookSearchResults().getMockBookSearchResults())
        )

        val expectedResult = null
        bookDisplayViewModel.fetchBook(
            MockBookSearchResults.VALID_BOOK_TITLE_SEARCH_CRITERIA,
            MockBookSearchResults.VALID_BOOK_ID_SEARCH_CRITERIA
        )

        // Results
        val job = launch {
            bookDisplayViewModel.bookDetailsUiState.test {
                val result = awaitItem()
                assertEquals(
                    expectedResult,
                    result.book
                )
                assertNotNull(result.exception)
                assertFalse(result.isLoading)
            }
        }
        job.cancel()
    }

    @Test
    fun `Test Consuming Search Event`() {
        val mockSavedStateHandle: SavedStateHandle = SavedStateHandle().apply {
            set(
                BOOK_DETAILS_UI_STATE,
                BookDetailsViewModel.BookDetailsUiState(
                    book = MockBookSearchResults().getMockBookSearchResults().toBookList()[0],
                    isLoading = true,
                    exception = Exception()
                )
            )
        }

        val bookDisplayViewModel = BookDetailsViewModel(
            mockFetchBookUseCase,
            mockSavedStateHandle
        )

        bookDisplayViewModel.consumeFetchEvent()

        assertEquals(
            bookDisplayViewModel.bookDetailsUiState.value,
            BookDetailsViewModel.BookDetailsUiState()
        )
    }
}
