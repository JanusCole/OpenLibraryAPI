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
class BookDetailsScreenTest {

    @get:Rule(order = 0)
    val hiltRule = HiltAndroidRule(this)

    @get:Rule(order = 1)
    val composeRule = createAndroidComposeRule(MainActivity::class.java)

    @Before
    fun setUp() {
        hiltRule.inject()
        composeRule.activity.setContent {
            OpenLibraryTheme {
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
        val searchTextTestTag = composeRule.activity.getString(R.string.SEARCH_TEXT_TEST_TAG)
        val bookDisplayBackButtonTestTag =
            composeRule.activity.getString(R.string.BOOK_DETAILS_BACK_BUTTON_TEST_TAG)
        val bookResultImageTestTag =
            composeRule.activity.getString(R.string.BOOK_SEARCH_RESULT_TEST_TAG)
        val bookImageTestTag = composeRule.activity.getString(R.string.ASYNC_BOOK_COVER_IMAGE_TEST_TAG)

        // A successful search navigates to the books screen and then to a specific book
        composeRule.onNodeWithTag(searchTextTestTag)
            .performTextInput(MockBookSearchResults.VALID_BOOK_TITLE_SEARCH_CRITERIA)
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

    @Test
    fun search_criteria_with_no_book_cover() {
        val search = composeRule.activity.getString(R.string.search)
        val searchTextTestTag = composeRule.activity.getString(R.string.SEARCH_TEXT_TEST_TAG)
        val bookDisplayBackButtonTestTag =
            composeRule.activity.getString(R.string.BOOK_DETAILS_BACK_BUTTON_TEST_TAG)
        val bookResultImageTestTag =
            composeRule.activity.getString(R.string.BOOK_SEARCH_RESULT_TEST_TAG)
        val bookImageTestTag = composeRule.activity.getString(R.string.DEFAULT_BOOK_COVER_IMAGE_TEST_TAG)

        // A successful search navigates to the books screen
        // and then to a specific book but shows the default book cover
        composeRule.onNodeWithTag(searchTextTestTag)
            .performTextInput(MockBookSearchResults.VALID_BOOK_TITLE_SEARCH_CRITERIA)
        composeRule.onNodeWithText(search).performClick()
        composeRule.waitUntil {
            composeRule
                .onAllNodesWithTag(bookResultImageTestTag)
                .fetchSemanticsNodes().isNotEmpty()
        }
        composeRule.onAllNodesWithTag(bookResultImageTestTag)[2].performClick()
        composeRule.waitUntil {
            composeRule
                .onAllNodesWithTag(bookDisplayBackButtonTestTag)
                .fetchSemanticsNodes().size == 1
        }
        composeRule.onNodeWithTag(bookImageTestTag).assertIsDisplayed()
    }

    @Test
    fun failed_search_shows_error() {
        val search = composeRule.activity.getString(R.string.search)
        val errorTag = composeRule.activity.getString(R.string.ERROR_CONFIRMATION_BUTTON_TEST_TAG)
        val searchTextTestTag = composeRule.activity.getString(R.string.SEARCH_TEXT_TEST_TAG)
        val bookDisplayBackButtonTestTag =
            composeRule.activity.getString(R.string.BOOK_DETAILS_BACK_BUTTON_TEST_TAG)
        val bookResultImageTestTag =
            composeRule.activity.getString(R.string.BOOK_SEARCH_RESULT_TEST_TAG)

        composeRule.onNodeWithTag(searchTextTestTag)
            .performTextInput(MockBookSearchResults.VALID_BOOK_TITLE_SEARCH_CRITERIA)
        composeRule.onNodeWithText(search).performClick()
        composeRule.waitUntil {
            composeRule
                .onAllNodesWithTag(bookResultImageTestTag)
                .fetchSemanticsNodes().isNotEmpty()
        }
        composeRule.onAllNodesWithTag(bookResultImageTestTag)[1].performClick()
        composeRule.waitUntil {
            composeRule
                .onAllNodesWithTag(bookDisplayBackButtonTestTag)
                .fetchSemanticsNodes().size == 1
        }
        composeRule.waitUntil {
            composeRule
                .onAllNodesWithTag(errorTag)
                .fetchSemanticsNodes().size == 1
        }
        composeRule.onNodeWithTag(errorTag).assertIsDisplayed()
    }

    @Test
    fun clicking_OK_Button_on_error_dialog_dismisses_it() {
        val search = composeRule.activity.getString(R.string.search)
        val ok = composeRule.activity.getString(R.string.ERROR_CONFIRMATION_BUTTON_TEST_TAG)
        val errorTag = composeRule.activity.getString(R.string.ERROR_CONFIRMATION_BUTTON_TEST_TAG)
        val searchTextTestTag = composeRule.activity.getString(R.string.SEARCH_TEXT_TEST_TAG)
        val bookDisplayBackButtonTestTag =
            composeRule.activity.getString(R.string.BOOK_DETAILS_BACK_BUTTON_TEST_TAG)
        val bookResultImageTestTag =
            composeRule.activity.getString(R.string.BOOK_SEARCH_RESULT_TEST_TAG)

        composeRule.onNodeWithTag(searchTextTestTag)
            .performTextInput(MockBookSearchResults.VALID_BOOK_TITLE_SEARCH_CRITERIA)
        composeRule.onNodeWithText(search).performClick()
        composeRule.waitUntil {
            composeRule
                .onAllNodesWithTag(bookResultImageTestTag)
                .fetchSemanticsNodes().isNotEmpty()
        }
        composeRule.onAllNodesWithTag(bookResultImageTestTag)[1].performClick()
        composeRule.waitUntil {
            composeRule
                .onAllNodesWithTag(bookDisplayBackButtonTestTag)
                .fetchSemanticsNodes().size == 1
        }
        composeRule.waitUntil {
            composeRule
                .onAllNodesWithTag(errorTag)
                .fetchSemanticsNodes().size == 1
        }
        composeRule.onNodeWithTag(errorTag).assertIsDisplayed()
        composeRule.onNodeWithTag(ok).performClick()
        composeRule.onNodeWithTag(errorTag).assertDoesNotExist()
    }
}
