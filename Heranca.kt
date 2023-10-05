open class Planetas{

   open fun tipos(){
println("Existem oito planetas no sistema solar")


  }

}

 class Terra : Planetas(){

 override fun tipos(){
println(" A terra é o terceiro planeta")

  }


}

fun main(){

val planetas = Planetas()
    planetas.tipos()
val terra = Terra()
    terra.tipos()

}
