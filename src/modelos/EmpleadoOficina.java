/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Andreita
 */
public class EmpleadoOficina extends Empleado {

    public EmpleadoOficina() {
    }

    public EmpleadoOficina(int id, String nombre, String apellidos,
            double horasExtras, double salarioBase) {
        super(id, nombre, apellidos, horasExtras, salarioBase);
    }

    @Override
    public String toString() {
        return "EmpleadoOficina { Id: "+ this.getId()  + ", Nombre: " + this.getNombre() + ", Apellidos: " + this.getApellidos()
                          + ", Horas extras: " + this.getHorasExtras() + ", Salario base: " + this.getSalarioBase()+'}';
    }
    
    @Override
    public void finalize() throws Throwable {
    super.finalize();
}
    
    
}
