open class Pokemons{

    open fun tipos(){
        println("Existem pokemons de vários tipos!")
    }
    open fun habitat(){
        println("Os pokémons vivem em diferentes habitats.")
    }
}

class Pokemon: Pokemons(){
    override fun tipos(){
            println("Charmander é do tipo Fire")
    }
    override fun habitat() {
        println("Charmander vive em áreas quentes.")
    }
}
fun main(){

    val pok = Pokemons()
        pok.tipos()
        pok.habitat()
    val pok2 = Pokemon()
        pok2.tipos()
        pok2.habitat()

}
