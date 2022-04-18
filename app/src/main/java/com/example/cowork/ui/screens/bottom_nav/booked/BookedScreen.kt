package com.example.cowork.ui.screens.bottom_nav.booked

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.cowork.ui.theme.DefaultBackgroundColor

@Composable
fun BookedScreen(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(DefaultBackgroundColor)
    ) {
        Text(text = "BookedScreeen")
    }
}