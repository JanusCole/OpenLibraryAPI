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
class BookSearchScreenTest {

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
    fun search_button_is_displayed() {
        val search = composeRule.activity.getString(R.string.search)

        // Make sure the Search button appears
        composeRule.onNodeWithText(search).assertIsDisplayed()
    }

    @Test
    fun search_button_is_disabled() {
        val search = composeRule.activity.getString(R.string.search)

        // Make sure the Search button is disabled before a search term is entered
        composeRule.onNodeWithText(search).assertIsNotEnabled()
    }

    @Test
    fun search_button_is_enabled() {
        val search = composeRule.activity.getString(R.string.search)
        val searchTextTestTag = composeRule.activity.getString(R.string.SEARCH_TEXT_TEST_TAG)

        // Make sure the Search button is enabled when a search term is entered
        composeRule.onNodeWithTag(searchTextTestTag)
            .performTextInput(MockBookSearchResults.VALID_BOOK_TITLE_SEARCH_CRITERIA)
        composeRule.onNodeWithText(search).assertIsEnabled()
    }

    @Test
    fun empty_result_shows_error_message() {
        val search = composeRule.activity.getString(R.string.search)
        val error = composeRule.activity.getString(R.string.error)
        val searchTextTestTag = composeRule.activity.getString(R.string.SEARCH_TEXT_TEST_TAG)

        // An unsuccessful search displays an error screen
        composeRule.onNodeWithTag(searchTextTestTag)
            .performTextInput(MockBookSearchResults.INVALID_BOOK_TITLE_SEARCH_CRITERIA)
        composeRule.onNodeWithText(search).performClick()
        composeRule.waitUntil {
            composeRule
                .onAllNodesWithText(error)
                .fetchSemanticsNodes().size == 1
        }
        composeRule.onNodeWithText(error).assertIsDisplayed()
    }

    @Test
    fun runtime_exception_produces_error() {
        val search = composeRule.activity.getString(R.string.search)
        val errorTag = composeRule.activity.getString(R.string.ERROR_CONFIRMATION_BUTTON_TEST_TAG)
        val searchTextTestTag = composeRule.activity.getString(R.string.SEARCH_TEXT_TEST_TAG)

        // Getting a runtime exception displays an error screen
        composeRule.onNodeWithTag(searchTextTestTag)
            .performTextInput(MockBookSearchResults.ERROR_TITLE_SEARCH_CRITERIA)
        composeRule.onNodeWithText(search).performClick()
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
        val errorTag = composeRule.activity.getString(R.string.ERROR_CONFIRMATION_BUTTON_TEST_TAG)
        val ok = composeRule.activity.getString(R.string.ERROR_CONFIRMATION_BUTTON_TEST_TAG)
        val searchTextTestTag = composeRule.activity.getString(R.string.SEARCH_TEXT_TEST_TAG)

        // An unsuccessful search displays an error screen
        composeRule.onNodeWithTag(searchTextTestTag)
            .performTextInput(MockBookSearchResults.ERROR_TITLE_SEARCH_CRITERIA)
        composeRule.onNodeWithText(search).performClick()
        composeRule.waitUntil {
            composeRule
                .onAllNodesWithTag(errorTag)
                .fetchSemanticsNodes().size == 1
        }
        composeRule.onNodeWithTag(ok).performClick()
        composeRule.onNodeWithTag(errorTag).assertDoesNotExist()
    }
}
