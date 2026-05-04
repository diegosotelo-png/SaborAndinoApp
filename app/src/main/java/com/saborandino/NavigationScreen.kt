package com.saborandino

import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

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
            Text("Pantalla Menú en desarrollo")
        }

        // PEDIDO (por si lo llamas separado)
        composable("pedido") {
            Text("Pantalla Pedido en desarrollo")
        }

        // DETALLE (placeholder)
        composable("detalle/{id}") {
            Text("Detalle en desarrollo")
        }
    }
}