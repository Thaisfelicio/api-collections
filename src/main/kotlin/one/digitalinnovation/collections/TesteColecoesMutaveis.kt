package one.digitalinnovation.collections

fun main() {
    val joao = funcionario ( nome = "Joao", salario = 2000.0, tipocontratacao = "CLT")
    val pedro = funcionario ( nome = "Pedro", salario = 1500.0, tipocontratacao = "PJ")
    val maria = funcionario ( nome = "Maria", salario = 4000.0, tipocontratacao = "CLT")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach {println(it)}

    println("------------LIST-------------")
    funcionarios.add(pedro)
    funcionarios.forEach {println(it)}

    println("-------------------------")
    funcionarios.remove(joao)
    funcionarios.forEach {println(it)}

    println("------------SET-------------")
 val funcionariosSet = mutableSetOf(joao)
    // esse repete o joão>>>> | funcionariosSet.forEach {println(it)}

 println("------------------------------")
    funcionariosSet.add(pedro)
    funcionariosSet.add(maria)
    funcionariosSet.forEach {println(it)}

    println("------------------------------")
    funcionarios.remove(maria)
    funcionariosSet.forEach {println(it)}

}