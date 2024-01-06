package com.example.navigationdrawer.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.navigationdrawer.screen.ChatScreen
import com.example.navigationdrawer.screen.FavouriteScreen
import com.example.navigationdrawer.screen.HomeScreen
import com.example.navigationdrawer.screen.SettingScreen

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screens.HomeScreen.route) {
        Screens.values().forEach { screen ->
            composable(screen.route) {
                when (screen) {
                    Screens.HomeScreen -> HomeScreen()
                    Screens.ChatScreen -> ChatScreen()
                    Screens.FavouriteScreen -> FavouriteScreen()
                    Screens.SettingScreen -> SettingScreen()
                }
            }
        }
    }
}

