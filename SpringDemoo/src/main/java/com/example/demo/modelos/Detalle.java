package com.example.demo.modelos;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

@Table(name="detalles")
@Entity
public class Detalle {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String costoTotal;
    private String cantidadProductos;

    public Detalle() {
    }

    public Detalle(Integer id, String costoTotal, String cantidadProductos) {
        this.id = id;
        this.costoTotal = costoTotal;
        this.cantidadProductos = cantidadProductos;
    }
}
