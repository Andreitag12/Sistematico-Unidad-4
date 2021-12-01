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
public class Empleado {
    private int id;
    private String nombre;
    private String apellidos;
    private double horasExtras;
    private double salarioBase;


    public Empleado() {
    }

    public Empleado(int id, String nombre, String apellidos, double horasExtras,
            double salarioBase ) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
     public double calcularSalarioBruto(){
        double salarioBruto = this.salarioBase + this.horasExtras;
        
        
        
        return salarioBruto;
        
    }
    public double calcularSeguro(){
        double seguro = calcularSalarioBruto()*0.7;
        
        return seguro;
        
    }
    public double calcularSalarioNeto(){
        double salarioNeto = 0 +(this.getSalarioBase() + this.getHorasExtras())
                - calcularSeguro();
        return salarioNeto;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" 
                + apellidos + ", horasExtras=" + horasExtras + ", salarioBase=" 
                + salarioBase + '}';
    }
    
    

}