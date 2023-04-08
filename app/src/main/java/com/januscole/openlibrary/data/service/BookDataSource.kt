package com.januscole.openlibrary.data.service

import com.januscole.openlibrary.data.models.BookSearchResults

interface BookDataSource {
    suspend fun searchBooks(bookTitle: String): BookSearchResults
}
