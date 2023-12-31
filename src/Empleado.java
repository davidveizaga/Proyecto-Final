public class Empleado extends Persona {
    private double sueldo;
    private String categoria;
    private Departamento departamento;

    //asociación
    // constructor
    public Empleado(String dni, String nombre, int edad, String estado, double sueldo, String categoria, Departamento departamento) {
        super(dni, nombre, edad, estado);
        this.sueldo = sueldo;
        this.categoria = categoria;
        this.departamento = departamento;
        this.departamento.altaEmpleado(this);
        //tenemos que incorporar el empleado al departamento
    }

    public String toString() {
        return super.toString() + " # Empleado{" + "sueldo=" + sueldo + ", categoria=" + categoria + ", departamento=" + departamento + '}';
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

}
