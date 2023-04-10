package com.januscole.openlibrary.viewmodels

import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.januscole.openlibrary.data.BookResult
import com.januscole.openlibrary.data.models.Book
import com.januscole.openlibrary.use_cases.SearchBooksUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.launch
import kotlinx.parcelize.Parcelize

const val SEARCH_BOOKS_UI_STATE = "SEARCH_BOOKS_UI_STATE"
const val SEARCH_TERM = "SEARCH_TERM"

@HiltViewModel
class BooksSearchViewModel @Inject constructor(
    private val searchBooksUseCase: SearchBooksUseCase,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    @Parcelize
    data class SearchBooksUiState(
        val books: List<Book> = listOf(),
        val isLoading: Boolean = false,
        val exception: Throwable? = null
    ) : Parcelable

    val searchBooksUiState =
        savedStateHandle.getStateFlow(SEARCH_BOOKS_UI_STATE, SearchBooksUiState())
    val searchTerm =
        savedStateHandle.getStateFlow(SEARCH_TERM, "")

    fun updateSearchTerm(newSearchTerm: String) {
        savedStateHandle[SEARCH_TERM] = newSearchTerm
    }

    fun searchBooks(bookTitle: String) {
        viewModelScope.launch {
            savedStateHandle[SEARCH_BOOKS_UI_STATE] =
                searchBooksUiState.value.copy(isLoading = true)
            when (val result = searchBooksUseCase(bookTitle)) {
                is BookResult.Success<*> -> {
                    try {
                        @Suppress("UNCHECKED_CAST")
                        val bookSearchResults = result.data as List<Book>
                        if (bookSearchResults.isEmpty()) {
                            savedStateHandle[SEARCH_BOOKS_UI_STATE] = searchBooksUiState.value.copy(
                                isLoading = false,
                                exception = Exception("No Books Found")
                            )
                        } else {
                            savedStateHandle[SEARCH_BOOKS_UI_STATE] =
                                searchBooksUiState.value.copy(
                                    books = bookSearchResults,
                                    isLoading = false,
                                    exception = null
                                )
                        }
                    } catch (e: Exception) {
                        // In case the cast to List<IndividualBook> fails
                        savedStateHandle[SEARCH_BOOKS_UI_STATE] = searchBooksUiState.value.copy(
                            isLoading = false,
                            exception = Exception(e.message)
                        )
                    }
                }
                is BookResult.Failure -> {
                    savedStateHandle[SEARCH_BOOKS_UI_STATE] = searchBooksUiState.value.copy(
                        isLoading = false,
                        exception = result.exception
                    )
                }
            }
        }
    }

    fun consumeSearchEvent() {
        savedStateHandle[SEARCH_BOOKS_UI_STATE] = SearchBooksUiState()
    }
}
