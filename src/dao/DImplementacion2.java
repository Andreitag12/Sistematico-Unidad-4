/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import interfaces.IOperaciones;
import java.util.ArrayList;
import modelos.EmpleadoProduccion;

/**
 *
 * @author Andreita
 */
public class DImplementacion2 implements IOperaciones {
   
    ArrayList<EmpleadoProduccion> lista = new ArrayList();
    @Override
    public void agregarRegistros(Object registro) {
        lista.add((EmpleadoProduccion) registro);
    }

    @Override
     public Object mostrarRegistros() {
         for(EmpleadoProduccion listaregistro: lista){
       System.out.println(listaregistro.toString());
    }
        return null;
    }
}
