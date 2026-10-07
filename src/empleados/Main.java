/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empleados;

/**
 *
 * @author rober
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        AdminEmpleados admin = new AdminEmpleados();
        
        EmpleadoPorHora Fer = new EmpleadoPorHora(26003, "Fer", 40, 5.50);
        EmpleadoPorComision Javi = new EmpleadoPorComision(26432, "Javi", 40, 6, 0.10);
        EmpleadoAdministrativo Angel = new EmpleadoAdministrativo(26093, "Angel", 300);
       
        admin.registrarEmpleado(Fer);
        admin.registrarEmpleado(Javi);
        admin.registrarEmpleado(Fer);
        admin.registrarEmpleado(Fer);
        admin.registrarEmpleado(Angel);
        admin.registrarEmpleado(Angel);
        
        
        admin.consultarEmpleados();
        admin.calcularRemuneraciones();
        admin.generarReporte();
   }
    
}
