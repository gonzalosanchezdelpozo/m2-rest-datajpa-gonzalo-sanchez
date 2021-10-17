package com.example.m2restdatajpagonzalosanchez.repository;

import com.example.m2restdatajpagonzalosanchez.entities.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {

    List<Libro> findByTitulo(String titulo);


}
