package com.example.cowork.ui.theme.commons

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.example.cowork.ui.theme.BackgroundF6
import com.example.cowork.ui.theme.Mikado

@Composable
fun DefaultTextField(
    modifier: Modifier = Modifier,
    placeholder: String = "",
    visualTransformation: VisualTransformation = VisualTransformation.None,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
) {
    var text by remember { mutableStateOf("") }

    TextField(
        modifier = modifier
            .fillMaxWidth(),
        value = text,
        onValueChange = { newText ->
            text = newText
        },
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
        placeholder = {
            Text(
                text = placeholder,
                color = Mikado,
            )
        },
        singleLine = true,
        shape = RoundedCornerShape(8.dp),
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = BackgroundF6,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,
        ),
        visualTransformation = visualTransformation
    )
}