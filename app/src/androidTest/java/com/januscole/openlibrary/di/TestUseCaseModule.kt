package com.januscole.openlibrary.di

import com.januscole.openlibrary.data.repository.BookSearchRepository
import com.januscole.openlibrary.use_cases.FetchBookUseCase
import com.januscole.openlibrary.use_cases.SearchBooksUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object TestUseCaseModule {

    @Singleton
    @Provides
    fun provideSearchBooksUseCase(
        bookSearchRepository: BookSearchRepository
    ): SearchBooksUseCase {
        return SearchBooksUseCase(bookSearchRepository)
    }

    @Singleton
    @Provides
    fun provideFetchBookUseCase(
        bookSearchRepository: BookSearchRepository
    ): FetchBookUseCase {
        return FetchBookUseCase(bookSearchRepository)
    }
}
