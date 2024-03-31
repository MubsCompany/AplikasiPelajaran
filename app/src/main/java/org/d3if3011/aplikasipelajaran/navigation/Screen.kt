package org.d3if3011.aplikasipelajaran.navigation

sealed class Screen(val route: String) {
    data object Home: Screen("mainScreen")
    data object Profile: Screen("profile")
    data object Dashboard: Screen("dashboard")
}