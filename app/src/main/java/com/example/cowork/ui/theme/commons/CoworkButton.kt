package com.example.cowork.ui.theme.commons

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cowork.ui.theme.Purple200

@Composable
fun CoworkButton(
    modifier: Modifier = Modifier,
    text: String = ""
) {
    Button(
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(backgroundColor = Purple200),
        onClick = { /*TODO*/ },
    ) {
        Text(
            modifier = Modifier.padding(vertical = 12.dp),
            text = text,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 16.sp
        )
    }
}
