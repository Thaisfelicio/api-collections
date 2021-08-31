package one.digitalinnovation.collections

fun main () {
    val joao = funcionario ( nome = "Joao", salario = 2000.0, tipocontratacao = "CLT")
    val pedro = funcionario ( nome = "Pedro", salario = 1500.0, tipocontratacao = "PJ")
    val maria = funcionario ( nome = "Maria", salario = 4000.0, tipocontratacao = "CLT")


    val funcionarios = listOf(joao, pedro, maria)

    println("---------------------------------")
    println(funcionarios.find { it.nome == "Maria" })

    println("---------------------------------")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }

    println("---------------------------------")
    funcionarios
        .groupBy { it.tipocontratacao }
        .forEach { println(it) }

    funcionarios.forEach { println(it) }

}   data class funcionario(val nome: String,
                          val salario: Double,
                          val tipocontratacao: String)
{
        override fun toString(): String =
            """
        Nome:    $nome
        Salário: $salario
        """
           
        
        
    }








