package com.januscole.openlibrary.viewmodels

import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.januscole.openlibrary.data.ApiResult
import com.januscole.openlibrary.data.models.Book
import com.januscole.openlibrary.data.models.BookSearchResults
import com.januscole.openlibrary.use_cases.SearchBooksUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.launch
import kotlinx.parcelize.Parcelize

const val DISPLAY_BOOKS_UI_STATE = "DISPLAY_BOOKS_UI_STATE"

@HiltViewModel
class BooksListViewModel @Inject constructor(
    private val searchBooksUseCase: SearchBooksUseCase,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    @Parcelize
    data class DisplayBooksUiState(
        val books: List<Book> = listOf(),
        val isLoading: Boolean = false,
        val exception: Throwable? = null
    ) : Parcelable

    val displayBooksUiState = savedStateHandle.getStateFlow(DISPLAY_BOOKS_UI_STATE, DisplayBooksUiState())

    fun fetchBooks(bookTitle: String) {
        viewModelScope.launch {
            savedStateHandle[DISPLAY_BOOKS_UI_STATE] = displayBooksUiState.value.copy(isLoading = true)
            when (val result = searchBooksUseCase(bookTitle)) {
                is ApiResult.Success<*> -> {
                    savedStateHandle[DISPLAY_BOOKS_UI_STATE] =
                        displayBooksUiState.value.copy(
                            books = (result.data as BookSearchResults).docs,
                            isLoading = false,
                            exception = null
                        )
                }
                is ApiResult.Failure -> {
                    savedStateHandle[DISPLAY_BOOKS_UI_STATE] = displayBooksUiState.value.copy(isLoading = false, exception = result.exception)
                }
            }
        }
    }

    fun consumeFetchEvent() {
        savedStateHandle[DISPLAY_BOOKS_UI_STATE] = DisplayBooksUiState()
    }
}