package com.example.demo.modelos;

import jakarta.persistence.*;

@Entity
@Table(name="usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombres;
    private String apellidos;
    private String cedula;
    private String correo;
    private String telefono;
    private String direccion;
    private String sexo;
    private String mediopago;
    private String pais;
    private String departamento;
    private String municipio;
    private String codigopostal;


    public Usuario() {
    }

    public Usuario(Integer id, String nombres, String apellidos, String cedula, String correo, String telefono, String direccion, String sexo, String mediopago, String pais, String departamento, String municipio, String codigopostal) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.cedula = cedula;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.sexo = sexo;
        this.mediopago = mediopago;
        this.pais = pais;
        this.departamento = departamento;
        this.municipio = municipio;
        this.codigopostal = codigopostal;
    }
}
