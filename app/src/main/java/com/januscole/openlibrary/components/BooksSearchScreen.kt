package com.januscole.openlibrary.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.januscole.openlibrary.R
import com.januscole.openlibrary.navigation.OpenLibraryScreenRoutes
import com.januscole.openlibrary.utils.encodeNavParameter
import com.januscole.openlibrary.viewmodels.BooksSearchViewModel

@Composable
fun BooksSearchScreen(
    navController: NavController,
    bookSearchViewModel: BooksSearchViewModel = hiltViewModel()
) {

    val uiState by bookSearchViewModel.searchBooksUiState.collectAsState()
    var searchCriteria by remember { mutableStateOf("") }

    if (uiState.books.isNotEmpty()) {
        // This is my least favorite solution to the problem of one time consumable events in
        // JetPack Compose. However, this is what Google currently recommends and so resistance is futile
        // https://developer.android.com/topic/architecture/ui-layer/events#compose_2
        bookSearchViewModel.consumeSearchEvent()
        navController.navigate(OpenLibraryScreenRoutes.BOOKS_LIST.route + "/" + searchCriteria.encodeNavParameter())
    }

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
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = stringResource(id = R.string.app_name),
                    fontSize = MaterialTheme.typography.h4.fontSize
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                OutlinedTextField(
                    value = searchCriteria,
                    onValueChange = {
                        searchCriteria = it
                    },
                    maxLines = 1,
                    modifier = Modifier
                        .padding(horizontal = dimensionResource(id = R.dimen.standard_padding))
                        .fillMaxWidth()
                        .testTag(stringResource(R.string.SEARCHTEXT_TEST_TAG)),
                    singleLine = true,
                    trailingIcon = {
                        Icon(
                            Icons.Filled.Search,
                            contentDescription = stringResource(R.string.search_box_hint),
                            tint = Color.Black
                        )
                    },
                    colors = TextFieldDefaults.textFieldColors(
                        backgroundColor = Color.White
                    )
                )
            }
            Button(
                onClick = {
                    bookSearchViewModel.searchBooks(searchCriteria)
                },
                enabled = !uiState.isLoading && searchCriteria.isNotBlank(),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(dimensionResource(id = R.dimen.standard_padding))
                    .clip(RoundedCornerShape(dimensionResource(id = R.dimen.standard_corner_radius)))
                    .border(
                        border = BorderStroke(
                            dimensionResource(id = R.dimen.standard_border_width),
                            Color.Black
                        ),
                        shape = RoundedCornerShape(dimensionResource(id = R.dimen.standard_corner_radius))
                    )
            ) {
                Text(
                    text = stringResource(R.string.search),
                    style = MaterialTheme.typography.h5,
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(Alignment.CenterHorizontally)
                )
            }
            if (uiState.isLoading) {
                CircularProgressIndicator(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(dimensionResource(id = R.dimen.standard_padding))
                )
            }

            uiState.exception?.let {
                ErrorMessage(message = it.message ?: stringResource(R.string.standard_error_message)) {
                    bookSearchViewModel.consumeSearchEvent()
                }
            }
        }
    }
}
