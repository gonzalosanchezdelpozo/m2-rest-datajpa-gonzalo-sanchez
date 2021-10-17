package com.example.m2restdatajpagonzalosanchez.controller;

import com.example.m2restdatajpagonzalosanchez.entities.Libro;
import com.example.m2restdatajpagonzalosanchez.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibroController {

    // atributos
    // opcion 1 para añadir repositorio(@autowired): NO RECOMENDADO
    // @Autowired
    // LibroRepository repository;

    // opcion 2 crear un constructor: SI RECOMENDADO

    LibroRepository repository;

    //constructores
    public LibroController(LibroRepository repository) {
        this.repository = repository;
    }

    //metodos
    //trabajamos con listas cuando queremos recuperar todos los elementos
    @GetMapping("/libros")
    public List<Libro> findAll(){
        return  repository.findAll();


    }
    //Cuando queremos recuperar un elemento
    @PostMapping("/libros")
    public void create(@RequestBody Libro libro) {
        // almacenar el libro en base de datos
        if(libro.getId() == null)

        repository.save(libro);


    }

    // Actualizar un registro en la base de datos, id viene distinto de null
    @PutMapping("/libros")
    public void update(@RequestBody Libro libro){



        if(libro.getId()!= null &&  repository.existsById(libro.getId()))

        repository.save(libro);

    }

    @DeleteMapping("/libros/{id}")
    public void DeleteById(@PathVariable Long id){

        if(repository.existsById(id))

           repository.deleteAllById(id);


    }

}
