package com.januscole.openlibrary

import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import com.januscole.openlibrary.di.NetworkModule
import com.januscole.openlibrary.di.RepositoryModule
import com.januscole.openlibrary.di.UseCaseModule
import com.januscole.openlibrary.fixtures.MockBookSearchResults
import com.januscole.openlibrary.navigation.Navigation
import com.januscole.openlibrary.ui.theme.OpenLibraryTheme
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import dagger.hilt.android.testing.UninstallModules
import org.junit.Before
import org.junit.Rule
import org.junit.Test

@HiltAndroidTest
@UninstallModules(RepositoryModule::class, NetworkModule::class, UseCaseModule::class)
class BooksListScreenTest {

    @get:Rule(order = 0)
    val hiltRule = HiltAndroidRule(this)

    @get:Rule(order = 1)
    val composeRule = createAndroidComposeRule(MainActivity::class.java)

    @Before
    fun setUp() {
        hiltRule.inject()
        composeRule.activity.setContent {
            OpenLibraryTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Navigation()
                }
            }
        }
    }

    @Test
    fun search_valid_criteria() {
        val search = composeRule.activity.getString(R.string.search)
        val searchTextTestTag = composeRule.activity.getString(R.string.SEARCHTEXT_TEST_TAG)
        val bookDisplayBackButtonTestTag = composeRule.activity.getString(R.string.BOOK_DETAILS_BACK_BUTTON)
        val bookResultImageTestTag = composeRule.activity.getString(R.string.BOOK_RESULT_IMAGE)
        val bookImageTestTag = composeRule.activity.getString(R.string.BOOK_COVER_IMAGE)

        // A successful search navigates to the books screen and then to a specific book
        composeRule.onNodeWithTag(searchTextTestTag).performTextInput(MockBookSearchResults.VALID_BOOK_TITLE_SEARCH_CRITERIA)
        composeRule.onNodeWithText(search).performClick()
        composeRule.waitUntil {
            composeRule
                .onAllNodesWithTag(bookResultImageTestTag)
                .fetchSemanticsNodes().isNotEmpty()
        }
        composeRule.onAllNodesWithTag(bookResultImageTestTag)[0].performClick()
        composeRule.waitUntil {
            composeRule
                .onAllNodesWithTag(bookDisplayBackButtonTestTag)
                .fetchSemanticsNodes().size == 1
        }
        composeRule.onNodeWithTag(bookImageTestTag).assertIsDisplayed()
    }
}
