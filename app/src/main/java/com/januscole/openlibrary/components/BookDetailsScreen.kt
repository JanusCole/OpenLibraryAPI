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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
            contentScale = ContentScale.FillBounds, // or some other scale
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
                    modifier = Modifier.testTag(stringResource(R.string.BOOK_DETAILS_BACK_BUTTON)),
                    onClick = {
                        navController.navigateUp()
                    }
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = stringResource(R.string.return_to_book_listing_screen),
                        tint = Color.Black,
                        modifier = Modifier.size(32.dp)
                    )
                }
                Text(
                    text = uiState.book?.title ?: stringResource(R.string.book_details),
                    modifier = Modifier
                        .padding(15.dp, 10.dp),
                    fontSize = 32.sp
                )
                Spacer(modifier = Modifier.padding(horizontal = 32.dp))
            }
            uiState.book?.let { book ->
                Column(
                    modifier = Modifier
                        .testTag(stringResource(R.string.BOOK_COVER_IMAGE))
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    if (book.cover_url != null) {
                        AsyncImage(
                            model = book.cover_url,
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
                            contentDescription = stringResource(R.string.book_cover_image),
                            modifier = Modifier
                                .size(100.dp)
                                .wrapContentWidth(Alignment.Start)
                                .padding(5.dp, 0.dp)
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
                    .padding(10.dp)
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
