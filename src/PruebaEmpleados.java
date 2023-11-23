public class PruebaEmpleados {
    public static void main(String[] args) {
        // TODO code application logic here
        // 1 - creamos la empresa
        Direccion dir1 = new Direccion("Avenida de Bruselas", 35, 28108, "Alcobendas", "Madrid");
        Empresa e1 = new Empresa("Indra", "1234567", dir1);
        //2 - creamos los departamentos
        Departamento d1 = new Departamento("Informática", "1", "Madrid", e1);
        Departamento d2 = new Departamento("Personal", "2", "Barcelona", e1);
        //3 - creamos los empleados que asignamos a los departamentos
        Direccion diremp1 = new Direccion("Paseo de la Estación", 5, 28803, "Alcalá de Henares", "Madrid");
        Empleado emp1 = new Empleado("1234", "Pepe", 25, "soltero", 1500, "programador",diremp1, d1);
        Direccion diremp2 = new Direccion("Mayor", 18, 28801, "Alcalá de Henares", "Madrid");
        Empleado emp2 = new Empleado("4567", "Laura", 35, "casada", 2000, "analista",diremp2, d1);
        Direccion diremp3 = new Direccion("Santiago", 7, 28801, "Alcalá de Henares", "Madrid");
        Empleado emp3 = new Empleado("5678", "Maria", 40, "casada", 2500, "gerente",diremp3, d2);
        System.out.println(e1.toString());
        System.out.println(d1.toString());
        System.out.println(emp2.toString());
        System.out.println("Sueldo neto: " + emp2.sueldoNeto(25));
    }
}
