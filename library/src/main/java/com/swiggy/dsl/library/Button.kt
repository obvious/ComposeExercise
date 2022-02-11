package com.swiggy.dsl.library

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Button(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    content: @Composable RowScope.() -> Unit
) {
    val buttonBackgroundColor = Theme.colorScheme.primary

    Surface(
        modifier = Modifier
            .clickable { onClick() }
            .then(modifier),
        cornerSize = CornerSize(4.dp),
        color = buttonBackgroundColor
    ) {
        Row(
            modifier = Modifier.defaultMinSize(minWidth = 58.dp),
            horizontalArrangement = Arrangement.Center,
        ) {
            content()
        }
    }
}

@Preview
@Composable
fun StoreFrontButtonPreview() {
    StoreFrontTheme(isInDarkMode = true) {
        Button(
            onClick = {}
        ) {
            BasicText(text = "Add")
        }
    }
}

@Preview
@Composable
fun GourmetButtonPreview() {
    GourmetTheme(isInDarkMode = true) {
        Button(onClick = {}) {
            BasicText(text = "Add")
        }
    }
}
