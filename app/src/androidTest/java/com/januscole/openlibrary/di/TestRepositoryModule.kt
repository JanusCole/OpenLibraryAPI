package com.januscole.openlibrary.di

import com.januscole.openlibrary.data.repository.BookSearchRepository
import com.januscole.openlibrary.data.repository.BookSearchRepositoryImpl
import com.januscole.openlibrary.data.service.BookSearchService
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
        return BookSearchRepositoryImpl(bookSearchService)
    }
}
