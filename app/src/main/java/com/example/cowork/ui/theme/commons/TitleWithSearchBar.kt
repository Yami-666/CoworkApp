package com.example.cowork.ui.theme.commons

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TitleWithSearchBar() {
    Column {
        TitleText(text = "More Productive\nwith Comfortable Place")

        Spacer(modifier = Modifier.padding(16.dp))

        SearchWithSettings()
    }
}