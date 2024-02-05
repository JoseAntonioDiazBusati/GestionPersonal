fun main() {
    val p = Persona("Paco", 37)
    println("Nombre: ${p.nombre}, Edad: ${p.edad}")
    println("${p.celebrarCumple()}")

    val empleado = Empleado("Ana", 28, 1800.0, 14.5)
    println("\nInformación del Empleado: $empleado")
    println("Salario Neto: ${empleado.calcularSalario()}")
    empleado.trabajar()

    val gerente = Gerente("Carlos", 35, 3000.0, 10.0, 1000.0, true)
    println("\nInformación del Gerente: $gerente")
    println("Salario Neto: ${gerente.calcularSalario()}")
    gerente.administrar()
}