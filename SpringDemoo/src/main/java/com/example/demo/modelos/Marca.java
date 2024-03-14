package com.example.demo.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Table(name="marcas")
@Entity
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private  String nombre;
    private String nit;
    private LocalDate añoCreacion;
    private String sedePrincipal;


    public Marca() {
    }

    public Marca(Integer id, String nombre, String nit, LocalDate añoCreacion, String sedePrincipal) {
        this.id = id;
        this.nombre = nombre;
        this.nit = nit;
        this.añoCreacion = añoCreacion;
        this.sedePrincipal = sedePrincipal;
    }
}
