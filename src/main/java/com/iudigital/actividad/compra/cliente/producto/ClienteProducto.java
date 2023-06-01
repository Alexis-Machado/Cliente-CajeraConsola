package com.iudigital.actividad.compra.cliente.producto;

import java.util.ArrayList;
import java.util.List;

public class ClienteProducto {
    
    
    // Atributos
    private final String nombre;
    private final List<Producto> productos;

    // Constructor
    public ClienteProducto(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>(); // Crear una nueva lista para cada cliente
    }

    // Método para obtener el nombre del cliente
    public String getNombre() {
        return nombre;
    }

    // Método para obtener la lista de productos del cliente
    public List<Producto> getProductos() {
        return productos;
    }
    
    // Método para agregar un producto a la lista del cliente
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
}
