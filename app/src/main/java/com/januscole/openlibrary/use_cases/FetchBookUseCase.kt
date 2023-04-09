package com.januscole.openlibrary.use_cases

import com.januscole.openlibrary.data.BookResult

interface FetchBookUseCase {
    suspend operator fun invoke(bookTitle: String, bookId: String): BookResult
}
