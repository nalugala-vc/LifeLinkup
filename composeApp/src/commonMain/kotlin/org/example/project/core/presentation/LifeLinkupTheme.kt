package org.example.project.core.presentation

import androidx.compose.runtime.Composable

@Composable
expect fun LifeLinkupTheme(
    darkTheme: Boolean,
    dynamicColor: Boolean,
    content: @Composable () -> Unit
)