/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ap.ap.controller;

import com.ap.ap.models.Educacion;
import com.ap.ap.services.EducacionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author InfoSoporte
 */
@RestController
@RequestMapping("/api/educacion")
public class EducacionController {
    private final EducacionService educacionService;

    public EducacionController(EducacionService educacionService) {
        this.educacionService = educacionService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Educacion>> obtenerEducaciones(){
        List<Educacion> educaciones = educacionService.buscarEducaciones();
        return new ResponseEntity<>(educaciones, HttpStatus.OK);
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Educacion> obtenerEducacionPorId(@PathVariable("id") Long id){
        Educacion educacion = educacionService.buscarEducacionPorId(id);
        return new ResponseEntity<>(educacion, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Educacion> editarEducacion(@RequestBody Educacion educacion){
        Educacion updateEducacion = educacionService.editarEducacion(educacion);
        return new ResponseEntity<>(updateEducacion, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Educacion> crearEducacion(@RequestBody Educacion educacion){
        Educacion nuevaEducacion = educacionService.addEducacion(educacion);
        return new ResponseEntity<>(nuevaEducacion, HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> borrarEducacion(@PathVariable("id") Long id){
        educacionService.borrarEducacion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
