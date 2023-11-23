import java.time.LocalDate;

public class Contrato {
    private LocalDate fecha;
    private Empleado empleado;
    //asociación
    private Empresa empresa;
    //asociación
    public Contrato(Empleado empleado, Empresa empresa) {
        this.empleado = empleado;
        this.empresa = empresa;
        this.fecha = LocalDate.now();
    }
    public String toString() {return "Contrato{" + "fecha=" + fecha + ", empleado=" + empleado + ", empresa=" + empresa + '}';
    }
}
