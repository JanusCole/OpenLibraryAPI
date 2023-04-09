package com.januscole.openlibrary.di

import com.januscole.openlibrary.data.models.BookSearchResultsDTO
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
            override suspend fun searchBooks(bookTitle: String): BookSearchResultsDTO {
                return MockBookSearchResults().getMockBookSearchResults()
            }
        }
    }
}
