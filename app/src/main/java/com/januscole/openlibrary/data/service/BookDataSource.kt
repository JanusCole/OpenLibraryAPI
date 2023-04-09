package com.januscole.openlibrary.data.service

import com.januscole.openlibrary.data.models.BookSearchResultsDTO

interface BookDataSource {
    suspend fun searchBooks(bookTitle: String): BookSearchResultsDTO
}
