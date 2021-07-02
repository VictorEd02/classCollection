package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario(nome = "João", salario = 2000.0, tipoContratacao = "CLT")
    val pedro = Funcionario(nome = "Pedro", salario = 1500.0, tipoContratacao = "PJ")
    val maria = Funcionario(nome = "Maria", salario = 4000.0, tipoContratacao = "CLT")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    val resulUnion = funcionarios1.union(funcionarios2)
    resulUnion.forEach{ println(it) }

    println("---------------------------")
    val funcionarios3 = setOf(joao, pedro, maria)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    resultSubtract.forEach{ println(it) }

    println("---------------------------")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach{ println(it) }
}