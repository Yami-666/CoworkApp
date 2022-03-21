package com.example.cowork.utils.navigation

sealed class NavScreens(
    val route: String,
) {
    object SplashScreen : NavScreens("SplashScreen")

    object GreetingScreen : NavScreens("GreetingScreen")

    object SignInScreen : NavScreens("SignInScreen")
}
