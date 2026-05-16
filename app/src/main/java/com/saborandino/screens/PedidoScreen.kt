package com.saborandino.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.saborandino.data.calcularTotalPedido
import com.saborandino.data.listaPedido

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PedidoScreen(navController: NavHostController) {

    val total = calcularTotalPedido()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Mi Pedido") },
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

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            item {
                Text(
                    text = "Platos agregados",
                    style = MaterialTheme.typography.titleLarge
                )
            }

            if (listaPedido.isEmpty()) {
                item {
                    Card(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(modifier = Modifier.padding(20.dp)) {
                            Text("No hay platos agregados todavía.")
                        }
                    }
                }
            } else {
                items(listaPedido) { itemPedido ->

                    val subtotal = itemPedido.plato.precio * itemPedido.cantidad

                    Card(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Column(modifier = Modifier.padding(16.dp)) {

                            Text(
                                text = itemPedido.plato.nombre,
                                style = MaterialTheme.typography.titleMedium
                            )

                            Spacer(modifier = Modifier.height(6.dp))

                            Text("Cantidad: ${itemPedido.cantidad}")
                            Text("Precio unitario: S/ %.2f".format(itemPedido.plato.precio))
                            Text("Subtotal: S/ %.2f".format(subtotal))
                        }
                    }
                }
            }

            item {
                Card(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(modifier = Modifier.padding(20.dp)) {

                        HorizontalDivider()

                        Spacer(modifier = Modifier.height(10.dp))

                        Text(
                            text = "Total: S/ %.2f".format(total),
                            style = MaterialTheme.typography.titleLarge
                        )
                    }
                }
            }
        }
    }
}