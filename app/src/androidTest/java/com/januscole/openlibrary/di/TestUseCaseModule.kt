package com.januscole.openlibrary.di

import com.januscole.openlibrary.data.BookResult
import com.januscole.openlibrary.data.models.toBookList
import com.januscole.openlibrary.data.repository.BookSearchRepository
import com.januscole.openlibrary.fixtures.MockBookSearchResults
import com.januscole.openlibrary.use_cases.FetchBookUseCase
import com.januscole.openlibrary.use_cases.SearchBooksUseCase
import com.januscole.openlibrary.use_cases.SearchBooksUseCaseImpl
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
        return SearchBooksUseCaseImpl(bookSearchRepository)
    }

    @Singleton
    @Provides
    fun provideFetchBookUseCase(
        bookSearchRepository: BookSearchRepository
    ): FetchBookUseCase {
        return object : FetchBookUseCase {
            override suspend fun invoke(bookTitle: String, bookId: String): BookResult {
                return when (bookId) {
                    MockBookSearchResults().getMockBookSearchResults().toBookList()[0].key ->
                        BookResult.Success(MockBookSearchResults().getMockBookSearchResults().toBookList()[0])
                    MockBookSearchResults().getMockBookSearchResults().toBookList()[2].key ->
                        BookResult.Success(MockBookSearchResults().getMockBookSearchResults().toBookList()[2])
                    MockBookSearchResults().getMockBookSearchResults().toBookList()[1].key ->
                        BookResult.Failure(Exception("Error"))
                    else ->
                        throw RuntimeException()
                }
            }
        }
    }
}
