package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios){
        println(salario)
    }

    println("-----------------------------------")
    println("Maior salarios: ${salarios.maxOrNull()}")
    println("Menor salarios: ${salarios.minOrNull()}")
    println("Media salarios: ${salarios.average()}")

    val salariosMaiorque2500 = salarios.filter { it > 2500.0 }
    println("-----------------------------------")
    salariosMaiorque2500.forEach { println(it) }
}