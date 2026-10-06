/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados;

import java.util.ArrayList;

/**
 *
 * @author rober
 */
public class AdminEmpleados {
    
    
private ArrayList<Empleado> empleados;
    
public AdminEmpleados() {
    empleados = new ArrayList<>();
}    

private Empleado buscarEmpleadoXId(int IdEmpleado) {
     for (Empleado buscandoEmple : empleados) {
          if (buscandoEmple.getIdEmpleado() == IdEmpleado) {
              return buscandoEmple;
                }
        }
    return null;
}

public void registrarEmpleado(Empleado empleado) {
        if (buscarEmpleadoXId(empleado.getIdEmpleado()) == null ) {
                empleados.add(empleado);
                System.out.println("El empleado: " + empleado.getNombre() + " Fue agregado exitosamente");
                return;
        }
                System.out.println("El empleado " + empleado.getNombre() + " Ya fue registrado antes");
                
                
         }   
    
}
