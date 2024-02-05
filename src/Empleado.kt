open class Empleado(nombre: String, edad: Int, val salarioBase: Double, val porcentajeImpuestos: Double) : Persona(nombre, edad) {

    fun calcularSalario(): Double {
        val sal = salarioBase * (1 - porcentajeImpuestos)
        return sal
    }
    override fun toString(): String {
        return "${super.toString()}, Salario Base: $salarioBase, Porcentaje de Impuestos: $porcentajeImpuestos"
    }
    fun trabajar() {
        println("$nombre está trabajando en la empresa.")
    }
}