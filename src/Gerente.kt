class Gerente(nombre: String, edad: Int, salarioBase: Double, porcentajeImpuestos: Double, val bonus: Double, val exentoImpuestos: Boolean) : Empleado(nombre, edad, salarioBase, porcentajeImpuestos) {
    override fun calcularSalario(): Double {
        if (exentoImpuestos==true){
            return salarioBase + bonus
        }
        return super.calcularSalario()+bonus
    }
    override fun toString(): String {
        return "${super.toString()}, Bonus: $bonus, Exento de Impuestos: $exentoImpuestos"
    }
    fun administrar():String {
        return "$nombre está administrando."
    }
}
