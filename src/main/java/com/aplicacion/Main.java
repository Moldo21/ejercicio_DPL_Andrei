package com.aplicacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestorTarea gestor = new GestorTarea();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Gestión de Tareas ---");
            System.out.println("1. Agregar Tarea");
            System.out.println("2. Ver Tareas");
            System.out.println("3. Eliminar Tarea");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción (de la opción 1 a lac 4): ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la descripción de la tarea: ");
                    String descripcion = scanner.nextLine();
                    gestor.agregarTarea(descripcion);
                    break;
                case 2:
                    List<Tarea> tareas = gestor.obtenerTareas();
                    if (tareas.isEmpty()) {
                        System.out.println("No hay tareas registradas.");
                    } else {
                        System.out.println("\n--- Tareas Registradas ---");
                        for (int i = 0; i < tareas.size(); i++) {
                            System.out.println((i + 1) + ". " + tareas.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el número de la tarea a eliminar: ");
                    int indice = scanner.nextInt() - 1;
                    gestor.eliminarTarea(indice);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}