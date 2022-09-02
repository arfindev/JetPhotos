package com.example.jetphotos.presentation.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home_screen")
    object Search : Screen("search_screen")
    object Categories : Screen("categories_screen")
    object Saved : Screen("saved_screen")
}