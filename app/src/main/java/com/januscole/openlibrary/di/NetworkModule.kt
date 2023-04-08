package com.januscole.openlibrary.di

import com.januscole.openlibrary.data.service.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@InstallIn(SingletonComponent::class)
@Module
object NetworkModule {
    @Singleton
    @Provides
    fun provideBookDataSource(): BookDataSource {
        return Retrofit.Builder()
            .baseUrl(OpenLibraryAPI)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(RetrofitSearch::class.java)
    }
    @Singleton
    @Provides
    fun provideBookSearchService(
        bookDataSource: BookDataSource
    ): BookSearchService {
        return BookSearchServiceImpl(bookDataSource)
    }
}
