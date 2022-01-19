package com.swiggy.dsl.library

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun Surface(
    modifier: Modifier = Modifier,
    cornerSize: CornerSize = ZeroCornerSize,
    elevation: Dp = 0.dp,
    contentPadding: Dp = 0.dp,
    color: Color = Theme.colorScheme.backgroundPrimary,
    content: @Composable () -> Unit
) {
    val shape = RoundedCornerShape(cornerSize)

    Box(
        modifier = modifier
            .shadow(elevation, shape)
            .background(color, shape)
            .padding(contentPadding)
    ) {
        content.invoke()
    }
}

@Preview
@Composable
fun PreviewSurface() {
    Surface(
        contentPadding = 16.dp
    ) {
        BasicText("Hello, World!")
    }
}
