package com.example.demo.modelos;

import jakarta.persistence.*;

@Table(name="productos")
@Entity
public class Productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Integer id;
    private String nombre;
    private String referencia;
    private String cantidadBodega;
    private String precioUnitario;
    private String descripcion;
    private String fotografia;
    private String marca;

    public Productos() {
    }

    public Productos(Integer id, String nombre, String referencia, String cantidadBodega, String precioUnitario, String descripcion, String fotografia, String marca) {
        this.id = id;
        this.nombre = nombre;
        this.referencia = referencia;
        this.cantidadBodega = cantidadBodega;
        this.precioUnitario = precioUnitario;
        this.descripcion = descripcion;
        this.fotografia = fotografia;
        this.marca = marca;
    }
}
