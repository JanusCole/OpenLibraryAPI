package com.januscole.openlibrary.components

import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import com.januscole.openlibrary.R

@Composable
fun ErrorMessage(message: String, onClick: () -> Unit) {

    AlertDialog(
        onDismissRequest = { onClick() },
        title = { Text(text = stringResource(R.string.error)) },
        text = {
            Text(
                text = message
            )
        },
        confirmButton = {
            Button(
                modifier = Modifier.testTag(stringResource(R.string.ERROR_CONFIRMATION_BUTTON)),
                onClick = { onClick() }
            ) {
                Text(text = stringResource(R.string.ok))
            }
        }
    )
}
