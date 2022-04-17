package com.example.cowork.features.sign_in.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cowork.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SignInScreen() {
    val scrollState = rememberScrollState()
    Column(Modifier.verticalScroll(state = scrollState)) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .height(220.dp),
            contentScale = ContentScale.Crop,
            painter = painterResource(R.drawable.sign_in_image_background),
            contentDescription = "Sing In image background"
        )
        
        Text(
            text = "Welcome,\nPlease Login First"
        )

        CoworkTextField(
            title = "Email",
            label = "Youremail@email.com",
        )

        CoworkTextField(
            title = "Password",
            label = "Password",
            visualTransformation = PasswordVisualTransformation()
        )
    }
}

@Composable
fun CoworkTextField(
    modifier: Modifier = Modifier,
    title: String = "",
    label: String = "",
    visualTransformation: VisualTransformation = VisualTransformation.None,
) {
    var text by remember { mutableStateOf("") }

    Column {
        Text(
            text = title,
            Modifier.padding(bottom = 12.dp),
            fontWeight = FontWeight.Bold
        )

        OutlinedTextField(
            modifier = modifier.wrapContentSize(),
            value = text,
            onValueChange = { newText ->
                text = newText
            },
            label = { Text(text = label) },
            singleLine = true,
            shape = RoundedCornerShape(4.dp,),
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.White
            ),
            visualTransformation = visualTransformation
        )
    }
}