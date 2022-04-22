package com.example.cowork.ui.theme.commons

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun CoworkTextFieldWithTitle(
    modifier: Modifier = Modifier,
    title: String = "",
    placeholder: String = "",
    visualTransformation: VisualTransformation = VisualTransformation.None,
) {

    Column {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 4.dp)
        )

        DefaultTextField(modifier, placeholder, visualTransformation)
    }
}