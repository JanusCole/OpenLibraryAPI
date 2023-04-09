package com.januscole.openlibrary.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import coil.compose.AsyncImage
import com.januscole.openlibrary.R
import com.januscole.openlibrary.data.models.Book

@Composable
fun BookCard(
    onClick: () -> Unit,
    book: Book
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .testTag(stringResource(R.string.BOOK_SEARCH_RESULT_TEST_TAG))
            .clickable {
                onClick()
            },
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (book.cover_url != null) {
            AsyncImage(
                model = book.cover_url,
                contentDescription = stringResource(R.string.book_cover),
                placeholder = painterResource(
                    id = R.drawable.book_cover
                ),
                error = painterResource(
                    id = R.drawable.book_cover
                ),
                modifier = Modifier
                    .testTag(stringResource(R.string.ASYNC_BOOK_COVER_IMAGE_TEST_TAG))
                    .height(dimensionResource(id = R.dimen.book_cover_thumbnail_size))
                    .padding(dimensionResource(id = R.dimen.standard_padding))
            )
        } else {
            Image(
                painter = painterResource(
                    id = R.drawable.book_cover
                ),
                contentDescription = stringResource(R.string.book_cover),
                modifier = Modifier
                    .testTag(stringResource(R.string.DEFAULT_BOOK_COVER_IMAGE_TEST_TAG))
                    .size(dimensionResource(id = R.dimen.book_cover_thumbnail_size))
                    .padding(dimensionResource(id = R.dimen.standard_padding))
            )
        }
        book.title?.let {
            Text(
                text = it,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.ExtraBold
            )
        }
        book.author_name?.forEach {
            Text(
                text = it,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally),
                textAlign = TextAlign.Center
            )
        }
    }
}
