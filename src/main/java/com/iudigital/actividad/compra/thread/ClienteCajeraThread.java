package com.iudigital.actividad.compra.thread;

import com.iudigital.actividad.compra.cliente.producto.ClienteProducto;
import com.iudigital.actividad.compra.cliente.producto.Producto;
import java.util.ArrayList;
import java.util.List;

public class ClienteCajeraThread {
    
    public static void main(String[] args) {
        // Crear una lista de productos vacía
        List<Producto> productos = new ArrayList<>();
        
        // Llenar la lista de productos
        setProductos(productos);
         
        // Crear instancias de ClienteProducto con los nombres de los clientes y la lista de productos
        ClienteProducto cliente1 = new ClienteProducto("Julian Martínez");
        ClienteProducto cliente2 = new ClienteProducto("Alexis Machado");
        
         // Agregar productos al cliente 1
        cliente1.agregarProducto(new Producto("Carne de Cerdo", 5000, 2));
        cliente1.agregarProducto(new Producto("Tomate", 400, 12));
        cliente1.agregarProducto(new Producto("Tocino", 2000, 5));

        // Agregar productos al cliente 2
        cliente2.agregarProducto(new Producto("Atún", 2500, 2));
        cliente2.agregarProducto(new Producto("Arepa", 3500, 3));
        cliente2.agregarProducto(new Producto("Huevo", 600, 31));
        
        // Obtener el tiempo inicial en milisegundos
        long tiempoInicial = System.currentTimeMillis();
           
        // Crear instancias de CajeraThreadProducto con los nombres de las cajeras, los clientes y el tiempo inicial
        CajeraThreadProducto Cajera1 = new CajeraThreadProducto("Ana", cliente1, tiempoInicial);
        CajeraThreadProducto Cajera2 = new CajeraThreadProducto("Sol", cliente2, tiempoInicial);
        
        // Iniciar los hilos de las cajeras
        Cajera1.start();
        Cajera2.start();
        
    }
        
    // Método privado para llenar la lista de productos con algunos productos de ejemplo
    private static void setProductos(List<Producto> productos) {
        // Agregar productos al cliente 1
        Producto producto1 = new Producto("Manzana", 1200, 10);
        Producto producto2 = new Producto("Naranja", 400, 12);
        Producto producto3 = new Producto("Leche Caja", 2500, 4);
        
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
    }
}

    

