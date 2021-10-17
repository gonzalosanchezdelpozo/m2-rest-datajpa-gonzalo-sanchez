package com.example.m2restdatajpagonzalosanchez.entities;

import javax.persistence.Entity; // JPA (JAVA PERSISTENCE API) - hibernate
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Libro {

    // 1. atributos
    // 1.1 clave primaria
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    // 1.2 datos (columnas)
    private String titulo;
    private Integer numero_paginas;
    private String editorial;
    private String idioma;
    private String encuadernacion;
    private String isbn;
    private Integer anio;
    private String plaza_edicion;


    // constructores

    public Libro() {
    }

    public Libro(Long id, String titulo, Integer numero_paginas, String editorial, String idioma, String encuadernacion, String isbn, Integer anio, String plaza_edicion) {
        this.id = id;
        this.titulo = titulo;
        this.numero_paginas = numero_paginas;
        this.editorial = editorial;
        this.idioma = idioma;
        this.encuadernacion = encuadernacion;
        this.isbn = isbn;
        this.anio = anio;
        this.plaza_edicion = plaza_edicion;
    }


    // getter y setter


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getNumero_paginas() {
        return numero_paginas;
    }

    public void setNumero_paginas(Integer numero_paginas) {
        this.numero_paginas = numero_paginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getEncuadernacion() {
        return encuadernacion;
    }

    public void setEncuadernacion(String encuadernacion) {
        this.encuadernacion = encuadernacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getPlaza_edicion() {
        return plaza_edicion;
    }

    public void setPlaza_edicion(String plaza_edicion) {
        this.plaza_edicion = plaza_edicion;
    }

    // toString

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", numero_paginas=" + numero_paginas +
                ", editorial='" + editorial + '\'' +
                ", idioma='" + idioma + '\'' +
                ", encuadernacion='" + encuadernacion + '\'' +
                ", isbn='" + isbn + '\'' +
                ", anio=" + anio +
                ", plaza_edicion='" + plaza_edicion + '\'' +
                '}';
    }
}