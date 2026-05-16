package com.saborandino.data

data class PedidoItem(
    val plato: Plato,
    val cantidad: Int
)

val listaPedido = mutableListOf<PedidoItem>()

fun agregarAlPedido(plato: Plato, cantidad: Int) {
    val existente = listaPedido.find { it.plato.id == plato.id }

    if (existente != null) {
        listaPedido.remove(existente)
        listaPedido.add(
            PedidoItem(
                plato = plato,
                cantidad = existente.cantidad + cantidad
            )
        )
    } else {
        listaPedido.add(
            PedidoItem(
                plato = plato,
                cantidad = cantidad
            )
        )
    }
}

fun calcularTotalPedido(): Double {
    return listaPedido.sumOf { it.plato.precio * it.cantidad }
}