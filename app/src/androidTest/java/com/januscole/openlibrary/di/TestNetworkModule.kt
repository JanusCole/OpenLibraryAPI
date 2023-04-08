package com.januscole.openlibrary.di

import com.januscole.openlibrary.data.models.BookSearchResults
import com.januscole.openlibrary.data.service.BookSearchService
import com.januscole.openlibrary.fixtures.MockBookSearchResults
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object TestNetworkModule {
    @Singleton
    @Provides
    fun provideBookDataSource(): BookSearchService {
        return object : BookSearchService {
            override suspend fun searchBooks(bookTitle: String): BookSearchResults {
                if (bookTitle == MockBookSearchResults.VALID_BOOK_TITLE_SEARCH_CRITERIA) {
                    return MockBookSearchResults().getMockBookSearchResults()
                }
                if (bookTitle == MockBookSearchResults().getMockBookSearchResults().docs[0].title) {
                    return MockBookSearchResults().getMockBookSearchResults()
                }
                if (bookTitle == MockBookSearchResults.INVALID_BOOK_TITLE_SEARCH_CRITERIA) {
                    return MockBookSearchResults().getEmptyMockBookSearchResults()
                }
                throw RuntimeException()
            }
        }
    }
}
