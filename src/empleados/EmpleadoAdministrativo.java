package empleados;

/**
 * Representa a un empleado administrativo que recibe un salario mensual fijo.
 * Hereda de la clase abstracta {@code Empleado} y calcula su salario
 * devolviendo directamente el salario mensual.
 *
 */

public Class EmpleadoAdministrativo extends Empleado {
    
    private double salarioMensual;

    public EmpleadoAdministrativo (int idEmpleado, String nombre, double salarioMensual){

        super(idEmpleado, nombre);
        this.salarioMensual = salarioMensual;

    }

    public double getSalarioMensual(){
        return salarioMensual;
    }

    public void setSalarioMensual (double salarioMensual){
        this.salarioMensual = salarioMensual;
    }

    @override 
    public double calcularSalario(){
        return salarioMensual;
    }

    @override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Salario mensual: " + salarioMensual);
    }



}