open class Veiculo(val marca: String) {
    open fun descricao() {
        println("Este é um veículo da marca $marca")
    }
}

class Carro(marca: String, val modelo: String) : Veiculo(marca) {
    override fun descricao() {
        println("Este é um carro da marca $marca, modelo $modelo")
    }

    fun mostrarMarcaSuperClasse() {
        println("A marca do veículo (superclasse) é $marca")
    }
}

fun main() {
    val veiculo1: Veiculo = Carro("Toyota", "Corolla")

    veiculo1.descricao() // Chama a implementação da classe Carro
    // veiculo1.mostrarMarcaSuperClasse() // Isso geraria um erro, pois mostrarMarcaSuperClasse() não é um membro de Veiculo

    val veiculo2 = Carro("Honda", "Civic")
    veiculo2.mostrarMarcaSuperClasse() // Agora isso é possível porque veiculo2 é uma instância de Carro
}
