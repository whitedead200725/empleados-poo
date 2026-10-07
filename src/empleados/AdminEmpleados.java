/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados;

import java.util.ArrayList;

/**
 *Esta clase administra la lista de empleados de todo el sistema
 * 
 * almacena todos los tipos de empleados en un arreglo de tipo {@code Empleado}
 * y ofrece las opciones que pide la guia de trabajo: Registrar empleados, Consultar empleados
 * Calcular remuneraciones. Generar reportes, Modificar información, Consultar información según el tipo de empleado.
 * 
 * 
 *  ------ AUN EN DESARROLLO ------ 
 * 
 * @author rober
 */
public class AdminEmpleados {
    
private ArrayList<Empleado> empleados;
private String aviso = "- [𝗦𝗶𝘀𝘁𝗲𝗺𝗮 𝗩𝗮𝗰í𝗼] Registra al menos un empleado para habilitar la función de: ";
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

public void consultarEmpleados() {
        if (empleados.size() > 0) {
            System.out.println("\n -⋆⋅☆⋅⋆- 𝗹𝗶𝘀𝘁𝗮 𝗱𝗲 𝘁𝗼𝗱𝗼𝘀 𝗹𝗼𝘀 𝗲𝗺𝗽𝗹𝗲𝗮𝗱𝗼𝘀 𝗿𝗲𝗴𝗶𝘀𝘁𝗿𝗮𝗱𝗼𝘀 -⋆⋅☆⋅⋆- \n");
                for (Empleado listaDeEmples : empleados){
                    listaDeEmples.mostrarDatos();
                } 
            return;
          }
            System.out.println(aviso + "𝗰𝗼𝗻𝘀𝘂𝗹𝘁𝗮𝗿 𝗲𝗺𝗽𝗹𝗲𝗮𝗱𝗼𝘀" );
 }


public void calcularRemuneraciones() {
    double monyTotal = 0;
    
    if (empleados.size() > 0) {
            System.out.println("\n -⋆⋅☆⋅⋆- 𝗘𝗺𝗽𝗹𝗲𝗮𝗱𝗼𝘀 𝘆 𝘀𝘂 𝗿𝗲𝗺𝘂𝗻𝗲𝗿𝗮𝗰𝗶ó𝗻 -⋆⋅☆⋅⋆- \n");
            for (Empleado remuneXEmple : empleados){
                System.out.println("- " + remuneXEmple.getNombre() + " gana: $" + remuneXEmple.calcularSalario() );
                monyTotal += remuneXEmple.calcularSalario();
            } 
                System.out.println("\nTotal de remuneraciones: $" + monyTotal + "\n");
                return;
    }
            System.out.println(aviso + "𝗰𝗮𝗹𝗰𝘂𝗹𝗮𝗿 𝗿𝗲𝗺𝘂𝗻𝗲𝗿𝗮𝗰𝗶𝗼𝗻𝗲𝘀");
}

public void generarReporte(){
    double monyTotal2 = 0;
    int EmpleadoAdministrativo =0;
    int EmpleadoPorHora = 0;
    int EmpleadoPorComision = 0;
    
     if (empleados.size() > 0) {
        System.out.println("\n -⋆⋅☆⋅⋆- R𝗲𝗽𝗼𝗿𝘁𝗲 𝗱𝗲 𝗲𝗺𝗽𝗹𝗲𝗮𝗱𝗼𝘀 -⋆⋅☆⋅⋆- \n");
            for (Empleado reportEmplea2 : empleados){
            System.out.printf("- Empleado: %s | ID: %d | Salario %.2f |\n", reportEmplea2.getNombre(), reportEmplea2.getIdEmpleado(), reportEmplea2.calcularSalario());
            monyTotal2 += reportEmplea2.calcularSalario(); 
               
            String nombreClase = reportEmplea2.getClass().getSimpleName();
                switch (nombreClase) {
                case "EmpleadoAdministrativo":
                    EmpleadoAdministrativo++;
                    break;
                case "EmpleadoPorHora":
                    EmpleadoPorHora++;
                    break;
                case "EmpleadoPorComision":
                     EmpleadoPorComision++;
                     break;
                }
            }
            
            System.out.println("\n\n         -- 𝗡ó𝗺𝗶𝗻𝗮 --");
            System.out.printf("\nTotal de empleados en el sistema: %d \n", empleados.size());
            System.out.printf("\nEmpleados Administrativos: %d", EmpleadoAdministrativo);            
            System.out.printf("\nEmpleados Por hora: %d", EmpleadoPorHora);            
            System.out.printf("\nEmpleados Por comisión: %d\n",EmpleadoPorComision);            
            System.out.printf("\nPago de todos los empleados en total: $%.2f\n", monyTotal2);      
     }

}

}
