package com.aplicacion;

/**
 * La clase Tarea representa una tarea en la aplicación.
 * Cada tarea tiene una descripción que la define.
 */
public class Tarea {
    private String descripcion;

    /**
     * Constructor de la clase Tarea.
     *
     * @param descripcion La descripción de la tarea.
     */
    public Tarea(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene la descripción de la tarea.
     *
     * @return La descripción de la tarea.
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Devuelve una representación en cadena de la tarea.
     *
     * @return La descripción de la tarea.
     */
    @Override
    public String toString() {
        return descripcion;
    }
}