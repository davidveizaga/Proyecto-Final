import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private String cif;
    private Direccion direccion;
    private ArrayList<Departamento> departamentos; //asociación, almacena los departamentos de la empresa      //constructor

    public Empresa(String nombre, String cif, Direccion direccion) {
        this.nombre = nombre;
        this.cif = cif;
        this.direccion = direccion;
        departamentos = new ArrayList<>();
    }      //métodos get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }


    // alta de un departamento en la empresa
    public void altaDepartamento(Departamento dpto) {
        if (!departamentos.contains(dpto)) {
            departamentos.add(dpto);
        }
    }

    //baja de un departamento en la empresa
    public void bajaDepartamento(Departamento dpto) {
        if (departamentos.contains(dpto)) {
            departamentos.remove(dpto);
        }
    }      //información textual de la empresa

    public String toString() {
        return "Empresa{" + "nombre=" + nombre + ", cif=" + cif + ", direccion=" + direccion + '}';
    }
}
