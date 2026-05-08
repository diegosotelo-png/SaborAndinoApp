package com.saborandino.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.saborandino.screens.DetallePlatoScreen
import com.saborandino.screens.HomeScreen
import com.saborandino.screens.LoginScreen
import com.saborandino.screens.MenuScreen
import com.saborandino.screens.PedidoScreen
import com.saborandino.screens.PerfilScreen

@Composable
fun AppNavigation(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = Screen.Login.route
    ) {

        composable(Screen.Login.route) {
            LoginScreen(navController)
        }

        composable(Screen.Home.route) {
            HomeScreen(navController)
        }

        composable(Screen.Perfil.route) {
            PerfilScreen(navController)
        }

        composable(Screen.Menu.route) {
            MenuScreen(navController)
        }

        composable(Screen.Pedido.route) {
            PedidoScreen(navController)
        }

        composable(Screen.DetallePlato.route) { backStackEntry ->

            val id = backStackEntry.arguments
                ?.getString("id")
                ?.toIntOrNull() ?: 0

            DetallePlatoScreen(navController, id)
        }
    }
}