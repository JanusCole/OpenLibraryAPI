package com.januscole.openlibrary.use_cases

import com.januscole.openlibrary.data.ApiResult
import com.januscole.openlibrary.data.repository.BookSearchRepository
import javax.inject.Inject

class FetchBookUseCase @Inject constructor(
    private val repository: BookSearchRepository
) {
    suspend operator fun invoke(bookTitle: String, bookId: String): ApiResult {
        return try {
            val bookSearchResults = repository.searchBooks(bookTitle).docs.find {
                it.key.contains(bookId)
            }
            ApiResult.Success(bookSearchResults)
        } catch (e: Exception) {
            ApiResult.Failure(e)
        }
    }
}
