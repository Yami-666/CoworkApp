package com.example.cowork.ui.screens.sign_in

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cowork.R
import com.example.cowork.ui.theme.Grey8C
import com.example.cowork.ui.theme.commons.CoworkButton
import com.example.cowork.ui.theme.commons.CoworkTextFieldWithTitle
import com.example.cowork.ui.theme.commons.TitleText

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Hello() {
    SignInScreen()
}

@Composable
fun SignInScreen() {
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
                    .height(220.dp),
                contentScale = ContentScale.Crop,
                painter = painterResource(R.drawable.sign_in_image_background),
                contentDescription = "Sing In image background"
            )

            Box(modifier = Modifier.padding(16.dp)) {
                Column {
                    TitleText(
                        modifier = Modifier.padding(bottom = 24.dp),
                        text = "Welcome,\nPlease Login First"
                    )

                    CoworkTextFieldWithTitle(
                        title = "Email",
                        placeholder = "Youremail@email.com",
                    )

                    Spacer(modifier = Modifier.padding(vertical = 8.dp))

                    CoworkTextFieldWithTitle(
                        title = "Password",
                        placeholder = "Password",
                        visualTransformation = PasswordVisualTransformation()
                    )

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 16.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                    ) {
                        OAuthServices()

                        Text(
                            text = "Forgot your password?",
                            color = Grey8C
                        )
                    }
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
                    .padding(bottom = 48.dp),
                text = "Login",
            )

            Text(
                text = "Don’t Have An Account yet? Register",
                color = Grey8C
            )
        }
    }
}

