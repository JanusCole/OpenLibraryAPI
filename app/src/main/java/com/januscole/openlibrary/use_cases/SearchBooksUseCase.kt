package com.januscole.openlibrary.use_cases

import com.januscole.openlibrary.data.BookResult

interface SearchBooksUseCase {
    suspend operator fun invoke(bookTitle: String): BookResult
}
