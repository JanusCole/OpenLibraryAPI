package com.januscole.openlibrary.use_cases

import com.januscole.openlibrary.data.BookResult
import com.januscole.openlibrary.data.repository.BookSearchRepository
import javax.inject.Inject

class FetchBookUseCaseImpl @Inject constructor(
    private val repository: BookSearchRepository
) : FetchBookUseCase {
    override suspend operator fun invoke(bookTitle: String, bookId: String): BookResult {
        return try {
            val bookSearchResults = repository.searchBooks(bookTitle).find {
                it.key == bookId
            } ?: return BookResult.Failure(Exception("Book Not Found"))
            BookResult.Success(bookSearchResults)
        } catch (e: Exception) {
            BookResult.Failure(e)
        }
    }
}
