package com.tienda.service;

import com.tienda.model.Producto;
import java.util.List;

public interface ProductoService {
    void registrarProducto(Producto producto);
    double calcularValorTotalInventario();
}