/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author juana
 */
public class EquipoTrabajoEjemplo{

    private int idEquipoTrabajo;
    private String pendientes;
    private String Ejecutadas;
    private String ingeniero; 
    
    private ArrayList<Tarea> listaTareasPendientes =  new ArrayList<>();
    private ArrayList<Tarea> listaTareasEjecutadas = new ArrayList<>();
    private ArrayList<Ingeniero> listaIngenieros;

    public EquipoTrabajoEjemplo() {
        this.listaIngenieros = new ArrayList<>();
    }

    public ArrayList<Ingeniero> getListaIngenieros() {
        return listaIngenieros;
    }

    public void setListaIngenieros(ArrayList<Ingeniero> listaIngenieros) {
        this.listaIngenieros = listaIngenieros;
    }
    
    public void consultaGeneralTareasPendientes(Proyecto proyecto) {
        
        System.out.println("Lista de tareas pendientes: ");
        for (Tarea tarea : proyecto.getListaTareas()) {
            if(tarea.getEstadoTarea() == "pendiente")
            {
                listaTareasPendientes.add(tarea);
            }
        }
        recorrerLista(listaTareasPendientes);
    }

    public void consultaGeneralTareasRealizadas(Proyecto proyecto) {
        System.out.println("Lista de tareas ejecutadas: ");

        for (Tarea tarea : proyecto.getListaTareas()) {
            if(tarea.getEstadoTarea() == "ejecutada")
            {
                listaTareasEjecutadas.add(tarea);
            }
        }

        recorrerLista(listaTareasPendientes);
    }

    public void FinalizarTarea(Tarea tarea) {
        tarea.setEstadoTarea("ejecutada");
    }
    
    public void recorrerLista(ArrayList<Tarea> listaTareas)
    {
        for (Tarea tarea : listaTareas) {
            System.out.println(tarea.toString());
        }

    }
}
