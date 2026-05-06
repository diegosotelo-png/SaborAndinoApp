package com.saborandino.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.saborandino.data.listaPlatos

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetallePlatoScreen(navController: NavController, platoId: Int) {

    val plato = listaPlatos.find { it.id == platoId }
    var cantidad by remember { mutableStateOf(1) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Detalle del plato") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Volver"
                        )
                    }
                }
            )
        }
    ) { paddingValues ->

        if (plato == null) {
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .padding(24.dp)
            ) {
                Text(
                    text = "Plato no encontrado",
                    style = MaterialTheme.typography.headlineSmall
                )
            }
        } else {
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .padding(20.dp)
                    .fillMaxSize()
            ) {

                AsyncImage(
                    model = plato.imagenUrl,
                    contentDescription = plato.nombre,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(230.dp)
                        .clip(RoundedCornerShape(18.dp)),
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.height(20.dp))

                Text(
                    text = plato.nombre,
                    style = MaterialTheme.typography.headlineMedium
                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = plato.descripcionCompleta,
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Precio: S/ ${plato.precio}",
                    style = MaterialTheme.typography.titleLarge
                )

                Spacer(modifier = Modifier.height(24.dp))

                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(16.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Cantidad",
                            style = MaterialTheme.typography.titleMedium
                        )

                        Row {
                            Button(
                                onClick = {
                                    if (cantidad > 1) {
                                        cantidad--
                                    }
                                }
                            ) {
                                Text("-")
                            }

                            Text(
                                text = cantidad.toString(),
                                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp),
                                style = MaterialTheme.typography.titleMedium
                            )

                            Button(
                                onClick = {
                                    cantidad++
                                }
                            ) {
                                Text("+")
                            }
                        }
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                Button(
                    onClick = {
                        navController.navigate("perfil")
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(55.dp)
                ) {
                    Text("Agregar al pedido")
                }
            }
        }
    }
}