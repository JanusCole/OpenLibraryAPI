package com.januscole.openlibrary.data.repository

import com.januscole.openlibrary.data.models.Book
import com.januscole.openlibrary.data.service.BookSearchService
import javax.inject.Inject

class BookSearchRepositoryImpl @Inject constructor(
    private val bookSearchService: BookSearchService
) : BookSearchRepository {

    private val bookResultCache: MutableMap<String, List<Book>> = mutableMapOf()

    override suspend fun searchBooks(bookTitle: String): List<Book> {
        bookResultCache[bookTitle]?.let {
            return it
        }
        val searchResult = bookSearchService.searchBooks(bookTitle)
        bookResultCache[bookTitle] = searchResult
        return searchResult
    }
}
