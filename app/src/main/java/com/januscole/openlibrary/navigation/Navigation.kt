package com.januscole.openlibrary.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.januscole.openlibrary.components.BooksSearchScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = OpenLibraryScreenRoutes.BOOKS_SEARCH.route) {
        composable(route = OpenLibraryScreenRoutes.BOOKS_SEARCH.route) {
            BooksSearchScreen(navController)
        }
    }
}