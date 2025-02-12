package com.aplicacion;

import java.util.ArrayList;
import java.util.List;

public class GestorTarea {
    private List<Tarea> tareas;

    public GestorTarea() {
        tareas = new ArrayList<>();
    }

    public void agregarTarea(String descripcion) {
        tareas.add(new Tarea(descripcion));
    }

    public void eliminarTarea(int indice) {
        if (indice >= 0 && indice < tareas.size()) {
            tareas.remove(indice);
        }
    }

    public List<Tarea> obtenerTareas() {
        return tareas;
    }
}