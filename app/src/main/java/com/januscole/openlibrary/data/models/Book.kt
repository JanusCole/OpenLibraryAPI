package com.januscole.openlibrary.data.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Book(
    val _version_: Long? = null,
    val already_read_count: Int? = null,
    val author_alternative_name: List<String>? = null,
    val author_facet: List<String>? = null,
    val author_key: List<String>? = null,
    val author_name: List<String>? = null,
    val contributor: List<String>? = null,
    val cover_edition_key: String? = null,
    val cover_url: String? = null,
    val currently_reading_count: Int? = null,
    val ddc: List<String>? = null,
    val ddc_sort: String? = null,
    val ebook_access: String? = null,
    val ebook_count_i: Int? = null,
    val edition_count: Int? = null,
    val edition_key: List<String>? = null,
    val first_publish_year: Int? = null,
    val first_sentence: List<String>? = null,
    val has_fulltext: Boolean? = null,
    val ia: List<String>? = null,
    val ia_box_id: List<String>? = null,
    val ia_collection: List<String>? = null,
    val ia_collection_s: String? = null,
    val ia_loaded_id: List<String>? = null,
    val id_alibris_id: List<String>? = null,
    val id_amazon: List<String>? = null,
    val id_bcid: List<String>? = null,
    val id_better_world_books: List<String>? = null,
    val id_canadian_national_library_archive: List<String>? = null,
    val id_goodreads: List<String>? = null,
    val id_google: List<String>? = null,
    val id_librarything: List<String>? = null,
    val id_overdrive: List<String>? = null,
    val id_paperback_swap: List<String>? = null,
    val id_wikidata: List<String>? = null,
    val isbn: List<String>? = null,
    val key: String,
    val language: List<String>? = null,
    val last_modified_i: Int? = null,
    val lcc: List<String>? = null,
    val lcc_sort: String? = null,
    val lccn: List<String>? = null,
    val lending_edition_s: String? = null,
    val lending_identifier_s: String? = null,
    val number_of_pages_median: Int? = null,
    val oclc: List<String>? = null,
    val person: List<String>? = null,
    val person_facet: List<String>? = null,
    val person_key: List<String>? = null,
    val place: List<String>? = null,
    val place_facet: List<String>? = null,
    val place_key: List<String>? = null,
    val printdisabled_s: String? = null,
    val public_scan_b: Boolean? = null,
    val publish_date: List<String>? = null,
    val publish_place: List<String>? = null,
    val publish_year: List<Int>? = null,
    val publisher: List<String>? = null,
    val publisher_facet: List<String>? = null,
    val ratings_average: Double? = null,
    val ratings_count: Int? = null,
    val ratings_count_1: Int? = null,
    val ratings_count_2: Int? = null,
    val ratings_count_3: Int? = null,
    val ratings_count_4: Int? = null,
    val ratings_count_5: Int? = null,
    val ratings_sortable: Double? = null,
    val readinglog_count: Int? = null,
    val seed: List<String>? = null,
    val subject: List<String>? = null,
    val subject_facet: List<String>? = null,
    val subject_key: List<String>? = null,
    val subtitle: String? = null,
    val time: List<String>? = null,
    val time_facet: List<String>? = null,
    val time_key: List<String>? = null,
    val title: String? = null,
    val title_sort: String? = null,
    val title_suggest: String? = null,
    val type: String? = null,
    val want_to_read_count: Int? = null
) : Parcelable
