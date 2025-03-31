package com.example.fooddelivery.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

@Composable
fun FoodDeliveryTheme(content: @Composable () -> Unit) {
    CompositionLocalProvider(
            LocalAppColors provides extendedColors,
            LocalAppTypography provides extendedTypography,
    ) { MaterialTheme(content = content) }
}

object FoodDeliveryTheme{
    val colors: AppColors
        @Composable get() = LocalAppColors.current
}
