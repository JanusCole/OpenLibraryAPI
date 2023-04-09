package com.januscole.openlibrary.use_cases

import com.januscole.openlibrary.data.BookResult
import com.januscole.openlibrary.data.fixtures.MockBookSearchResults
import com.januscole.openlibrary.data.models.toBookList
import com.januscole.openlibrary.data.repository.BookSearchRepository
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.*
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito

@OptIn(ExperimentalCoroutinesApi::class)
class SearchBooksUseCaseTest {

    // Mocks
    private lateinit var mockBookSearchRepository: BookSearchRepository

    private lateinit var searchBooksUseCase: SearchBooksUseCase

    @Before
    fun setup() {
        mockBookSearchRepository = Mockito.mock(
            BookSearchRepository::class.java
        )

        searchBooksUseCase = SearchBooksUseCaseImpl(
            mockBookSearchRepository
        )
    }

    @Test
    fun `Searching For A Book Titles Returns A List Of Books`() = runTest {

        // Setup
        Mockito.`when`(mockBookSearchRepository.searchBooks(MockBookSearchResults.VALID_BOOK_TITLE_SEARCH_CRITERIA))
            .thenReturn(
                MockBookSearchResults().getMockBookSearchResults().toBookList()
            )

        val expectedResult = BookResult.Success(MockBookSearchResults().getMockBookSearchResults().toBookList())
        val actualResult =
            searchBooksUseCase.invoke(MockBookSearchResults.VALID_BOOK_TITLE_SEARCH_CRITERIA)

        Assert.assertEquals(
            expectedResult,
            actualResult
        )
    }

    @Test
    fun `Receiving An Internet Error Returns An Error ApiResult`() = runTest {

        // Setup
        Mockito.`when`(mockBookSearchRepository.searchBooks(MockBookSearchResults.VALID_BOOK_TITLE_SEARCH_CRITERIA))
            .thenThrow(RuntimeException())

        val actualResult =
            searchBooksUseCase.invoke(MockBookSearchResults.VALID_BOOK_TITLE_SEARCH_CRITERIA)

        Assert.assertTrue(actualResult is BookResult.Failure)
    }
}
