package com.swiggy.dsl.library

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Surface(
        modifier = Modifier
            .padding(8.dp)
            .then(modifier),
        cornerSize = CornerSize(50),
        elevation = 8.dp,
        contentPadding = 8.dp
    ) {
        BasicText(
            "Hello, World!",
            style = Theme.typography.h1.copy(color = Theme.colorScheme.primary)
        )
    }
}

@Preview
@Composable
private fun HelloWorldLightPreview() {
    Column(
        modifier = Modifier.padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        StoreFrontTheme {
            Greeting()
        }
        GourmetTheme {
            Greeting()
        }
    }
}

@Preview
@Composable
private fun HelloWorldDarkPreview() {
    Column(
        modifier = Modifier.padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        StoreFrontTheme(isInDarkMode = true) {
            Greeting()
        }
        GourmetTheme(isInDarkMode = true) {
            Greeting()
        }
    }
}
