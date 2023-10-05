class Carro(val nome: String, val ano: Int, val cor: String, val preco: Double)

fun formatarPreco(preco: Double): String {
    return String.format("%.4f", preco)
}

fun obterInfoCarro(carro: Carro): String {
    val precoFormatado = formatarPreco(carro.preco)
        return "Nome: ${carro.nome}, Ano: ${carro.ano}, Cor: ${carro.cor}, Preço R$: $precoFormatado"
}

fun main() {
    print("Digite o nome do carro: ")
    val nomeCarro = readLine() ?: ""

    print("Digite o ano do carro: ")
    val anoCarro = readLine()?.toIntOrNull() ?: 0

    print("Digite a cor do carro: ")
    val corCarro = readLine() ?: ""

    print("Digite o preço do carro: ")
    val precoCarro = readLine()?.toDoubleOrNull() ?: 0.0

    val meuCarro = Carro(nomeCarro, anoCarro, corCarro, precoCarro)
    val info = obterInfoCarro(meuCarro)
    println(info)
}
