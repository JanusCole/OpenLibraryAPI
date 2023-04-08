package com.januscole.openlibrary.data.service

import com.januscole.openlibrary.data.models.BookSearchResults
import javax.inject.Inject

class BookSearchServiceImpl@Inject constructor(
    private val bookDataSource: BookDataSource
) : BookSearchService {
    override suspend fun searchBooks(bookTitle: String): BookSearchResults {
        return bookDataSource.searchBooks(bookTitle)
    }
}
