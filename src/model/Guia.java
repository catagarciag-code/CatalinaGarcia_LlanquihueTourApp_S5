/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Clase de modelo que representa a un guía turístico y su actividad asignada.
 * Ubicada en el paquete model según la estructura del proyecto.
 *
 * @author Catalina García Santana
 */
public class Guia {
    private String nombreGuia;
    private String actividad;

    //Constructores
    public Guia() {
    }

    public Guia(String nombreGuia, String actividad) {
        this.nombreGuia = nombreGuia;
        this.actividad = actividad;
    }

    //Getters & Setters
    public String getNombreGuia() {
        return nombreGuia;
    }

    public void setNombreGuia(String nombreGuia) {
        this.nombreGuia = nombreGuia;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    //toString
    @Override
    public String toString() {
    return nombreGuia + " (" + actividad + ")";
}
    
}
