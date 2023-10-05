open class Animal(val nome: String, val raca: String) {
    init {
        println("$nome é um animal $raca.")
    }
}

class Cachorro(nome: String,  raca: String) : Animal(nome,raca) {
    init {
        println("$nome é um cachorro da raça $raca.")
    }
}
fun main() {
    val cachorro = Cachorro("Thor", "Labrador")
}
