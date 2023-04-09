package com.januscole.openlibrary.use_cases

import com.januscole.openlibrary.data.BookResult
import com.januscole.openlibrary.data.repository.BookSearchRepository
import javax.inject.Inject

class SearchBooksUseCaseImpl @Inject constructor(
    private val repository: BookSearchRepository
) : SearchBooksUseCase {
    override suspend operator fun invoke(bookTitle: String): BookResult {
        return try {
            val result = repository.searchBooks(bookTitle)
            BookResult.Success(result)
        } catch (e: Exception) {
            BookResult.Failure(e)
        }
    }
}
