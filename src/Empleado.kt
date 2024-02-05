open class Empleado(nombre: String, edad: Int, val salarioBase: Double, val porcentajeImpuestos: Double) : Persona(nombre, edad) {

    open fun calcularSalario() = salarioBase - (salarioBase*(porcentajeImpuestos/100))
    override fun toString(): String {
        return "${super.toString()}, Salario Base: $salarioBase, Porcentaje de Impuestos: $porcentajeImpuestos"
    }
    fun trabajar():String {
        return "$nombre está trabajando en la empresa."
    }
}