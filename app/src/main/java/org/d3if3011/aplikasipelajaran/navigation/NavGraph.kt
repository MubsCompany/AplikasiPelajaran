package org.d3if3011.aplikasipelajaran.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.d3if3011.aplikasipelajaran.ui.screen.DashboardScreen
import org.d3if3011.aplikasipelajaran.ui.screen.MainScreen
import org.d3if3011.aplikasipelajaran.ui.screen.ProfileScreen

@Composable
fun SetupNavGraph(navController: NavHostController = rememberNavController()) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route,
        builder = {
            composable(route = Screen.Home.route) {
                MainScreen(navController)
            }
            composable(route = Screen.Dashboard.route + "/{id}") { navBackStack ->
                val username = navBackStack.arguments?.getString("id")
                DashboardScreen(username, navController)
            }
            composable(route = Screen.Profile.route + "/{id}") { navBackStack ->
                val username = navBackStack.arguments?.getString("id")
                ProfileScreen(username, navController)
            }
        }
    )
}