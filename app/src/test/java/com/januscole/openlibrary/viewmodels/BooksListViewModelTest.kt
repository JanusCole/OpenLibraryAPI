package com.januscole.openlibrary.viewmodels

import androidx.lifecycle.SavedStateHandle
import app.cash.turbine.test
import com.januscole.openlibrary.data.BookResult
import com.januscole.openlibrary.data.fixtures.MockBookSearchResults
import com.januscole.openlibrary.data.models.Book
import com.januscole.openlibrary.data.models.toBookList
import com.januscole.openlibrary.use_cases.SearchBooksUseCase
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
class BooksListViewModelTest {

    // Mocks
    private lateinit var mockSearchBooksUseCase: SearchBooksUseCase

    private var mockSavedStateHandle: SavedStateHandle = SavedStateHandle().apply {
        set(DISPLAY_BOOKS_UI_STATE, BooksListViewModel.DisplayBooksUiState())
    }

    private lateinit var booksListViewModel: BooksListViewModel

    private val dispatcher = StandardTestDispatcher()

    @Before
    fun setup() {
        Dispatchers.setMain(dispatcher)

        mockSearchBooksUseCase = Mockito.mock(
            SearchBooksUseCase::class.java
        )

        booksListViewModel = BooksListViewModel(
            mockSearchBooksUseCase,
            mockSavedStateHandle
        )
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
    }

    @Test
    fun `Searching For A Book Title Returns A List Of Books`() = runTest {

        // Setup
        Mockito.`when`(mockSearchBooksUseCase.invoke(MockBookSearchResults.VALID_BOOK_TITLE_SEARCH_CRITERIA)).thenReturn(
            BookResult.Success(MockBookSearchResults().getMockBookSearchResults().toBookList())
        )

        val expectedResult = MockBookSearchResults().getMockBookSearchResults().toBookList()
        booksListViewModel.fetchBooks(MockBookSearchResults.VALID_BOOK_TITLE_SEARCH_CRITERIA)

        // Results
        val job = launch {
            booksListViewModel.displayBooksUiState.test {
                val result = awaitItem()
                assertEquals(
                    expectedResult,
                    result.books
                )
                assertNull(result.exception)
                assertFalse(result.isLoading)
            }
        }
        advanceTimeBy(500)
        job.cancel()
    }

    @Test
    fun `Receiving An Error Sets The Error In The UI State`() = runTest {

        // Setup
        Mockito.`when`(mockSearchBooksUseCase.invoke(MockBookSearchResults.VALID_BOOK_TITLE_SEARCH_CRITERIA)).thenReturn(
            BookResult.Failure(Exception())
        )

        val expectedResult = listOf<Book>()
        booksListViewModel.fetchBooks(MockBookSearchResults.VALID_BOOK_TITLE_SEARCH_CRITERIA)

        // Results
        val job = launch {
            booksListViewModel.displayBooksUiState.test {
                val result = awaitItem()
                assertEquals(
                    expectedResult,
                    result.books
                )
                assertNotNull(result.exception)
                assertFalse(result.isLoading)
            }
        }
        advanceTimeBy(500)
        job.cancel()
    }

    @Test
    fun `Test Consuming Search Event`() {
        val mockSavedStateHandle: SavedStateHandle = SavedStateHandle().apply {
            set(
                DISPLAY_BOOKS_UI_STATE,
                BooksListViewModel.DisplayBooksUiState(
                    books = MockBookSearchResults().getMockBookSearchResults().toBookList(),
                    isLoading = true,
                    exception = Exception()
                )
            )
        }

        val booksDisplayViewModel = BooksListViewModel(
            mockSearchBooksUseCase,
            mockSavedStateHandle
        )

        booksDisplayViewModel.consumeFetchEvent()

        assertEquals(booksDisplayViewModel.displayBooksUiState.value, BooksListViewModel.DisplayBooksUiState())
    }
}
