package com.januscole.openlibrary.data.service

import com.januscole.openlibrary.data.models.BookSearchResultsDTO
import retrofit2.http.GET
import retrofit2.http.Query

const val OpenLibraryAPI = "https://openlibrary.org/"

interface RetrofitSearch : BookDataSource {
    @GET("search.json?")
    override suspend fun searchBooks(@Query("title") bookTitle: String): BookSearchResultsDTO
}
