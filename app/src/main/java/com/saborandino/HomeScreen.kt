package com.saborandino

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(navController: NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Bienvenido Diego",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(20.dp))

        // Botón ir al menú
        Button(
            onClick = {
                navController.navigate("menu")
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Ver Menú")
        }

        Spacer(modifier = Modifier.height(10.dp))

        // Botón ir al perfil
        Button(
            onClick = {
                navController.navigate("perfil")
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Mi Perfil")
        }
    }
}