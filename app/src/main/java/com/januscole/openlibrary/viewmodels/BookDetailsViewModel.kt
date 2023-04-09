package com.januscole.openlibrary.viewmodels

import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.januscole.openlibrary.data.BookResult
import com.januscole.openlibrary.data.models.Book
import com.januscole.openlibrary.use_cases.FetchBookUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.launch
import kotlinx.parcelize.Parcelize

const val BOOK_DETAILS_UI_STATE = "BOOK_DETAILS_UI_STATE"

@HiltViewModel
class BookDetailsViewModel @Inject constructor(
    private val fetchBookUseCase: FetchBookUseCase,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {

    @Parcelize
    data class BookDetailsUiState(
        val book: Book? = null,
        val isLoading: Boolean = false,
        val exception: Throwable? = null
    ) : Parcelable

    val bookDetailsUiState = savedStateHandle.getStateFlow(BOOK_DETAILS_UI_STATE, BookDetailsUiState())

    fun fetchBook(bookTitle: String, bookId: String) {
        viewModelScope.launch {
            savedStateHandle[BOOK_DETAILS_UI_STATE] = bookDetailsUiState.value.copy(isLoading = true)
            when (val result = fetchBookUseCase(bookTitle, bookId)) {
                is BookResult.Success<*> -> {
                    try {
                        savedStateHandle[BOOK_DETAILS_UI_STATE] =
                            bookDetailsUiState.value.copy(
                                book = result.data as Book,
                                isLoading = false,
                                exception = null
                            )
                    } catch (e: Exception) {
                        // In case the cast to IndividualBook fails
                        savedStateHandle[BOOK_DETAILS_UI_STATE] = bookDetailsUiState.value.copy(
                            isLoading = false,
                            exception = Exception(e.message)
                        )
                    }
                }
                is BookResult.Failure -> {
                    savedStateHandle[BOOK_DETAILS_UI_STATE] = bookDetailsUiState.value.copy(isLoading = false, exception = result.exception)
                }
            }
        }
    }

    fun consumeFetchEvent() {
        savedStateHandle[BOOK_DETAILS_UI_STATE] = BookDetailsUiState()
    }
}
