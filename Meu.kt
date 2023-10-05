class Carro{

var nome = " "

var ano = 0

var cor = " "

var preço = 25


    fun infoCarro(){

    println("Seu carro é um $nome de ano $ano, $cor")
}

}

    fun CriarCarro():Pair<String, Int>{

            print("Digite o nome do seu carro: ")
	val carro = readlnOrNull() ?: ""
	    print( "Digite o ano: ")
        val ano = readlnOrNull()?.toIntOrNull() ?: 0
                return Pair(carro, ano)
            print("Dite a cor que deseja: ")
        val cor = readlnOrNull() ?: ""
            print(" O $carro vale em torno de: ")
	val preço = readlnaOrNull()?.toIntOrNull() ?: 0
	          return Pair(cor, preço)
}

fun main(){


val (carro1, ano1, cor1, preço1) = CriarCarro() 
    
    val carroClass = Carro()
        carroClass.nome = carro1
	carroClass.ano = ano1
       carroClass.cor = cor1
       carroClass.preço = preço1
carroClass.infoCarro()

}

