package org.bbva.tp_alkemy.servicios;

import org.bbva.tp_alkemy.modelo.Producto;
import org.bbva.tp_alkemy.repositorio.ProductoRepositorio;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class ConexionApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConexionApplication.class, args);
        System.out.println("\n==================================================");
        System.out.println("Servidor iniciado. API lista en http://localhost:8080");
        System.out.println("Prueba el endpoint GET en: http://localhost:8080/api/productos");
        System.out.println("==================================================");
    }


    CommandLineRunner dataLoader(ProductoRepositorio repository) {
        return args -> {
            repository.save(new Producto("Laptop Gamer", "samsung", 3));
            repository.save(new Producto("Teclado Mecánico", "apple",  120));
            repository.save(new Producto("Monitor 4K", "LG", 75));
        };
    }
}
