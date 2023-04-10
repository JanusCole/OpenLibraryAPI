package com.januscole.openlibrary.data.repository

import com.januscole.openlibrary.data.fixtures.MockBookSearchResults
import com.januscole.openlibrary.data.models.toBook
import com.januscole.openlibrary.data.models.toBookList
import com.januscole.openlibrary.data.service.BookSearchService
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.mockito.ArgumentMatchers
import org.mockito.Mockito

@OptIn(ExperimentalCoroutinesApi::class)
class BookSearchRepositoryImplTest {

    // Mocks
    private lateinit var mockBookSearchService: BookSearchService

    // Class under test
    private lateinit var bookSearchRepository: BookSearchRepository

    @Before
    fun setup() {
        mockBookSearchService = Mockito.mock(
            BookSearchService::class.java
        )
        bookSearchRepository = BookSearchRepositoryImpl(mockBookSearchService)
    }

    @Test
    fun `Searching For A Book Titles Returns A List Of Books`() = runTest {

        // Setup
        Mockito.`when`(mockBookSearchService.searchBooks(ArgumentMatchers.anyString())).thenReturn(
            MockBookSearchResults().getMockBookSearchResults().toBookList()
        )

        val expectedResult = MockBookSearchResults().getMockBookSearchResults()

        // Execute the test
        val actualResult = bookSearchRepository.searchBooks(MockBookSearchResults.VALID_BOOK_TITLE_SEARCH_CRITERIA)

        // Result
        assertEquals(expectedResult.docs!!.size, actualResult.size)
        expectedResult.docs!!.forEachIndexed { index, bookDocument ->
            assertEquals(bookDocument.toBook(), actualResult[index])
        }
    }

    @Test
    fun `Searching For A Book Titles Twice Returns A Cached List Of Books`() = runTest {

        // Setup
        Mockito.`when`(mockBookSearchService.searchBooks(MockBookSearchResults.VALID_BOOK_TITLE_SEARCH_CRITERIA)).thenReturn(
            MockBookSearchResults().getMockBookSearchResults().toBookList()
        ).thenThrow(RuntimeException())

        bookSearchRepository.searchBooks(MockBookSearchResults.VALID_BOOK_TITLE_SEARCH_CRITERIA)

        val expectedResult = MockBookSearchResults().getMockBookSearchResults()

        // Execute the test
        val actualResult = bookSearchRepository.searchBooks(MockBookSearchResults.VALID_BOOK_TITLE_SEARCH_CRITERIA)

        // Result
        assertEquals(expectedResult.docs!!.size, actualResult.size)
        expectedResult.docs!!.forEachIndexed { index, bookDocument ->
            assertEquals(bookDocument.toBook(), actualResult[index])
        }
    }

    @Test
    fun `Searching For A Book When The Internet Search Fails Returns Error`() = runTest {

        // Setup
        Mockito.`when`(mockBookSearchService.searchBooks(MockBookSearchResults.VALID_BOOK_TITLE_SEARCH_CRITERIA)).thenThrow(RuntimeException())

        // Execute the test
        try {
            bookSearchRepository.searchBooks(MockBookSearchResults.VALID_BOOK_TITLE_SEARCH_CRITERIA)
            assertTrue(false)
        } catch (e: Exception) {
            assertTrue(true)
        }
    }
}
