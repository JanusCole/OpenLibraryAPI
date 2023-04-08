package com.januscole.openlibrary.data

sealed class BookResult {
    data class Success<out T>(val data: T) : BookResult()
    data class Failure(val exception: Exception) : BookResult()
}
