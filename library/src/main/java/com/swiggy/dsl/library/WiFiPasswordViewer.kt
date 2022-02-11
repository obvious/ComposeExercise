package com.swiggy.dsl.library

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics

@Composable
fun WiFiPasswordViewer(
    showPassword: Boolean,
    buttonClicked: () -> Unit
) {
    Column {
        if (showPassword) {
            BasicText(
                text = "WiFi Password",
                modifier = Modifier.semantics {
                    contentDescription = "WiFi Password Text"
                }
            )
        }

        val buttonText = if (showPassword) {
            "Hide Password"
        } else {
            "Show Password"
        }
        Button(
            modifier = Modifier.semantics {
                contentDescription = "WiFi Password Button"
            },
            onClick = buttonClicked
        ) {
            BasicText(text = buttonText)
        }
    }
}
