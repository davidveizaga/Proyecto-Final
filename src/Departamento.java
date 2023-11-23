import java.util.ArrayList;

public class Departamento {
    private String nombre;
    private String id;
    private String localizacion;
    private Empresa empresa;
    //asociación, empresa en la que está el departamento
    private ArrayList<Empleado> empleados;

    //asociación, almacena los empleados del departamento
    //constructor
    public Departamento(String nombre, String id, String localizacion, Empresa empresa) {
        this.nombre = nombre;
        this.id = id;
        this.localizacion = localizacion;
        this.empresa = empresa;
        empleados = new ArrayList<>();//array vacío para ir añadiendo los empleados
        empresa.altaDepartamento(this);// añadimos el departamento a la empresa
    }      //métodos get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }


    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }


    //alta de un empleado en el departamento
    public void altaEmpleado(Empleado emp) {
        if (!empleados.contains(emp)) {
            empleados.add(emp);
            emp.setDepartamento(this);
            //el empleado tiene que reflejar el alta
        }
    }

    // baja de un empleado del departamento
    public void bajaEmpleado(Empleado emp) {
        if (empleados.contains(emp)) {
            empleados.remove(emp);
            emp.setDepartamento(null); //el empleado tiene que reflejar la baja
        }
    }

    // información textual del departamento
    public String toString() {
        return "Departamento{" + "nombre=" + nombre + ", id=" + id + ", localizacion=" + localizacion + ", empresa=" + empresa + '}';
    }
}