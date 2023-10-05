open class Veiculo(val marca: String) {
    open fun descricao() {
        println("Este é um veículo da marca $marca")
    }
}

class Carro(marca: String, val modelo: String) : Veiculo(marca) {
    override fun descricao() {
        println("Este é um carro da marca $marca, modelo $modelo")
           if (marca != modelo)
              println("Marca e modelo são coisas diferentes!")
    }

    fun mostrarMarcaSuperClasse() {
        println("A marca do veículo (superclasse) é $marca")
    }
}

fun main() {
    val veiculo1: Veiculo = Carro("Toyota", "Corolla")

        veiculo1.descricao()

}
