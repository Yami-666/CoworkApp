package com.example.cowork.ui.screens.greeting

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cowork.ui.theme.Grey8C

@Composable
fun GreetingPageScreen(
    greetingImage: Painter,
    greetingTitle: String,
    content: String,
) {
    Column(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = greetingImage,
            contentDescription = "Room Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.65f),
        )

        Box(modifier = Modifier.padding(24.dp)) {
            Column {
                Text(
                    buildAnnotatedString {
                        val titleTrim = greetingTitle.trim()
                        val titleWithoutLastWord = titleTrim
                            .substringBeforeLast(" ")
                        val lastWord = titleTrim
                            .substringAfterLast(" ")

                        withStyle(
                            style = SpanStyle(
                                fontSize = 32.sp,
                                fontWeight = FontWeight.Medium
                            )
                        ) {
                            append(titleWithoutLastWord)
                            append("\n")
                        }
                        withStyle(
                            style = SpanStyle(
                                fontSize = 32.sp,
                                fontWeight = FontWeight.Bold
                            )
                        ) { append(lastWord) }
                    }
                )

                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 16.dp)
                ) {
                    Text(
                        text = content,
                        color = Grey8C,
                        modifier = Modifier
                            .wrapContentHeight()
                            .fillMaxWidth(0.7f),
                        fontWeight = FontWeight.Medium,
                    )
                }
            }
        }
    }
}