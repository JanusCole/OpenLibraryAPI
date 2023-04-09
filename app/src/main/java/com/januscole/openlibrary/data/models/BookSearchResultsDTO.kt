package com.januscole.openlibrary.data.models

data class BookSearchResultsDTO(
    val docs: List<BookDTO>?,
    val numFound: Int?,
    val numFoundExact: Boolean?,
    val num_found: Int?,
    val q: String?,
    val start: Int?
)

fun BookSearchResultsDTO.toBookList(): List<IndividualBook> = docs?.mapNotNull { bookDTO -> bookDTO.toBook() } ?: listOf()
