package com.januscole.openlibrary.data.repository

import com.januscole.openlibrary.data.models.IndividualBook

interface BookSearchRepository {
    suspend fun searchBooks(bookTitle: String): List<IndividualBook>
}
