package com.januscole.openlibrary.di

import com.januscole.openlibrary.data.models.Book
import com.januscole.openlibrary.data.models.toBookList
import com.januscole.openlibrary.data.repository.BookSearchRepository
import com.januscole.openlibrary.data.service.BookSearchService
import com.januscole.openlibrary.fixtures.MockBookSearchResults
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object TestRepositoryModule {
    @Singleton
    @Provides
    fun provideBookSearchRepository(
        bookSearchService: BookSearchService
    ): BookSearchRepository {
        return object : BookSearchRepository {

            var variableErrorCount = 0

            override suspend fun searchBooks(bookTitle: String): List<Book> {
                return when (bookTitle) {
                    MockBookSearchResults.VALID_BOOK_TITLE_SEARCH_CRITERIA -> MockBookSearchResults().getMockBookSearchResults().toBookList()
                    MockBookSearchResults.INVALID_BOOK_TITLE_SEARCH_CRITERIA -> MockBookSearchResults().getEmptyMockBookSearchResults().toBookList()
                    MockBookSearchResults.ERROR_TITLE_SEARCH_CRITERIA -> throw RuntimeException("Error")
                    MockBookSearchResults.VARIABLE_ERROR_TITLE_SEARCH_CRITERIA -> {
                        if (variableErrorCount == 0) {
                            variableErrorCount++
                            MockBookSearchResults().getMockBookSearchResults().toBookList()
                        } else {
                            throw RuntimeException("Error")
                        }
                    }
                    else ->
                        throw RuntimeException("Error")
                }
            }
        }
    }
}
