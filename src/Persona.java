public class Persona {

    private String dni;
    private String nombre;
    private int edad;
    private String estado;

    //constructor
    public Persona(String dni, String nombre, int edad, String estado) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
    }

    //información textual de la persona
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", estado=" + estado + '}';
    }
}

