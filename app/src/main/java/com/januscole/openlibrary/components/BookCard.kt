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
import com.januscole.openlibrary.data.models.IndividualBook

@Composable
fun BookCard(
    onClick: () -> Unit,
    book: IndividualBook
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .testTag(stringResource(R.string.BOOK_RESULT_IMAGE))
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
                    .size(dimensionResource(id = R.dimen.book_cover_thumbnail_size))
                    .wrapContentWidth(Alignment.CenterHorizontally)
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
