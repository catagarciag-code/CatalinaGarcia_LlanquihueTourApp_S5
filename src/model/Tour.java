/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Clase de modelo que representa un tour turístico y compone un objeto Guia.
 * Ubicada en el paquete model según la estructura del proyecto.
 *
 * @author Catalina García Santana
 */
public class Tour {
    private String nombre; 
    private String tipo; 
    private int precio;
    private Guia guia;

    //Constructores
    public Tour() {
    }

    public Tour(String nombre, String tipo, int precio, Guia guia) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.guia = guia;
    }

    //Getters & Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Guia getGuia() {
        return guia;
    }

    public void setGuia(Guia guia) {
        this.guia = guia;
    }
    


    //toString
    @Override
    public String toString() {
    return String.format("%-32s | Tipo: %-12s | Precio: $%d | Guía: %s", nombre, tipo, precio, (guia != null ? guia.toString() : "Sin asignar"));
}
}

