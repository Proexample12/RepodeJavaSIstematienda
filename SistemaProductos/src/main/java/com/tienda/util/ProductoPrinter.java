package com.tienda.util;

import com.tienda.model.Producto;

public class ProductoPrinter {
    public static void mostrarProducto(Producto producto) {
        System.out.println("Código: " + producto.getCodigo() +
                ", Nombre: " + producto.getNombre() +
                ", Precio: " + producto.getPrecio() +
                ", Cantidad: " + producto.getCantidad());
        System.out.println("Monto total: " + producto.calcularMonto());
        System.out.println("Disponible: " + (producto.disponible() ? "Sí" : "No") + "\n");
    }
}
