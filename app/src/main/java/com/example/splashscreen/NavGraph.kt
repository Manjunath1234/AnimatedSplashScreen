package com.example.splashscreen

import android.window.SplashScreen
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.splashscreen.screen.Screen
import com.example.splashscreen.screens.AnimatedSplashScreen
import com.example.splashscreen.screens.HomeScreen

@Composable
fun SetUpNavGraph(navHostController: NavHostController){
    NavHost(navController = navHostController, startDestination = Screen.SplashScreen.route ){
        composable(
            route=Screen.SplashScreen.route
        ){
            AnimatedSplashScreen(navHostController)
        }
        composable(
            route =Screen.HomeScreen.route
        ){
            HomeScreen(navHostController)
        }
    }
}