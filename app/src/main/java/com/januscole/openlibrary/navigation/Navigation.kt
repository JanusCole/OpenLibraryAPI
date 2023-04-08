package com.januscole.openlibrary.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.januscole.openlibrary.components.BookDetailsScreen
import com.januscole.openlibrary.components.BooksListScreen
import com.januscole.openlibrary.components.BooksSearchScreen
import com.januscole.openlibrary.utils.decodeNavParameter

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = OpenLibraryScreenRoutes.BOOKS_SEARCH.route
    ) {
        composable(route = OpenLibraryScreenRoutes.BOOKS_SEARCH.route) {
            BooksSearchScreen(navController)
        }
        composable(
            route = "${OpenLibraryScreenRoutes.BOOKS_LIST.route}/{bookTitle}",
            arguments = listOf(navArgument("bookTitle") { type = NavType.StringType })
        ) { backStackEntry ->
            BooksListScreen(
                navController = navController,
                bookTitle = backStackEntry.arguments?.getString("bookTitle")?.decodeNavParameter()
            )
        }
        composable(
            route = "${OpenLibraryScreenRoutes.BOOK_DETAILS.route}/{bookTitle}/{bookId}",
            arguments = listOf(
                navArgument("bookTitle") { type = NavType.StringType },
                navArgument("bookId") { type = NavType.StringType })
        ) { backStackEntry ->
            BookDetailsScreen(
                navController = navController,
                bookTitle = backStackEntry.arguments?.getString("bookTitle")?.decodeNavParameter(),
                bookId = backStackEntry.arguments?.getString("bookId")?.decodeNavParameter()
            )
        }
    }
}