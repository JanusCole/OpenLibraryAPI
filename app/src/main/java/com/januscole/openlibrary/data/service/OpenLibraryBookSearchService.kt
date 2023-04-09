package com.januscole.openlibrary.data.service

import com.januscole.openlibrary.data.models.Book
import com.januscole.openlibrary.data.models.toBookList
import javax.inject.Inject

class OpenLibraryBookSearchService @Inject constructor(
    private val bookDataSource: OpenLibraryAPIRetrofitSearch
) : BookSearchService {
    override suspend fun searchBooks(bookTitle: String): List<Book> {
        return bookDataSource.searchBooks(bookTitle).toBookList()
    }
}
