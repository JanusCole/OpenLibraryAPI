package com.januscole.openlibrary.viewmodels

import androidx.lifecycle.SavedStateHandle
import app.cash.turbine.test
import com.januscole.openlibrary.data.BookResult
import com.januscole.openlibrary.data.fixtures.MockBookSearchResults
import com.januscole.openlibrary.data.models.Book
import com.januscole.openlibrary.data.models.toBookList
import com.januscole.openlibrary.use_cases.SearchBooksUseCaseImpl
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
class BooksSearchViewModelTest {

    // Mocks
    private lateinit var mockSearchBooksUseCase: SearchBooksUseCaseImpl

    private var mockSavedStateHandle: SavedStateHandle = SavedStateHandle().apply {
        set(SEARCH_BOOKS_UI_STATE, BooksSearchViewModel.SearchBooksUiState())
    }

    private lateinit var booksSearchViewModel: BooksSearchViewModel

    private val dispatcher = StandardTestDispatcher()

    @Before
    fun setup() {
        Dispatchers.setMain(dispatcher)

        mockSearchBooksUseCase = Mockito.mock(
            SearchBooksUseCaseImpl::class.java
        )

        booksSearchViewModel = BooksSearchViewModel(
            mockSearchBooksUseCase,
            mockSavedStateHandle
        )
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
    }

    @Test
    fun `Searching For A Book Titles Returns A List Of Books`() = runTest {

        // Setup
        Mockito.`when`(mockSearchBooksUseCase.invoke(MockBookSearchResults.VALID_BOOK_TITLE_SEARCH_CRITERIA))
            .thenReturn(
                BookResult.Success(MockBookSearchResults().getMockBookSearchResults().toBookList())
            )

        val expectedResult = MockBookSearchResults().getMockBookSearchResults().toBookList()
        booksSearchViewModel.updateSearchTerm(MockBookSearchResults.VALID_BOOK_TITLE_SEARCH_CRITERIA)
        booksSearchViewModel.searchBooks()

        // Results
        val job = launch {
            booksSearchViewModel.searchBooksUiState.test {
                val result = awaitItem()
                assertEquals(
                    expectedResult,
                    result.books
                )
                assertNull(result.exception)
                assertFalse(result.isLoading)
            }
        }
        job.cancel()
    }

    @Test
    fun `Finding No Book Results Sets The Error In The UI State`() = runTest {

        // Setup
        Mockito.`when`(mockSearchBooksUseCase.invoke(MockBookSearchResults.INVALID_BOOK_TITLE_SEARCH_CRITERIA))
            .thenReturn(
                BookResult.Success(
                    MockBookSearchResults().getEmptyMockBookSearchResults().toBookList()
                )
            )

        val expectedResult = listOf<Book>()
        booksSearchViewModel.updateSearchTerm(MockBookSearchResults.INVALID_BOOK_TITLE_SEARCH_CRITERIA)
        booksSearchViewModel.searchBooks()

        // Results
        val job = launch {
            booksSearchViewModel.searchBooksUiState.test {
                val result = awaitItem()
                assertEquals(
                    expectedResult,
                    result.books
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
        Mockito.`when`(mockSearchBooksUseCase.invoke(MockBookSearchResults.INVALID_BOOK_TITLE_SEARCH_CRITERIA))
            .thenReturn(
                BookResult.Success(MockBookSearchResults().getMockBookSearchResults())
            )

        val expectedResult = listOf<Book>()
        booksSearchViewModel.updateSearchTerm(MockBookSearchResults.INVALID_BOOK_TITLE_SEARCH_CRITERIA)
        booksSearchViewModel.searchBooks()

        // Results
        val job = launch {
            booksSearchViewModel.searchBooksUiState.test {
                val result = awaitItem()
                assertEquals(
                    expectedResult,
                    result.books
                )
                assertNotNull(result.exception)
                assertFalse(result.isLoading)
            }
        }
        job.cancel()
    }

    @Test
    fun `Receiving An Error Sets The Error In The UI State`() = runTest {

        // Setup
        Mockito.`when`(mockSearchBooksUseCase.invoke(MockBookSearchResults.VALID_BOOK_TITLE_SEARCH_CRITERIA))
            .thenReturn(
                BookResult.Failure(Exception())
            )

        val expectedResult = listOf<Book>()
        booksSearchViewModel.updateSearchTerm(MockBookSearchResults.VALID_BOOK_TITLE_SEARCH_CRITERIA)
        booksSearchViewModel.searchBooks()

        // Results
        val job = launch {
            booksSearchViewModel.searchBooksUiState.test {
                val result = awaitItem()
                assertEquals(
                    expectedResult,
                    result.books
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
                SEARCH_BOOKS_UI_STATE,
                BooksSearchViewModel.SearchBooksUiState(
                    books = MockBookSearchResults().getMockBookSearchResults().toBookList(),
                    isLoading = true,
                    exception = Exception()
                )
            )
        }

        val booksSearchViewModel = BooksSearchViewModel(
            mockSearchBooksUseCase,
            mockSavedStateHandle
        )

        booksSearchViewModel.consumeSearchEvent()

        assertEquals(
            booksSearchViewModel.searchBooksUiState.value,
            BooksSearchViewModel.SearchBooksUiState()
        )
    }

    @Test
    fun `Update Search Terms`() {
        booksSearchViewModel.updateSearchTerm(MockBookSearchResults.VALID_BOOK_TITLE_SEARCH_CRITERIA)
        assertEquals(
            MockBookSearchResults.VALID_BOOK_TITLE_SEARCH_CRITERIA,
            booksSearchViewModel.searchBooksUiState.value.searchTerm
        )
    }
}
