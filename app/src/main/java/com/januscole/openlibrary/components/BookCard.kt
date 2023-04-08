package com.januscole.openlibrary.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
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
            .testTag(stringResource(R.string.BOOK_RESULT_IMAGE))
            .clickable {
                onClick()
            },
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (book.cover_i != null) {
            AsyncImage(
                model = String.format(
                    "https://covers.openlibrary.org/b/id/%s.jpg",
                    book.cover_i.toString()
                ),
                contentDescription = "Book Cover",
                placeholder = painterResource(
                    id = R.drawable.book_cover
                ),
                error = painterResource(
                    id = R.drawable.book_cover
                ),
                modifier = Modifier
                    .size(100.dp)
                    .wrapContentWidth(Alignment.Start)
                    .padding(5.dp, 0.dp)
            )
        } else {
            Image(
                painter = painterResource(
                    id = R.drawable.book_cover
                ),
                contentDescription = "Image",
                modifier = Modifier
                    .size(100.dp)
                    .wrapContentWidth(Alignment.Start)
                    .padding(5.dp, 0.dp)
            )
        }
        book.title?.let {
            Text(
                text = it
            )
        }
        book.author_name?.forEach {
            Text(
                text = it
            )
        }
    }
}
