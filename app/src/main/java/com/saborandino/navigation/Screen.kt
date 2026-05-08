package com.saborandino.navigation

sealed class Screen(val route: String) {

    object Login : Screen("login")

    object Home : Screen("home")

    object Perfil : Screen("perfil")

    object Menu : Screen("menu")

    object Pedido : Screen("pedido")

    object DetallePlato : Screen("detalle/{id}") {
        fun createRoute(id: Int): String {
            return "detalle/$id"
        }
    }
}