open class Funcionario(var nome: String, var salario: Int){
    open fun mostrarinfo(){
        println("Nome: $nome salário R$$salario")
    }
}

class Patrao(nome: String, salario: Int, email: String): Funcionario(nome,salario){
    override fun mostrarinfo(){
        println("Nome: $nome\nsalário R$ $salario\nEmail: $email")
    }
}

fun main(){
    val funcionario = Funcionario("Lizandra",2000)
    val patrao = Patrao("Rodrigo",6000,"rodrigo.jetbrains@example.com")
    patrao.mostrarinfo()
    funcionario.mostrarinfo()

}
