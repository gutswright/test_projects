package com.example.fooddelivery.ui.screen.components

import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Column
import com.example.fooddelivery.ui.screen.ProductDetailsScreen

@Composable
fun ProductPreviewSection(modifier: Modifier = Modifier) {
    val scrollableState = rememberScrollState()

    Column(
        modifier = modifier.verticalScroll(scrollableState)
    ) {
        ProductDetailsScreen()
    }
}