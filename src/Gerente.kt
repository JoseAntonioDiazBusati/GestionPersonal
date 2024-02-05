class Gerente(nombre: String, edad: Int, salarioBase: Double, porcentajeImpuestos: Double, val bonus: Double, val exentoImpuestos: Boolean) : Empleado(nombre, edad, salarioBase, porcentajeImpuestos) {
    override fun calcularSalario(): Double {
        if (exentoImpuestos==true){
            return salarioBase + (bonus*(porcentajeImpuestos/100))
        }
        return salarioBase*(porcentajeImpuestos/100)
    }
    override fun toString(): String {
        return "${super.toString()}, Bonus: $bonus, Exento de Impuestos: $exentoImpuestos"
    }
    fun administrar():String {
        return "$nombre está administrando."
    }
}
