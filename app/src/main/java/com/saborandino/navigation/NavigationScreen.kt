package com.saborandino.navigation

import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.saborandino.screens.HomeScreen
import com.saborandino.screens.LoginScreen
import com.saborandino.screens.PerfilScreen
import com.saborandino.screens.MenuScreen
import com.saborandino.screens.DetallePlatoScreen

@Composable
fun AppNavigation(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = "login"
    ) {

        // LOGIN
        composable("login") {
            LoginScreen(navController)
        }

        // HOME
        composable("home") {
            HomeScreen(navController)
        }

        // PERFIL / PEDIDO
        composable("perfil") {
            PerfilScreen(navController)
        }

        // MENU (compañero)
        composable("menu") {
            MenuScreen(navController)
        }

        // PEDIDO (por si lo llamas separado)
        composable("pedido") {
            Text("Pantalla Pedido en desarrollo")
        }

        composable("detalle/{id}") { backStackEntry ->

            val id = backStackEntry.arguments
                ?.getString("id")
                ?.toIntOrNull() ?: 0

            DetallePlatoScreen(navController, id)
        }
    }
}