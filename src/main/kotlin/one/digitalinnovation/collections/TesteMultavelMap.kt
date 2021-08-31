package one.digitalinnovation.collections

fun main() {
    val joao = funcionario(nome = "Joao", salario = 2000.0, tipocontratacao = "CLT")
    val pedro = funcionario(nome = "Pedro", salario = 1500.0, tipocontratacao = "PJ")
    val maria = funcionario(nome = "Maria", salario = 4000.0, tipocontratacao = "CLT")

    val repositorio = Repositorio<Funcionarios>()
    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(maria.nome))
}