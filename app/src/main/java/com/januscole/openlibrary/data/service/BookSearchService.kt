package com.januscole.openlibrary.data.service

import com.januscole.openlibrary.data.models.BookSearchResults

interface BookSearchService {
    suspend fun searchBooks(bookTitle: String): BookSearchResults
}
