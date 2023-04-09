package com.januscole.openlibrary.data.service

import com.januscole.openlibrary.data.models.Book

interface BookSearchService {
    suspend fun searchBooks(bookTitle: String): List<Book>
}
