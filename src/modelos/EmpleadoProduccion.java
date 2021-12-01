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
public class EmpleadoProduccion extends Empleado{
    private double bono;

    public EmpleadoProduccion() {
    }

    public EmpleadoProduccion(int id, String nombre, String apellidos, 
             double salarioBase,double horasExtras,double bono ) {
        super(id, nombre, apellidos, salarioBase, horasExtras);
        this.bono = bono;
    }
    

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    @Override
    public String toString() {
        return "EmpleadoProduccion{Id: "+ this.getId()+ ", Nombre: " + 
                this.getNombre() + ", Apellidos: " + this.getApellidos() 
                + ", Salario base: "+ this.getSalarioBase() + ", Horas extras: " 
                + this.getHorasExtras() + ", bono: " + bono + '}';
    }
    
    @Override
    public void finalize() throws Throwable {
    super.finalize();
}
    
}
