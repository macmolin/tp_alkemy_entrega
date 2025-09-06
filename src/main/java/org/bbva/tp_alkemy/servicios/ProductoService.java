package org.bbva.tp_alkemy.servicios;

import org.bbva.tp_alkemy.modelo.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {

    public List<Producto> getAllProductos();

    public Optional<Producto> getProductoById(String id);

    public Producto saveProducto(Producto producto);

}
