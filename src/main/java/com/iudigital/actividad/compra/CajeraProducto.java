package com.iudigital.actividad.compra;

import com.iudigital.actividad.compra.cliente.producto.ClienteProducto;
import com.iudigital.actividad.compra.cliente.producto.Producto;

public class CajeraProducto {
    
    // Atributo
    private String nombre;

    // Constructor
    public CajeraProducto(String nombre) {
        this.nombre = nombre;
    }
    
    // Método para procesar la compra del cliente
    public void procesarCompra(ClienteProducto cliente, long timeStamp) {
        
        // ...
        float costoTotalCompra = 0; // Variable para almacenar el costo total de la compra
        // ...

        // Imprimir mensaje de inicio del proceso de compra
        System.out.println("La Cajera: " + this.nombre 
                + "\nComienza a procesar la compra del cliente: " 
                + cliente.getNombre() 
                + "\nTiempo transcurrido: " 
                + (System.currentTimeMillis() - timeStamp) / 1000 +  " Seg\n");
        int contCliente = 1;
        
        // Procesar cada producto del cliente
        for (Producto producto : cliente.getProductos()) {
            
            // ...

            // Agregar el costo del producto al costo total de la compra
            costoTotalCompra += producto.getCantidad() * producto.getPrecio();

            // ...
            
            // Esperar 1 segundo (simulando el procesamiento)
            this.esperarXsegundos();
            
            // Imprimir información del producto procesado
        System.out.println("Compra realizada - Producto " + contCliente 
                + " - Nombre: " + producto.getNombre() 
                + " - Precio: " + producto.getPrecio() 
                + " - Cantidad: " + producto.getCantidad() 
                + " - Costo Total: " + producto.getCantidad() * producto.getPrecio() 
                + " --> Tiempo: " + (System.currentTimeMillis() - timeStamp) / 1000 + " Seg");
        contCliente++;
            
        }
        
        // Mostrar el costo total de la compra
        System.out.println("Costo total de la compra: " + costoTotalCompra);

        // Imprimir mensaje de finalización del proceso de compra
        System.out.println("\nLa cajera: " + this.nombre 
               + " ha terminado de procesar al cliente: " 
               + cliente.getNombre() 
               + " en el tiempo transcurrido de: " 
               + (System.currentTimeMillis() - timeStamp) / 1000 + " Seg \n \n");
    }
    
    // Método privado para esperar 1 segundo
    private void esperarXsegundos() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        
    }
    
}
