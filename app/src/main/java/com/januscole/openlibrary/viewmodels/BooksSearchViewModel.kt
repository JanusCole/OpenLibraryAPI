package com.januscole.openlibrary.viewmodels

import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.januscole.openlibrary.data.BookResult
import com.januscole.openlibrary.data.models.BookSearchResults
import com.januscole.openlibrary.use_cases.SearchBooksUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.launch
import kotlinx.parcelize.Parcelize

const val SEARCH_BOOKS_UI_STATE = "SEARCH_BOOKS_UI_STATE"

@HiltViewModel
class BooksSearchViewModel @Inject constructor(
    private val searchBooksUseCase: SearchBooksUseCase,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    @Parcelize
    data class SearchBooksUiState(
        val books: BookSearchResults? = null,
        val isLoading: Boolean = false,
        val exception: Throwable? = null
    ) : Parcelable

    val searchBooksUiState = savedStateHandle.getStateFlow(SEARCH_BOOKS_UI_STATE, SearchBooksUiState())

    fun searchBooks(bookTitle: String) {
        viewModelScope.launch {
            savedStateHandle[SEARCH_BOOKS_UI_STATE] = searchBooksUiState.value.copy(isLoading = true)
            when (val result = searchBooksUseCase(bookTitle)) {
                is BookResult.Success<*> -> {
                    val bookSearchResults = result.data as BookSearchResults
                    if (bookSearchResults.numFound == 0) {
                        savedStateHandle[SEARCH_BOOKS_UI_STATE] = searchBooksUiState.value.copy(isLoading = false, exception = Exception("No Books Found"))
                    } else {
                        savedStateHandle[SEARCH_BOOKS_UI_STATE] =
                            searchBooksUiState.value.copy(
                                books = bookSearchResults,
                                isLoading = false,
                                exception = null
                            )
                    }
                }
                is BookResult.Failure -> {
                    savedStateHandle[SEARCH_BOOKS_UI_STATE] = searchBooksUiState.value.copy(isLoading = false, exception = result.exception)
                }
            }
        }
    }

    fun consumeSearchEvent() {
        savedStateHandle[SEARCH_BOOKS_UI_STATE] = SearchBooksUiState()
    }
}
