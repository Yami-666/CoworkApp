package com.example.cowork.ui.screens.bottom_nav

import com.example.cowork.R
import com.example.cowork.utils.navigation.NavScreens

sealed class BottomNavigationItem(
    val title: String,
    val icon: Int,
    val route: String,
) {
    object Profile : BottomNavigationItem(
        title = "Profile",
        icon = R.drawable.ic_profile,
        route = NavScreens.BottomNavigationScreens.ProfileScreen.route
    )

    object Event : BottomNavigationItem(
        title = "Event",
        icon = R.drawable.ic_ticket,
        route = NavScreens.BottomNavigationScreens.EventScreen.route
    )

    object Home : BottomNavigationItem(
        title = "Home",
        icon = R.drawable.ic_home,
        route = NavScreens.BottomNavigationScreens.HomeScreen.route
    )

    object Booked : BottomNavigationItem(
        title = "Booked",
        icon = R.drawable.ic_booked,
        route = NavScreens.BottomNavigationScreens.BookedScreen.route
    )

    object Favorite : BottomNavigationItem(
        title = "Favorite",
        icon = R.drawable.ic_bookmark,
        route = NavScreens.BottomNavigationScreens.FavoriteScreen.route
    )
}
