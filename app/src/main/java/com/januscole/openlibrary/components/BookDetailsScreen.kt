package com.januscole.openlibrary.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.januscole.openlibrary.R
import com.januscole.openlibrary.viewmodels.BookDetailsViewModel

@Composable
fun BookDetailsScreen(
    navController: NavController,
    bookTitle: String?,
    bookId: String?,
    bookDetailsViewModel: BookDetailsViewModel = hiltViewModel()
) {

    LaunchedEffect(Unit) {
        if (bookId == null || bookTitle == null) {
            navController.navigateUp()
        } else {
            bookDetailsViewModel.fetchBook(bookTitle, bookId)
        }
    }

    val uiState by bookDetailsViewModel.bookDetailsUiState.collectAsState()

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = "Abstract Background",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()
        )
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                IconButton(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .testTag(stringResource(R.string.BOOK_DETAILS_BACK_BUTTON_TEST_TAG)),
                    onClick = {
                        navController.navigateUp()
                    }
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = stringResource(R.string.return_to_book_listing_screen),
                        tint = Color.Black,
                        modifier = Modifier.size(dimensionResource(id = R.dimen.back_button_size))
                    )
                }
                Text(
                    text = uiState.book?.title ?: stringResource(R.string.book_details),
                    modifier = Modifier
                        .padding(dimensionResource(id = R.dimen.standard_padding)),
                    fontSize = MaterialTheme.typography.h4.fontSize,
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.padding(horizontal = dimensionResource(id = R.dimen.back_button_size)))
            }
            uiState.book?.let { book ->
                Column(
                    modifier = Modifier
                        .testTag(stringResource(R.string.BOOK_COVER_IMAGE_TEST_TAG))
                        .fillMaxWidth(),
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
                                .height(dimensionResource(id = R.dimen.book_cover_full_size))
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
                                .size(dimensionResource(id = R.dimen.book_cover_full_size))
                                .padding(dimensionResource(id = R.dimen.standard_padding))
                        )
                    }
                    book.author_name?.forEach {
                        Text(
                            text = it
                        )
                    }
                }
            }
        }
        if (uiState.isLoading) {
            CircularProgressIndicator(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(dimensionResource(id = R.dimen.standard_padding))
            )
        }
        uiState.exception?.message?.let {
            ErrorMessage(message = it) {
                bookDetailsViewModel.consumeFetchEvent()
                navController.navigateUp()
            }
        }
    }
}
