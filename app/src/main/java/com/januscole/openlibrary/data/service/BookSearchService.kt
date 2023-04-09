package com.januscole.openlibrary.data.service

import com.januscole.openlibrary.data.models.BookSearchResultsDTO

interface BookSearchService {
    suspend fun searchBooks(bookTitle: String): BookSearchResultsDTO
}
