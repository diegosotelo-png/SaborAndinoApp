package com.saborandino.data

data class Plato(
    val id: Int,
    val nombre: String,
    val descripcionCorta: String,
    val descripcionCompleta: String,
    val precio: Double,
    val categoria: String,
    val imagenUrl: String
)

val listaPlatos = listOf(
    Plato(
        id = 1,
        nombre = "Causa limeña",
        descripcionCorta = "Entrada de papa amarilla con pollo.",
        descripcionCompleta = "La causa limeña es una entrada tradicional peruana preparada con papa amarilla, ají amarillo, limón y un relleno de pollo con mayonesa.",
        precio = 12.00,
        categoria = "Entradas",
        imagenUrl = "https://upload.wikimedia.org/wikipedia/commons/7/7e/Causa_lime%C3%B1a.jpg"
    ),
    Plato(
        id = 2,
        nombre = "Papa a la huancaína",
        descripcionCorta = "Papa sancochada con crema huancaína.",
        descripcionCompleta = "Plato típico peruano preparado con papas sancochadas bañadas en una crema hecha con ají amarillo, queso fresco, leche y galleta.",
        precio = 10.00,
        categoria = "Entradas",
        imagenUrl = "https://upload.wikimedia.org/wikipedia/commons/4/4e/Papa_a_la_huancaina.jpg"
    ),
    Plato(
        id = 3,
        nombre = "Lomo saltado",
        descripcionCorta = "Carne salteada con papas y arroz.",
        descripcionCompleta = "El lomo saltado es un plato de fondo peruano preparado con carne de res, cebolla, tomate, papas fritas y arroz.",
        precio = 24.00,
        categoria = "Platos de Fondo",
        imagenUrl = "https://upload.wikimedia.org/wikipedia/commons/c/ca/Lomo-saltado-perudelights.jpg"
    ),
    Plato(
        id = 4,
        nombre = "Ají de gallina",
        descripcionCorta = "Pollo en crema de ají amarillo.",
        descripcionCompleta = "El ají de gallina es un plato tradicional preparado con pollo deshilachado en una crema de ají amarillo, pan, leche y queso.",
        precio = 20.00,
        categoria = "Platos de Fondo",
        imagenUrl = "https://upload.wikimedia.org/wikipedia/commons/8/86/Aji_de_gallina.jpg"
    ),
    Plato(
        id = 5,
        nombre = "Mazamorra morada",
        descripcionCorta = "Postre dulce de maíz morado.",
        descripcionCompleta = "La mazamorra morada es un postre peruano hecho con maíz morado, frutas secas, canela y clavo de olor.",
        precio = 8.00,
        categoria = "Postres",
        imagenUrl = "https://upload.wikimedia.org/wikipedia/commons/7/76/Mazamorra_morada.jpg"
    ),
    Plato(
        id = 6,
        nombre = "Chicha morada",
        descripcionCorta = "Bebida tradicional de maíz morado.",
        descripcionCompleta = "La chicha morada es una bebida peruana preparada con maíz morado, piña, canela, clavo de olor y azúcar.",
        precio = 6.00,
        categoria = "Bebidas",
        imagenUrl = "https://upload.wikimedia.org/wikipedia/commons/6/67/Chicha_morada.jpg"
    )
)