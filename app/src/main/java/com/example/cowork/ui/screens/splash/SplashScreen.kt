package com.example.cowork.ui.screens.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cowork.R
import com.example.cowork.ui.theme.Silver

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SplashScreen() {
    Box(Modifier.fillMaxSize()) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.wrapContentSize()
                .align(Alignment.Center)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_worker_logo),
                    contentDescription = "Cowork Logo",
                    Modifier.wrapContentSize(),
                )

                Text(
                    text = "COWORK",
                    letterSpacing = 4.sp,
                    fontWeight = FontWeight.Bold,
                    fontSize = 32.sp,
                    modifier = Modifier
                        .wrapContentSize()
                        .padding(top = 4.dp),
                )
            }
        }

        Box(
            modifier = Modifier.wrapContentSize()
                .align(Alignment.BottomCenter)
        ) {
            Text(
                text = "Why do you want to motivate yourself?",
                color = Silver,
                modifier = Modifier
                    .wrapContentSize()
                    .padding(bottom = 42.dp),
            )
        }
    }
}
