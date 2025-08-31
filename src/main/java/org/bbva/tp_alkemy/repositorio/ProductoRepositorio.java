package org.bbva.tp_alkemy.repositorio;

import org.bbva.tp_alkemy.modelo.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductoRepositorio extends MongoRepository<Producto, String> {
}