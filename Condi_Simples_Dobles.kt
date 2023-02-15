

                                            // CONDICIONALES SIMPLES

// estos son aquellos que nos permiten como anteriormente dije, tomar solo una decisión dependiendo del resultado y si no se cumple no se cumple esta decisión no hace nada el programa


// 1. La tienda "Mis Zapatos" está de aniversario, por esa razón se está realizando un descuento del 50% en compras
// mayores o iguales a los $ 100.000. Haga un algoritmo que permita validar cuando se debe aplicar un descuento a un cliente, en caso de que el descuento sea valido se debe informar al usuario indicando el valor descontado.

fun main() {
   // exercise1()
   // exercise2()
}

fun exercise1(){
   println("Ingrese el valor de su compra : ")
   var valorCompra = readLine()!!.toDouble()

   println("El valor de su compra es de : ")
   var descuento: Double
   if(valorCompra >= 100000){
      descuento = valorCompra * 0.5
      valorCompra-=descuento

      println("El descuento del 50% de su compra es de  : $descuento")
   }

   println("el total a pagar de su compra es de : $valorCompra")

}







                                             // condicional doble:

   // los condicionales dobles funcionan de la misma manera que el condicional anterior solo que este nos permitirá tomar una decisicion/acción adicional llegado el caso que no se cumpla la anterior decisión, para que esto sea mas claro, lo haremos en este mismo ejercicio 

// 2. La tienda "Mis Zapatos" está de aniversario, por esa razón se está realizando un descuento del 50% en compras
// mayores o iguales a los $ 100.000 y por compras normales se realizara un descuento del 10%.  Haga un algoritmo que permita validar cuando se debe aplicar un descuento a un cliente, en caso de que el descuento sea valido se debe informar al usuario indicando el valor descontado.

fun exercise2(){

   println("Ingrese el valor de su compra : ")
   var valorCompra = readLine()!!.toDouble()

   println("El valor de su compra es de : $valorCompra ")

   var descuento: Double

   if(valorCompra >= 100000){
      descuento = valorCompra * 0.5
      valorCompra-=descuento

      println("El descuento del 50% de su compra es de  : $descuento")
   }else{
      descuento = valorCompra * 0.1
      valorCompra -= descuento

      println("El descuento del 10% de su compra es de :$descuento")
   }

   println("El total a pagar es de : $valorCompra")


}