package org.bbva.tp_alkemy.servicios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class ConexionApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConexionApplication.class, args);
    }
}
