package com.swiggy.dsl.library

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import org.junit.Rule
import org.junit.Test

class WiFiPasswordViewerTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun whenTheButtonIsClickedThenShowPassword() {
        // given
        composeTestRule.setContent {
            StoreFrontTheme {
                var showPassword by remember { mutableStateOf(false) }
                WiFiPasswordViewer(
                    showPassword = showPassword,
                    buttonClicked = { showPassword = !showPassword }
                )
            }
        }

        composeTestRule
            .onNodeWithContentDescription("WiFi Password Text")
            .assertDoesNotExist()

        composeTestRule
            .onNodeWithContentDescription("WiFi Password Button")
            .assert(hasText("Show Password"))

        // when
        composeTestRule
            .onNodeWithContentDescription("WiFi Password Button")
            .performClick()

        // then
        composeTestRule
            .onNodeWithContentDescription("WiFi Password Text")
            .assertIsDisplayed()

        composeTestRule
            .onNodeWithContentDescription("WiFi Password Button")
            .assert(hasText("Hide Password"))
    }
}
