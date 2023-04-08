package com.januscole.openlibrary.data.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class BookSearchResults(
    val docs: List<Book>,
    val numFound: Int,
    val numFoundExact: Boolean,
    val num_found: Int,
    val q: String,
    val start: Int
) : Parcelable
