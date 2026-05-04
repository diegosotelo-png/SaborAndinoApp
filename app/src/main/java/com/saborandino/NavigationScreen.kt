package com.saborandino

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

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

        // MENU (lo hará tu compañero)
        composable("menu") {
            // MenuScreen(navController)
        }

        // PERFIL (lo harás luego)
        composable("perfil") {
            // PerfilScreen(navController)
        }

        // PEDIDO
        composable("pedido") {
            // PedidoScreen(navController)
        }

        // DETALLE CON ID (IMPORTANTE PARA EL PROFE)
        composable(
            route = "detalle/{id}",
            arguments = listOf(
                navArgument("id") { type = NavType.IntType }
            )
        ) { backStackEntry ->

            val id = backStackEntry.arguments?.getInt("id") ?: 0

            // DetalleScreen(id, navController)
        }
    }
}