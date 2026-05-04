/**
 * Soluciones de retos Ã¢â‚¬â€ lÃƒÂ³gica de la actividad.
 * Cada funciÃƒÂ³n demuestra una estructura o algoritmo distinto.
 */

// --- Reto 1: Control de gastos diarios (sin usar .sum()) ---
fun reto1() {
    println("=== Reto 1: Control de gastos diarios ===")
    val gastos = arrayOf(
        12000.0, 8500.0, 15000.0, 9200.0, 11000.0,
        7800.0, 13400.0, 9900.0, 10500.0, 8800.0,
        12200.0, 7600.0, 14100.0, 9300.0, 10800.0
    )
    var total = 0.0
    for (g in gastos) total += g
    val promedio = total / gastos.size
    var maximo = gastos[0]
    var minimo = gastos[0]
    for (g in gastos) {
        if (g > maximo) maximo = g
        if (g < minimo) minimo = g
    }
    println("Total: $total | Promedio diario: $promedio | Mayor: $maximo | Menor: $minimo")
}

