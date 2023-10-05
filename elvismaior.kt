fun elvis(palavra: String?): Int{
     val recebe = palavra?.length ?: 0
       return if(recebe > 0){
            recebe

  }else{0}

}

fun main(){

val result: String? = "Lizandra"
val result2: String? = null
     println("Retornou seu nome ${elvis(result)} valor não nulo!")
     println("Retornou ${elvis(result2)} valor nulo!")

}
