package com.tienda;

import com.tienda.model.Producto;
import com.tienda.service.ProductoService;
import com.tienda.service.ProductoServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cantidad de productos a ingresar: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        ProductoService service = new ProductoServiceImpl();  // Interface referenciada

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Producto " + (i + 1) + " ---");
            System.out.print("Código: ");
            String codigo = scanner.nextLine();
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Precio: ");
            double precio = scanner.nextDouble();
            System.out.print("Cantidad: ");
            int cantidad = scanner.nextInt();
            scanner.nextLine();

            Producto p = new Producto(codigo, nombre, precio, cantidad);
            service.registrarProducto(p);
        }

        System.out.println("\nValor total del inventario: " +
                String.format("%.2f", service.calcularValorTotalInventario()));
        scanner.close();
    }
}
