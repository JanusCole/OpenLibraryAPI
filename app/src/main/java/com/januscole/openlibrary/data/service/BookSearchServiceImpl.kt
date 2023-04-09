package com.januscole.openlibrary.data.service

import com.januscole.openlibrary.data.models.BookSearchResultsDTO
import javax.inject.Inject

class BookSearchServiceImpl @Inject constructor(
    private val bookDataSource: BookDataSource
) : BookSearchService {
    override suspend fun searchBooks(bookTitle: String): BookSearchResultsDTO {
        return bookDataSource.searchBooks(bookTitle)
    }
}
