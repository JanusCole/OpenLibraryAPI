package com.januscole.openlibrary.data.service

import com.januscole.openlibrary.data.fixtures.MockBookSearchResults
import com.januscole.openlibrary.data.models.toBookList
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.mockito.ArgumentMatchers
import org.mockito.Mockito

@OptIn(ExperimentalCoroutinesApi::class)
class BookSearchServiceImplTest {

    // Mocks
    private lateinit var mockRetrofitService: OpenLibraryAPIRetrofitSearch

    // Class under test
    private lateinit var bookSearchService: BookSearchService

    @Before
    fun setup() {
        mockRetrofitService = Mockito.mock(
            OpenLibraryAPIRetrofitSearch::class.java
        )

        bookSearchService = OpenLibraryBookSearchService(mockRetrofitService)
    }

    @Test
    fun `Searching For A Book Titles Returns A List Of Books`() = runTest {

        // Setup
        Mockito.`when`(mockRetrofitService.searchBooks(ArgumentMatchers.anyString())).thenReturn(
            MockBookSearchResults().getMockBookSearchResults()
        )

        val expectedResult = MockBookSearchResults().getMockBookSearchResults().toBookList()

        // Execute the test
        val actualResult = bookSearchService.searchBooks(MockBookSearchResults.VALID_BOOK_TITLE_SEARCH_CRITERIA)

        // Result
        assertEquals(expectedResult.size, actualResult.size)
        expectedResult.forEachIndexed { index, bookDocument ->
            assertEquals(bookDocument, actualResult[index])
        }
    }

    @Test
    fun `Searching For A Book When The Internet Search Fails Returns Error`() = runTest {

        // Setup
        Mockito.`when`(mockRetrofitService.searchBooks(ArgumentMatchers.anyString())).thenThrow(RuntimeException())

        // Execute the test
        try {
            bookSearchService.searchBooks(MockBookSearchResults.VALID_BOOK_TITLE_SEARCH_CRITERIA)
            assertTrue(false)
        } catch (e: Exception) {
            assertTrue(true)
        }
    }
}
