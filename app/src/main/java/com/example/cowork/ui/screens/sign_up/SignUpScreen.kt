package com.example.cowork.ui.screens.sign_up

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cowork.R
import com.example.cowork.ui.screens.greeting.TitleText
import com.example.cowork.ui.screens.sign_in.OAuthServices
import com.example.cowork.ui.theme.*

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Hello() {
    SignUpScreen()
}

@Composable
fun SignUpScreen() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(state = scrollState),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp),
                contentScale = ContentScale.Crop,
                painter = painterResource(R.drawable.sign_up_image_background),
                contentDescription = "Sing Up image background"
            )

            Box(modifier = Modifier.padding(16.dp)) {
                Column {
                    TitleText(
                        modifier = Modifier.padding(bottom = 24.dp),
                        text = "Welcome,\nRegister To Access"
                    )

                    CoworkTextField(
                        title = "Your Name",
                        placeholder = "Your Awesome Name",
                    )

                    Spacer(modifier = Modifier.padding(vertical = 4.dp))

                    CoworkTextField(
                        title = "Email",
                        placeholder = "Youremail@email.com",
                    )

                    Spacer(modifier = Modifier.padding(vertical = 4.dp))

                    CoworkTextField(
                        title = "Password",
                        placeholder = "Password",
                        visualTransformation = PasswordVisualTransformation()
                    )

                    Spacer(modifier = Modifier.padding(vertical = 4.dp))

                    CoworkTextField(
                        title = "Password Again",
                        placeholder = "Password",
                        visualTransformation = PasswordVisualTransformation()
                    )

                    OAuthServices(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 16.dp)
                    )
                }
            }
        }

        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            CoworkButton(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 32.dp),
                text = "Register",
            )

            Text(
                text = "Already have an account? Sign In",
                color = Grey8C
            )
        }
    }
}

