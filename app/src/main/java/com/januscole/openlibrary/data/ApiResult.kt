package com.januscole.openlibrary.data

sealed class ApiResult {
    data class Success<out T>(val data: T) : ApiResult()
    data class Failure(val exception: Exception) : ApiResult()
}
