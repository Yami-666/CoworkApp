package com.example.cowork.utils.navigation

sealed class NavScreens(
    val route: String,
) {
    sealed class BottomNavigationScreens(route: String) : NavScreens(route) {
        object ProfileScreen : BottomNavigationScreens("ProfileScreen")
        object EventScreen : BottomNavigationScreens("EventScreen")
        object HomeScreen : BottomNavigationScreens("HomeScreen")
        object BookedScreen : BottomNavigationScreens("BookedScreen")
        object FavoriteScreen : BottomNavigationScreens("FavoriteScreen")
    }

    object SplashScreen : NavScreens("SplashScreen")

    object GreetingScreen : NavScreens("GreetingScreen")

    object SignInScreen : NavScreens("SignInScreen")
}
