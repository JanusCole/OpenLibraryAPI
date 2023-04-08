package com.januscole.openlibrary.data.repository

import com.januscole.openlibrary.data.models.BookSearchResults

interface BookSearchRepository {
    suspend fun searchBooks(bookTitle: String): BookSearchResults
}
