package com.iudigital.actividad.compra;

import com.iudigital.actividad.compra.cliente.producto.ClienteProducto;
import com.iudigital.actividad.compra.cliente.producto.Producto;
import java.util.ArrayList;
import java.util.List;

public class ClienteCajera {

    public static void main(String[] args) {

        // Creación de una lista de productos
        List<Producto> productos = new ArrayList<>();

        // Llenar la lista de productos
        setProductos(productos);

        // Creación de los objetos ClienteProducto con sus respectivos nombres y la lista de productos
        ClienteProducto cliente1 = new ClienteProducto("Julian Martínez");
        ClienteProducto cliente2 = new ClienteProducto("Alexis Machado");

        // Agregar productos al cliente 1
        cliente1.agregarProducto(new Producto("Manzana", 1200, 10));
        cliente1.agregarProducto(new Producto("Naranja", 400, 12));
        cliente1.agregarProducto(new Producto("Leche Caja", 2500, 4));

        // Agregar productos al cliente 2
        cliente2.agregarProducto(new Producto("Plátano", 800, 8));
        cliente2.agregarProducto(new Producto("Uva", 4000, 6));
        cliente2.agregarProducto(new Producto("Mango", 2000, 5));

        // Obtener el tiempo inicial en milisegundos
        long tiempoInicial = System.currentTimeMillis();

        // Creación de los objetos CajeraProducto con sus respectivos nombres
        CajeraProducto cajera1 = new CajeraProducto("Ana");
        CajeraProducto cajera2 = new CajeraProducto("Sol");

        // Procesamiento de la compra de los clientes por parte de las cajeras
        cajera1.procesarCompra(cliente1, tiempoInicial);
        cajera2.procesarCompra(cliente2, tiempoInicial);
    }

    // Método privado para llenar la lista de productos con algunos productos de ejemplo
    private static void setProductos(List<Producto> productos) {
        Producto producto1 = new Producto("Manzana", 1200, 10);
        Producto producto2 = new Producto("Naranja", 400, 12);
        Producto producto3 = new Producto("Leche Caja", 2500, 4);

        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
    }
}
