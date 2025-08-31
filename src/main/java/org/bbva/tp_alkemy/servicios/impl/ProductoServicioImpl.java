package org.bbva.tp_alkemy.servicios.impl;

import org.bbva.tp_alkemy.modelo.Producto;
import org.bbva.tp_alkemy.repositorio.ProductoRepositorio;
import org.bbva.tp_alkemy.servicios.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class ProductoServicioImpl implements ProductoService {

        @Autowired
        private ProductoRepositorio productoRepositorio;

        @Override
        public List<Producto> getAllProductos() {
            return productoRepositorio.findAll();
        }


}
