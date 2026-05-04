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

// --- Reto 2: Empleados senior (mayÃƒÂºsculas, edad > 30) ---
fun reto2() {
    println("=== Reto 2: Filtro de empleados senior ===")
    val empleados = listOf(
        "Ana" to 28,
        "Luis" to 35,
        "Marta" to 42,
        "Pedro" to 29,
        "SofÃƒÂ­a" to 31
    )
    val nombresSenior = mutableListOf<String>()
    for ((nombre, edad) in empleados) {
        if (edad > 30) nombresSenior.add(nombre.uppercase())
    }
    println("Nombres para capacitaciÃƒÂ³n especial: $nombresSenior")
}

// --- Reto 3: Contactos ÃƒÂºnicos con Set, ordenados ---
fun reto3() {
    println("=== Reto 3: Limpieza de contactos duplicados ===")
    val telefonos = listOf(
        "3001112233", "3004445566", "3001112233", "3007778899",
        "3004445566", "3002223344", "3001112233", "3005556677",
        "3008889900", "3002223344", "3003334455", "3006667788",
        "3009990011", "3003334455", "3001212121", "3003434343",
        "3001212121", "3005656565", "3007878787", "3009090909"
    )
    val unicosOrdenados = telefonos.toSortedSet()
    println("Agenda sin duplicados (${unicosOrdenados.size}): $unicosOrdenados")
}

// --- Reto 4: Carrito -> Map producto -> cantidad ---
fun reto4() {
    println("=== Reto 4: AnÃƒÂ¡lisis de carrito de compras ===")
    val carrito = listOf("leche", "pan", "leche", "huevos", "pan", "leche", "arroz")
    val conteo = mutableMapOf<String, Int>()
    for (producto in carrito) {
        conteo[producto] = (conteo[producto] ?: 0) + 1
    }
    println("Unidades por producto: $conteo")
}

// --- Reto 5: Invertir Array de URLs manualmente ---
fun reto5() {
    println("=== Reto 5: Historial de navegaciÃƒÂ³n reversible ===")
    val urls = arrayOf(
        "https://a.com",
        "https://b.com",
        "https://c.com",
        "https://d.com",
        "https://e.com"
    )
    val n = urls.size
    for (i in 0 until n / 2) {
        val j = n - 1 - i
        val tmp = urls[i]
        urls[i] = urls[j]
        urls[j] = tmp
    }
    println("Historial invertido (simula \"AtrÃƒÂ¡s\" al recorrer): ${urls.joinToString()}")
}

// --- Reto 6: Intereses en comÃƒÂºn y exclusivos del primero ---
fun reto6() {
    println("=== Reto 6: Compatibilidad de intereses ===")
    val interesesA = setOf("cine", "senderismo", "cafÃƒÂ©", "lectura")
    val interesesB = setOf("yoga", "cafÃƒÂ©", "cine", "viajes")
    val compartidos = interesesA intersect interesesB
    val soloA = interesesA subtract interesesB
    println("En comÃƒÂºn: $compartidos | Solo la primera persona: $soloA")
}

// --- Reto 7: Despensa MutableMap: consumir y eliminar si agota ---
fun reto7() {
    println("=== Reto 7: Inventario de despensa ===")
    val despensa = mutableMapOf(
        "arroz" to 2,
        "frijoles" to 1,
        "aceite" to 1
    )
    fun consumir(producto: String, cantidad: Int) {
        val actual = despensa[producto] ?: run {
            println("Alerta: no existe \"$producto\" en despensa.")
            return
        }
        val restante = actual - cantidad
        when {
            restante > 0 -> despensa[producto] = restante
            restante == 0 -> {
                despensa.remove(producto)
                println("Alerta: \"$producto\" se agotÃƒÂ³ y se quitÃƒÂ³ del mapa.")
            }
            else -> println("Alerta: no hay suficiente \"$producto\" (hay $actual, pediste $cantidad).")
        }
    }
    consumir("arroz", 1)
    consumir("frijoles", 1)
    consumir("aceite", 2)
    println("Estado final: $despensa")
}

// --- Reto 8: Promedio ponderado con Pair<nota, peso> ---
fun reto8() {
    println("=== Reto 8: CÃƒÂ¡lculo de promedio acadÃƒÂ©mico ===")
    val items = listOf(
        4.5 to 0.3,
        3.8 to 0.2,
        4.2 to 0.5
    )
    var notaFinal = 0.0
    for ((nota, peso) in items) {
        notaFinal += nota * peso
    }
    println("Nota final ponderada: $notaFinal")
}

// --- Reto 9: Map ISO -> paÃƒÂ­s, mensaje por cada entrada ---
fun reto9() {
    println("=== Reto 9: Traductor de cÃƒÂ³digos de paÃƒÂ­s ===")
    val codigos = mapOf(
        "CO" to "Colombia",
        "MX" to "MÃƒÂ©xico",
        "AR" to "Argentina"
    )
    for ((iso, pais) in codigos) {
        println("El cÃƒÂ³digo $iso pertenece a $pais")
    }
}

// --- Reto 10: Rotar lista de 7 empleados k posiciones ---
fun reto10(k: Int = 2) {
    println("=== Reto 10: RotaciÃƒÂ³n de turnos (k=$k) ===")
    val empleados = listOf("E1", "E2", "E3", "E4", "E5", "E6", "E7")
    val n = empleados.size
    if (n == 0) {
        println("Lista vacÃƒÂ­a.")
        return
    }
    val offset = ((k % n) + n) % n
    val rotados = empleados.drop(offset) + empleados.take(offset)
    println("Orden original: $empleados")
    println("Tras rotar:    $rotados")
}

// --- Reto 11: Maleta agrupada por peso (kg) -> Map<Int, List<String>> ---
fun reto11() {
    println("=== Reto 11: Organizador de maleta ===")
    val objetos = listOf(
        "camisa" to 1, "pantalÃƒÂ³n" to 2, "cepillo" to 1,
        "libro" to 2, "cargador" to 1, "jersey" to 3,
        "zapatos" to 3, "agua" to 1
    )
    val porPeso = mutableMapOf<Int, MutableList<String>>()
    for ((nombre, kg) in objetos) {
        porPeso.getOrPut(kg) { mutableListOf() }.add(nombre)
    }
    println("Agrupado por kg: $porPeso")
}

// --- Reto 12: Ruta espejo (palÃƒÂ­ndromo de coordenadas) ---
fun reto12() {
    println("=== Reto 12: Verificador de ruta reversible ===")
    val ruta = listOf(0 to 0, 1 to 1, 2 to 2, 1 to 1, 0 to 0)
    val n = ruta.size
    var espejo = true
    for (i in 0 until n / 2) {
        if (ruta[i] != ruta[n - 1 - i]) {
            espejo = false
            break
        }
    }
    println("Ruta espejo: $espejo (ruta=$ruta)")
}

// --- Reto 13: 50 paquetes en lotes de 10 (bucle manual; tambiÃƒÂ©n chunked) ---
fun reto13() {
    println("=== Reto 13: Reparto de pedidos por camiÃƒÂ³n ===")
    val paquetes = (1..50).map { "P$it" }
    val camiones = mutableListOf<List<String>>()
    var i = 0
    while (i < paquetes.size) {
        val fin = minOf(i + 10, paquetes.size)
        val lote = mutableListOf<String>()
        for (j in i until fin) lote.add(paquetes[j])
        camiones.add(lote)
        i = fin
    }
    println("Camiones: ${camiones.size} | Paquetes camiÃƒÂ³n 1: ${camiones[0].size} (${camiones[0].first()}..${camiones[0].last()})")
    val conChunked = paquetes.chunked(10)
    println("Misma idea con chunked: ${conChunked.size} lotes")
}

