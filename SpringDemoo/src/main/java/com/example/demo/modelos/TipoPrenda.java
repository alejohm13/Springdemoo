package com.example.demo.modelos;

import jakarta.persistence.*;

@Table(name="TipodePrenda")
@Entity
public class TipoPrenda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;

    public TipoPrenda() {
    }

    public TipoPrenda(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
}
