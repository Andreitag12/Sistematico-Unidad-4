/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistemático;

import dao.DImplementacion1;
import dao.DImplementacion2;
import modelos.EmpleadoOficina;
import modelos.EmpleadoProduccion;

/**
 *
 * @author Andreita
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EmpleadoOficina empleado1 = new EmpleadoOficina(001, "Andrea", "González", 3, 2500);
        EmpleadoOficina empleado2 = new EmpleadoOficina(002, "Mabel", "García", 4, 600.00);
        EmpleadoOficina empleado3 = new EmpleadoOficina(003, "Allan", "Silva", 6, 2500.00);
        
        DImplementacion1 Empleados_Oficina = new DImplementacion1();
        
        Empleados_Oficina.agregarRegistros(empleado1);
        Empleados_Oficina.agregarRegistros(empleado2);
        Empleados_Oficina.agregarRegistros(empleado3);
        
        Empleados_Oficina.mostrarRegistros();
        
        EmpleadoProduccion emplead1 = new EmpleadoProduccion(120, "Jorge", "Chávez", 10000.00, 12, 6000);
        EmpleadoProduccion emplead2 = new EmpleadoProduccion(321, "Zair", "Ortíz", 5000.00, 22, 9000);
        EmpleadoProduccion emplead3 = new EmpleadoProduccion(129, "Iverson", "Maliaños", 100.00, 30, 300);
         
        DImplementacion2 Empleados_Produccion = new DImplementacion2();
        
        Empleados_Produccion.agregarRegistros(emplead1);
        Empleados_Produccion.agregarRegistros(emplead2);
        Empleados_Produccion.agregarRegistros(emplead3);
        
        Empleados_Produccion.mostrarRegistros();
       
    }
    
}
