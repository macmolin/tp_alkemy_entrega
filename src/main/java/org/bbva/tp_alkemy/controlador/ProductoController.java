package org.bbva.tp_alkemy.controlador;


import org.bbva.tp_alkemy.modelo.Producto;
import org.bbva.tp_alkemy.repositorio.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

    @RestController
    @RequestMapping("/api/productos")
    public class ProductoController {

        @Autowired
        private ProductoRepositorio productoRepositorio;


        @GetMapping
        public List<Producto> getAllProductos() {
            return productoRepositorio.findAll();
        }


        @PostMapping
        public ResponseEntity<Producto> createProducto(@RequestBody Producto producto) {
            Producto nuevoProducto = productoRepositorio.save(producto);
            return ResponseEntity.status(HttpStatus.CREATED).body(nuevoProducto);
        }


    }

