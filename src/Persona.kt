open class Persona(var nombre:String,var edad:Int) {
    override fun toString(): String {
        return "Nombre: $nombre, Edad: $edad"
    }
    fun celebrarCumple(){
        edad++
        return println("Feliz cumpleaños $nombre!! Ahora tienes $edad años.")
    }
}