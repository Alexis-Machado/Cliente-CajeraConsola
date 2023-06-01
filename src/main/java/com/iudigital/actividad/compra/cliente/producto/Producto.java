package com.iudigital.actividad.compra.cliente.producto;

public class Producto {
    
    // Atributos
    private String nombre;
    private float precio;
    private int cantidad; 

    // Constructor
    public Producto(String nombre, float precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Métodos para acceder y modificar el nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Métodos para acceder y modificar el precio
    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    // Métodos para acceder y modificar la cantidad
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
       
}
