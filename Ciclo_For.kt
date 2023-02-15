                                           // CICLO FOR
// Haga un algoritmo que permita calcular el promedio de n estudiantes, el sistema debe imprimir:
// 1. Cantidad de estudiantes procesados
// 2. Promedio total de los promedios
                
fun main() {
    var sumaPromedios: Double = 0.0

    println("Ingrese el numero de estudiantes a calcular: ")
    var cantidadEstudiantes = readLine()!!.toInt()

    for (i in 1..cantidadEstudiantes) {
        println("Ingrese el promedio del estudiante $i")
        var promedio = readLine()!!.toDouble()
        sumaPromedios += promedio
    }

    var promedioTotal = sumaPromedios/cantidadEstudiantes

    println("La cantidad de estudiantes procesados es de: $cantidadEstudiantes")
    println("El promedio total de los estudiantes es de : $promedioTotal")
}
    