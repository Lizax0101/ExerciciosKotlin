class Animal{

var nome:String= ""

var idade: Int= 0

    fun calcularIdadeHumana(): Int{

        return idade*7

}
   
    fun fazerTruque(){

        println("$nome esta balançando o rabo!")

}

}

fun main(){

    val cachorro = Animal()
        cachorro.nome = "Pierre"
	cachorro.idade = 3
	cachorro.fazerTruque()
	cachorro.calcularIdadeHumana()

    val idadeHumana = cachorro.calcularIdadeHumana()
println("${cachorro.nome} tem $idadeHumana anos humanos.")
}


