fun elvis(number: Long?): Int{

     val creditcard = number?.toString()?.length ?: 0

          return if(creditcard == 16){
          print("Seu cartao passou, ele tem")
          creditcard
 
 }else{

      print("Valor Nulo ou Invalido!")
                return  creditcard
}

}

fun main(){

print("Digite o número do cartão de crédito: ")

    val cartao:Long? = readLine()?.toLongOrNull()
  //  val nulo:Long? = null

         println(" ${elvis(cartao)} digitos")
       //  println("cartao invalido ${elvis(nulo)} digitos insulficientes")

}
    
