package one.digitalinnovation.collections

fun main () {
    val joao = funcionario ( nome = "Joao", salario = 1000.0)
    val pedro = funcionario ( nome = "Pedro", salario = 2000.0)
    val maria = funcionario ( nome = "Maria", salario = 4000.0)


    val funcionarios = listOf(joao, pedro, maria)

    println("---------------------------------")
    println(funcionarios.find { it.nome == "Maria" })
    funcionarios.forEach { println(it) }
}  data class funcionario(val nome: String, val salario: Double)
{
        override fun toString(): String =
            """""
        Nome:    $nome
        Salário: $salario
        """"
           
        
        
    }








