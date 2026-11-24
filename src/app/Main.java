/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

import java.util.ArrayList;
import model.Tour;
import service.ServicioTour;

/**
 * Clase ejecutable principal del sistema LlanquihueTourApp. 
 * Ubicada en el paquete 'app' según la estructura del proyecto.
 *
 * @author Catalina García Santana
 */
 public class Main {

    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   SISTEMA DE GESTION LLANQUIHUE TOUR   ");
        System.out.println("==========================================\n");

        ServicioTour servicio = new ServicioTour();
        String rutaArchivo = "src/resources/guia.txt";

        //Carga desde archivo plano
        System.out.println("--- Carga de datos desde guia.txt ---");
        servicio.cargarTours(rutaArchivo);

        //Mostrar todos los registros
        System.out.println("\n=== TODOS LOS TOURS REGISTRADOS ===");
        ArrayList<Tour> todos = servicio.obtenerTodos();
        for (Tour t : todos) {
            System.out.println(t);
        }

        //Filtrado por tipo
        String tipoFiltro = "Gastronomico";
        System.out.println("\n=== TOURS FILTRADOS POR TIPO (" + tipoFiltro + ") ===");
        ArrayList<Tour> filtrados = servicio.filtrarPorTipo(tipoFiltro);
        for (Tour t : filtrados) {
            System.out.println(t);
        }
    }
}

    