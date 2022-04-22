package com.example.cowork.ui.theme.commons

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cowork.R
import com.example.cowork.ui.theme.DefaultBackgroundColor
import com.example.cowork.ui.theme.Grey94

@Composable
fun SearchWithSettings() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        SearchBar(
            placeholder = "Comfortable Coworking Space?",
            modifier = Modifier
                .weight(1f)
                .padding(end = 16.dp),
        )
        SettingsButton {

        }
    }
}

@Composable
fun SearchBar(
    modifier: Modifier = Modifier,
    placeholder: String = "",
) {
    var text by remember { mutableStateOf("") }

    TextField(
        modifier = modifier.height(48.dp),
        value = text,
        onValueChange = { newText ->
            text = newText
        },
        leadingIcon = {
            Icon(
                painter = painterResource(id = R.drawable.ic_search),
                contentDescription = "SearchBar"
            )
        },
        placeholder = {
            Text(
                text = placeholder,
                color = Grey94,
                fontSize = 14.sp
            )
        },
        singleLine = true,
        shape = RoundedCornerShape(16.dp),
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = DefaultBackgroundColor,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,
        ),
    )
}

@Composable
fun SettingsButton(
    modifier: Modifier = Modifier,
    onButtonClick: () -> Unit
) {
    IconButton(
        modifier = Modifier
            .size(48.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(color = DefaultBackgroundColor),
        onClick = onButtonClick
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_settings),
            contentDescription = "Settings",
        )
    }
}