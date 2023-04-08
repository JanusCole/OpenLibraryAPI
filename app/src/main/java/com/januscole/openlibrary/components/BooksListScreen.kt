package com.januscole.openlibrary.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.januscole.openlibrary.R
import com.januscole.openlibrary.navigation.OpenLibraryScreenRoutes
import com.januscole.openlibrary.utils.encodeNavParameter
import com.januscole.openlibrary.viewmodels.BooksListViewModel

@Composable
fun BooksListScreen(
    navController: NavController,
    bookTitle: String,
    booksListViewModel: BooksListViewModel = hiltViewModel()
) {

    LaunchedEffect(Unit) {
        booksListViewModel.fetchBooks(bookTitle)
    }

    val uiState by booksListViewModel.displayBooksUiState.collectAsState()


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
                    modifier = Modifier.testTag(stringResource(R.string.BOOKS_LIST_BACK_BUTTON)),
                    onClick = {
                        navController.navigateUp()
                    }
                ) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = stringResource(R.string.return_to_search_screen),
                        tint = Color.Black,
                        modifier = Modifier.size(32.dp)
                    )
                }
                Text(
                    text = stringResource(R.string.search_results),
                    fontSize = MaterialTheme.typography.h4.fontSize
                )
                Spacer(modifier = Modifier.padding(horizontal = 32.dp))
            }
            uiState.books.let {
                LazyVerticalGrid(GridCells.Fixed(3)) {
                    items(items = it) {
                        BookCard(book = it, onClick = {
                            it.title?.let { title ->
                                navController.navigate(
                                    OpenLibraryScreenRoutes.BOOK_DETAILS.route + "/" + title.encodeNavParameter() + "/" + it.key.drop(
                                        7
                                    ).encodeNavParameter()
                                )
                            }
                        })
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
                    booksListViewModel.consumeFetchEvent()
                    navController.navigateUp()
                }
            }
        }
    }
}