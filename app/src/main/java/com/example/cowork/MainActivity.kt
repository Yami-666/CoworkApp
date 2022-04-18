package com.example.cowork

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cowork.ui.screens.bottom_nav.MainNavigationScreen
import com.example.cowork.ui.screens.splash.SplashScreen
import com.example.cowork.ui.screens.greeting.GreetingViewPagerScreen
import com.example.cowork.ui.screens.sign_in.SignInScreen
import com.example.cowork.ui.screens.sign_up.SignUpScreen
import com.example.cowork.ui.theme.CoworkTheme
import com.example.cowork.utils.navigation.NavScreens
import com.google.accompanist.pager.ExperimentalPagerApi

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoworkTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) { CoworkAppContent() }
            }
        }
    }
}


@OptIn(ExperimentalPagerApi::class)
@Composable
fun CoworkAppContent(
    navController: NavHostController = rememberNavController()
) {
    NavHost(navController = navController, startDestination = NavScreens.SplashScreen.route) {
        composable(NavScreens.SplashScreen.route) { SplashScreen() }
        composable(NavScreens.GreetingScreen.route) { GreetingViewPagerScreen(navController) }
        composable(NavScreens.SignInScreen.route) { SignInScreen() }
        composable(NavScreens.SignUpScreen.route) { SignUpScreen() }
        composable(NavScreens.MainScreen.route) { MainNavigationScreen() }
    }

    Handler(Looper.getMainLooper()).postDelayed({
        navController.navigate(NavScreens.MainScreen.route)
    }, 1500)
}

@Composable
fun DefaultPreview() {
    CoworkTheme {
        CoworkAppContent()
    }
}