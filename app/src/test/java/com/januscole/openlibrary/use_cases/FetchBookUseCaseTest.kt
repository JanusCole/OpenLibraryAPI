package com.januscole.openlibrary.use_cases

import com.januscole.openlibrary.data.BookResult
import com.januscole.openlibrary.data.fixtures.MockBookSearchResults
import com.januscole.openlibrary.data.models.Book
import com.januscole.openlibrary.data.models.toBookList
import com.januscole.openlibrary.data.repository.BookSearchRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito

@OptIn(ExperimentalCoroutinesApi::class)
class FetchBookUseCaseTest {

    // Mocks
    private lateinit var mockBookSearchRepository: BookSearchRepository

    private lateinit var fetchBookUseCase: FetchBookUseCase

    @Before
    fun setup() {
        mockBookSearchRepository = Mockito.mock(
            BookSearchRepository::class.java
        )

        fetchBookUseCase = FetchBookUseCaseImpl(
            mockBookSearchRepository
        )
    }

    @Test
    fun `Searching For A Book Id Returns The Correct Book`() = runTest {

        // Setup
        Mockito.`when`(mockBookSearchRepository.searchBooks(MockBookSearchResults.VALID_BOOK_TITLE_SEARCH_CRITERIA))
            .thenReturn(
                MockBookSearchResults().getMockBookSearchResults().toBookList()
            )

        val expectedResult = BookResult.Success(MockBookSearchResults().getMockBookSearchResults().toBookList()[0])
        val actualResult = fetchBookUseCase.invoke(
            MockBookSearchResults.VALID_BOOK_TITLE_SEARCH_CRITERIA,
            MockBookSearchResults().getMockBookSearchResults().toBookList()[0].key
        )

        assertEquals(
            expectedResult,
            actualResult
        )
    }

    @Test
    fun `Book Search Failure Returns An Error ApiResult`() = runTest {

        // Setup
        Mockito.`when`(mockBookSearchRepository.searchBooks(MockBookSearchResults.VALID_BOOK_TITLE_SEARCH_CRITERIA)).thenReturn(
            listOf<Book>()
        )

        val actualResult = fetchBookUseCase.invoke(
            MockBookSearchResults.VALID_BOOK_TITLE_SEARCH_CRITERIA,
            MockBookSearchResults().getMockBookSearchResults().toBookList()[0].key
        )

        assertTrue(actualResult is BookResult.Failure)
    }

    @Test
    fun `Receiving An Internet Error Returns An Error ApiResult`() = runTest {

        // Setup
        Mockito.`when`(mockBookSearchRepository.searchBooks(MockBookSearchResults.VALID_BOOK_TITLE_SEARCH_CRITERIA))
            .thenThrow(RuntimeException())

        val actualResult = fetchBookUseCase.invoke(
            MockBookSearchResults.VALID_BOOK_TITLE_SEARCH_CRITERIA,
            MockBookSearchResults().getMockBookSearchResults().toBookList()[0].key
        )

        assertTrue(actualResult is BookResult.Failure)
    }
}
