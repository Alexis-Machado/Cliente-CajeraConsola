package com.iudigital.actividad.compra.thread;

import com.iudigital.actividad.compra.cliente.producto.ClienteProducto;
import com.iudigital.actividad.compra.cliente.producto.Producto;

public class CajeraThreadProducto extends Thread {
    private String nombre;
    private ClienteProducto cliente;
    private long tiempoInicial;

    public CajeraThreadProducto(String nombre, ClienteProducto cliente, long tiempoInicial) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.tiempoInicial = tiempoInicial;
    }
    
    @Override
    public void run() {
        
          // ...
        float costoTotalCompra = 0; // Variable para almacenar el costo total de la compra
        // ...
        
        // Imprimir mensaje de inicio del proceso de compra
        System.out.println("La Cajera " + this.nombre 
                + " Comienza a Procesar la Compra del Cliente " 
                + this.cliente.getNombre() + " En el Tiempo: " 
                + (System.currentTimeMillis() -  this.tiempoInicial) / 1000 +  " Seg \n");
         
        int contCliente = 1;
        
        for (Producto producto : cliente.getProductos()) {
            
             // Agregar el costo del producto al costo total de la compra
            costoTotalCompra += producto.getCantidad() * producto.getPrecio();
            // Agregar el costo del producto al costo total de la compra

            // ...
            
            // Esperar un segundo entre cada producto
            this.esperarXsegundos();
               
            // Imprimir información del producto procesado
            System.out.println("Compra realizada para " + cliente.getNombre()
                    +" - Producto "  + contCliente 
                    + " - Nombre: " + producto.getNombre() 
                    + " - Precio: " + producto.getPrecio() 
                    + " - Cantidad: " + producto.getCantidad() 
                    + " - Costo Total: " + producto.getCantidad() * producto.getPrecio() 
                    + " --> Tiempo: " + (System.currentTimeMillis() -  this.tiempoInicial) / 1000 + " Seg");
            contCliente++;
        }
        
         // Mostrar el costo total de la compra
        System.out.println("Costo total de la compra para " + cliente.getNombre() + ": " + costoTotalCompra);
         
        // Imprimir mensaje de finalización del proceso de compra
        System.out.println("\nLa cajera " +  this.nombre + " Ha Terminado de Procesar a el Cliente " 
                + this.cliente.getNombre() + " En el Tiempo " 
                + (System.currentTimeMillis() -  this.tiempoInicial) / 1000 + " Seg"); 
    }
    
    private void esperarXsegundos() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
