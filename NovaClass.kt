class Carro{
    var nome = ""
    var ano = 0
    var cor = ""
    var preco = 0.0000

    fun infoCarro(){
        println("Seu carro é um $nome de ano $ano")
    }
    fun corValor(){
            val precoFormatado = "%.4f".format(preco) // "%.4f" especifica 4 casas decimais
            println("Sua cor é $cor e seu preço R$: $precoFormatado ")
    }
}

fun criarCarro(): Pair<String, Int >{
    print("Digite o nome do seu Carro: ")
    val carro: String = readlnOrNull() ?: ""
    print("Digite o ano: ")
    val ano: Int = readlnOrNull()?.toIntOrNull() ?: 0
        return Pair(carro, ano)
}
fun corPreco(): Pair<String, Double> {
    print("Digite a cor do seu Carro: ")
    val corCar = readlnOrNull() ?: ""
    print("Digite o Preço: ")
    val precoCar = readlnOrNull()?.toDoubleOrNull() ?: 0.0
        return Pair(corCar, precoCar)
}
fun main(){
    val (carro1, ano1) = criarCarro()
         val carroClass = Carro()
            carroClass.nome = carro1
            carroClass.ano = ano1

    val (carro2,ano2) = criarCarro()
        val carroClass2 = Carro()
            carroClass2.nome = carro2
            carroClass2.ano = ano2

    val (corCar1,precoCar1) = corPreco()
        val precoClass = Carro()
            precoClass.cor = corCar1
            precoClass.preco = precoCar1

    val (corCar2,precoCar2) = corPreco()
        val precoClass2 = Carro()
            precoClass2.cor = corCar2
            precoClass2.preco = precoCar2

    carroClass.infoCarro()
    precoClass.corValor()
    carroClass2.infoCarro()
    precoClass2.corValor()
}
