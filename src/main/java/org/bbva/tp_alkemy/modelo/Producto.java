package org.bbva.tp_alkemy.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "producto")
public class Producto {

    @Id
    private String id;
    private String nombre;
    private String marca;
    private double stock;

    public Producto(String nombre, String marca, double stock) {
        this.nombre = nombre;
        this.marca = marca;
        this.stock = 3;
    }

    // Getters y Setters para que la API pueda leer los datos
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getMarca() { return marca; }
    public double getStock() { return stock; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setMarca(String marca) { this.nombre = marca; }
    public void setStock(double stock) { this.stock = stock; }

}
