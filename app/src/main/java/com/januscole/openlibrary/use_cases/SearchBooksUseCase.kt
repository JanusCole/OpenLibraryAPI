package com.januscole.openlibrary.use_cases

import com.januscole.openlibrary.data.ApiResult
import com.januscole.openlibrary.data.repository.BookSearchRepository
import javax.inject.Inject

class SearchBooksUseCase @Inject constructor(
    private val repository: BookSearchRepository
) {
    suspend operator fun invoke(bookTitle: String): ApiResult {
        return try {
            val result = repository.searchBooks(bookTitle)
            ApiResult.Success(result)
        } catch (e: Exception) {
            ApiResult.Failure(e)
        }
    }
}
