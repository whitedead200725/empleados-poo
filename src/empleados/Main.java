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
        EmpleadoPorHora fer = new EmpleadoPorHora(26003, "Roberto", 40, 5.50);

        EmpleadoPorComision comision = new EmpleadoPorComision(2, "Carlos", 500.0, 2000.0, 0.10);

        comision.mostrarDatos();
        
        fer.mostrarDatos();
   }
    
}
