class Bandeira{
    var cor1: String = ""
    var cor2: String = ""
    var cor3: String = ""
    var estrelas: Int = 0

    fun info(){
        println("As cores da bandeira do Brasil são: $cor1, $cor2, $cor3, e contem $estrelas estrelas! ")

    }

}

fun bandeiraOBJ(band1: String,band2: String,band3:String, star1: Int):Bandeira{
    var Instancia = Bandeira()
        Instancia.cor1 = band1
        Instancia.cor2 = band2
        Instancia.cor3 = band3
        Instancia.estrelas = star1
        return Instancia
}

fun main(){
    println("Bandeira do Brasil!")
    print("Digite a primeira cor ")
    val corBand = readLine() ?: ""
    print("Digite a segunda cor ")
    val corBand2 = readLine() ?: ""
    print("Digite a terceira cor ")
    val corBand3 = readLine() ?: ""
    print("Digite o número de estrelas ")
    val starBand = readLine()?.toIntOrNull() ?: 0

    bandeiraOBJ(corBand, corBand2, corBand3, starBand).info()

}
