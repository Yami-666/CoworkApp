package com.example.cowork.ui.screens.bottom_nav

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cowork.ui.screens.bottom_nav.booked.BookedScreen
import com.example.cowork.ui.screens.bottom_nav.event.EventScreen
import com.example.cowork.ui.screens.bottom_nav.favorite.FavoriteScreen
import com.example.cowork.ui.screens.bottom_nav.home.HomeScreen
import com.example.cowork.ui.screens.bottom_nav.profile.ProfileScreen
import com.example.cowork.utils.navigation.NavScreens

@Composable
fun MainNavigationScreen(
    navController: NavController = rememberNavController()
) {
    Scaffold(
        bottomBar = { BottomNavigation(navController) },
    ) {
        NavigationGraph(navController = navController as NavHostController)
    }
}

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(navController, startDestination = BottomNavigationItem.Home.route) {
        composable(NavScreens.BottomNavigationScreens.HomeScreen.route) { HomeScreen(navController) }
        composable(NavScreens.BottomNavigationScreens.ProfileScreen.route) { ProfileScreen(navController) }
        composable(NavScreens.BottomNavigationScreens.FavoriteScreen.route) { FavoriteScreen(navController) }
        composable(NavScreens.BottomNavigationScreens.BookedScreen.route) { BookedScreen(navController) }
        composable(NavScreens.BottomNavigationScreens.EventScreen.route) { EventScreen(navController) }
    }
}