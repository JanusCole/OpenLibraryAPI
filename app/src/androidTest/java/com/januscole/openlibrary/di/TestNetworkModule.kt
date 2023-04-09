package com.januscole.openlibrary.di

import com.januscole.openlibrary.data.models.Book
import com.januscole.openlibrary.data.models.toBookList
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
            override suspend fun searchBooks(bookTitle: String): List<Book> {
                return MockBookSearchResults().getMockBookSearchResults().toBookList()
            }
        }
    }
}
