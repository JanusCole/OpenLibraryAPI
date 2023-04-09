package com.januscole.openlibrary.data.repository

import com.januscole.openlibrary.data.models.Book

interface BookSearchRepository {
    suspend fun searchBooks(bookTitle: String): List<Book>
}
