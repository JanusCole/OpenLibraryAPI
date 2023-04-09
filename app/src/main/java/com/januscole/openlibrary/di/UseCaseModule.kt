package com.januscole.openlibrary.di

import com.januscole.openlibrary.data.repository.BookSearchRepository
import com.januscole.openlibrary.use_cases.FetchBookUseCase
import com.januscole.openlibrary.use_cases.FetchBookUseCaseImpl
import com.januscole.openlibrary.use_cases.SearchBooksUseCase
import com.januscole.openlibrary.use_cases.SearchBooksUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object UseCaseModule {

    @Singleton
    @Provides
    fun provideSearchBooksUseCase(
        bookSearchRepository: BookSearchRepository
    ): SearchBooksUseCase {
        return SearchBooksUseCaseImpl(bookSearchRepository)
    }

    @Singleton
    @Provides
    fun provideFetchBookUseCase(
        bookSearchRepository: BookSearchRepository
    ): FetchBookUseCase {
        return FetchBookUseCaseImpl(bookSearchRepository)
    }
}
