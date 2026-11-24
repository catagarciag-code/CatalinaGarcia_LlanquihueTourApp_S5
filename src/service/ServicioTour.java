/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import model.Guia;
import model.Tour;

/**
 * Servicio que gestiona la carga desde archivo plano y los filtros de tours.
 * Ubicado en el paquete service.
 *
 * @author Catalina García Santana
 */
public class ServicioTour {

    // Atributo privado para la colección dinámica (POO)
    private ArrayList<Tour> listaTours;

    public ServicioTour() {
        this.listaTours = new ArrayList<>();
    }

    public ArrayList<Tour> cargarTours(String rutaArchivo) {
        listaTours.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (!linea.trim().isEmpty()) {
                    String[] datos = linea.split(";");
                    if (datos.length >= 5) {
                        //Datos del Tour
                        String nombre = datos[0].trim();
                        String tipo = datos[1].trim();
                        int precio = Integer.parseInt(datos[2].trim());

                        //Datos del Guía para la Composición
                        String nombreGuia = datos[3].trim();
                        String actividad = datos[4].trim();
                        Guia guia = new Guia(nombreGuia, actividad);

                        //Crear el objeto Tour y agregarlo a la lista
                        Tour tour = new Tour(nombre, tipo, precio, guia);
                        listaTours.add(tour);
                    }
                }
            }
            System.out.println("-> Carga exitosa: " + listaTours.size() + " tours cargados.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error en formato de numero: " + e.getMessage());
        }

        return listaTours;
    }

    public ArrayList<Tour> obtenerTodos() {
        return listaTours;
    }

    public ArrayList<Tour> filtrarPorTipo(String tipoBuscado) {
        ArrayList<Tour> filtrados = new ArrayList<>();
        for (Tour t : listaTours) {
            if (t.getTipo().equalsIgnoreCase(tipoBuscado.trim())) {
                filtrados.add(t);
            }
        }
        return filtrados;
    }
}
