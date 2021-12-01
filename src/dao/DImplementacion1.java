/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import interfaces.IOperaciones;
import java.util.ArrayList;
import modelos.EmpleadoOficina;

/**
 *
 * @author Andreita
 */
public class DImplementacion1 implements IOperaciones {
    ArrayList<EmpleadoOficina> lista = new ArrayList();

    @Override
    public void agregarRegistros(Object registro) {
       lista.add((EmpleadoOficina)registro);
    }

    @Override
    public Object mostrarRegistros() {
        for(EmpleadoOficina listaregistro:lista){
            System.out.println(listaregistro.toString());
    
    }
        return null;
    }
    
}
