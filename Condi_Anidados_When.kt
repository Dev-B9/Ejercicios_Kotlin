
//                                               CONDICIONALES ANIDADOS



// 1.Algoritmo que solicite el nombre y la materia de un estudiante, así como 3 notas parciales y con esto calcule el promedio de notas, valide que si el estudiante saca un promedio mayor o igual a 3.5 entonces indique que el estudiante ganó la materia, de lo contrario indique que la perdió, en caso de perderla valide si se perdió con una nota mayor a 2.5 entonces el estudiante puede recuperar, el mensaje deberá mencionar el nombre y la materia del estudiante.



fun main(){
    // anidados()
    // multiples_when()
}

fun anidados(){

    println("Ingrese su nombre: ")
    var nombre = readLine()!!

    println("Ingrese el nombre de la materia: ")
    var materia = readLine()!!

    println("Ingrese nota 1: ")
    var nota1 = readLine()!!.toDouble()

    println("Ingrese nota 2: ")
    var nota2 = readLine()!!.toDouble()

    println("Ingrese nota 3: ")
    var nota3 = readLine()!!.toDouble()

    var prom = (nota1 + nota2 + nota3)/3

    if(prom > 3.5){
        println("$nombre gano la materia")
    }else{
        println("$nombre perdio la materia")
        if(prom >2.5){
            println("$nombre usted podra recuperar $materia")
        }
    }

}


//                                         CONDICIONALES MULTIPLES CON WHEN

//  Basado en el siguiente menú
// 1. Saludar
// 2. Pedir Nombre de una Persona
// 3. Sumar 2 Números
// Haga un algoritmo que dependiendo del código ingresado, realice la acción correspondiente.




fun multiples_when(){

    var menu = """
    MENU OPCIONES
    1. Saludar
    2. Pedir Nombre de una Persona
    3. Sumar 2 Números

    Ingrese una opcion :"""

    print(menu)

    var opcion = readLine()!!.toInt()

    when(opcion){
        1-> println("Hola")
        2->{
            println("Ingrese su nombre : ")
            var nombre = readLine()!!
            print("Su nombre es: $nombre")
        }
        3->{
            println("Ingrese el numero 1: ")
            var num1 = readLine()!!.toDouble()

            println("Ingrese el numero 2: ")
            var num2 = readLine()!!.toDouble()

            println("La suma de los dos numeros es : ${(num1 + num2)}")
        }
        else -> println("Opcion errada")
    }

}