package com.tienda.service;

import com.tienda.model.Producto;
import com.tienda.util.ProductoPrinter;
import java.util.ArrayList;
import java.util.List;

public class ProductoServiceImpl implements ProductoService {
    private List<Producto> productos = new ArrayList<>();

    @Override
    public void registrarProducto(Producto producto) {
        productos.add(producto);
        ProductoPrinter.mostrarProducto(producto);  // Delega UI
    }

    @Override
    public double calcularValorTotalInventario() {
        return productos.stream()
                .mapToDouble(Producto::calcularMonto)
                .sum();
    }
}