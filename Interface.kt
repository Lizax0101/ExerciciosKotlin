interface Imprimivel {
    fun imprimir()
}

class Documento : Imprimivel {
    override fun imprimir() {
        println("Este é um documento imprimível.")
    }
}

class Foto: Imprimivel{
    override fun imprimir() {
        println("Essa é uma foto!")
	if(teste == "Feia")
        println("Que bela foto")
    
    else{
    println("Que foto Feia")
    }
}
 }

fun main() {
    val meuDocumento = Documento()
    meuDocumento.imprimir()
    val foto = Foto()
        foto.imprimir()
}
