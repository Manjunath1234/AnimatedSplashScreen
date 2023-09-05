package com.example.splashscreen.screen

sealed class Screen(val route:String) {
    object SplashScreen:Screen(route = "splash_screen")
    object HomeScreen:Screen(route = "home_screen")
}