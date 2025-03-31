
package com.example.fooddelivery.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontVariation
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.fooddelivery.R

// 1. Define the Unbounded Font Family (Variable Font)
val UnboundedFontFamily = FontFamily(
    Font(
        R.font.unbounded_wght, // Resource ID for the Unbounded font file
        variationSettings = FontVariation.Settings("wght" to 400f), // Regular weight
        weight = FontWeight.Normal // Explicitly set the weight
    ),
    Font(
        R.font.unbounded_wght,
        variationSettings = FontVariation.Settings("wght" to 700f), // Bold weight
        weight = FontWeight.Bold // Explicitly set the weight
    ),
    Font(
        R.font.unbounded_wght,
        variationSettings = FontVariation.Settings("wght" to 200f), // Extra Light weight
        weight = FontWeight.ExtraLight // Explicitly set the weight
    ),
)

// 2. Define your AppTypography data class
@Immutable
data class AppTypography(
    val headline: TextStyle,
    val titleLarge: TextStyle,
    val titleMedium: TextStyle,
    val titleSmall: TextStyle,
    val body: TextStyle,
    val bodySmall: TextStyle,
    val label: TextStyle,
)

// 3. Create a LocalAppTypography for providing the typography in your app
val LocalAppTypography = staticCompositionLocalOf {
    AppTypography(
        headline = TextStyle.Default,
        titleLarge = TextStyle.Default,
        titleMedium = TextStyle.Default,
        titleSmall = TextStyle.Default,
        body = TextStyle.Default,
        bodySmall = TextStyle.Default,
        label = TextStyle.Default,
    )
}

// 4. Define your extendedTypography using the UnboundedFontFamily
val extendedTypography =
    AppTypography(
        headline = TextStyle(
            fontFamily = UnboundedFontFamily,
            fontSize = 32.sp,
            fontWeight = FontWeight.Normal, // Use FontWeight.Normal for the default weight
        ),
        titleLarge = TextStyle(
            fontFamily = UnboundedFontFamily,
            fontSize = 24.sp,
            fontWeight = FontWeight.Normal // Use FontWeight.Normal for the default weight
        ),
        titleMedium = TextStyle(
            fontFamily = UnboundedFontFamily,
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal // Use FontWeight.Normal for the default weight
        ),
        titleSmall = TextStyle(
            fontFamily = UnboundedFontFamily,
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal // Use FontWeight.Normal for the default weight
        ),
        body = TextStyle(
            fontFamily = UnboundedFontFamily,
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal // Use FontWeight.Normal for the default weight
        ),
        bodySmall = TextStyle(
            fontFamily = UnboundedFontFamily,
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal // Use FontWeight.Normal for the default weight
        ),
        label = TextStyle(
            fontFamily = UnboundedFontFamily,
            fontSize = 11.sp,
            fontWeight = FontWeight.Light // Use FontWeight.Light for a lighter weight
        ),
    )
