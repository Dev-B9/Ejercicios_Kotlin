//                                          WHILE

// Algoritmo que solicite 2 numeros y realice el siguiente proceso del menú
// 1. Sumar
// 2. Restar
// 3. Multiplicar
// 4. Dividir
// 5. Finalizar
// Haga el sistema con ciclos y valide que el segundo numero no sea negativo o cero en la opción 4


fun main(){
    // calculadora()
    // saludos()
}

fun calculadora(){
    var opcion: Int= 0
    var numero1 : Double
    var numero2: Double

    while(opcion!= 5){
        var menu = """ 
        MENU DE OPCIONES
        1. Sumar
        2. Restar
        3. Multiplicar
        4. Dividir
        5. Finalizar

        Ingrese una opcion: """

        print(menu)
        opcion = readLine()!!.toInt()

        print("Ingrese el primer numero: ")
        numero1= readLine()!!.toDouble()

        print("Ingrese el segundo numero: ")
        numero2 = readLine()!!.toDouble()


        when(opcion){
            1-> print("La suma de los dos numeros es : ${numero1 + numero2}")
            2-> print("La resta de los dos numeros es de : ${numero1 - numero2}")
            3-> print("La multiplicacion de los dos numeros es de: ${numero1 * numero2}")
            4->{
                if(numero2<=0){
                    print("Valores menores o iguales 0 en segundo campo no son permitidos")
                }else{
                    print("La division de los dos numero es de: ${numero1 /numero2}")

                }
            }
            5-> print("Se finalizo el programa")
            else-> print("Opcion no valida")
        }

    }

    
}





//                                                  DO WHILE

// 2. Haga un algoritmo que solicite el nombre de n cantidad de personas e imprima un saludo, el usuario ingresará la
// cantidad de personas a validar.


fun saludos(){
    print("Ingrese la cantidad de personas a saludar: ")
    var cantidadPersonas = readLine()!!.toInt()
    var contador = 1
    do{
        print("Ingrese el nombre de la persona $contador: ")
        var nombre = readLine()!!
        println("Hola $nombre")
        contador++

    }while(contador<=cantidadPersonas)

}