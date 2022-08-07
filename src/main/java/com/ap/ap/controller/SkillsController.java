/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ap.ap.controller;

import com.ap.ap.models.Experiencia;
import com.ap.ap.models.Skills;
import com.ap.ap.services.SkillsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *
 * @author InfoSoporte
 */
@RestController
@RequestMapping("/skills")
public class SkillsController {
    private final SkillsService skillsService;

    public SkillsController(SkillsService skillsService){
        this.skillsService = skillsService;
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<Skills> obtenerSkillsPorId(@PathVariable("id") Long id){
        Skills skills = skillsService.buscarSkillsPorId(id);
        return new ResponseEntity<>(skills, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Skills>> obtenerSkills(){
        List<Skills> skills = skillsService.buscarSkills();
        return new ResponseEntity<>(skills, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<Skills> editarSkills(@RequestBody Skills skills){
        Skills updateSkills = skillsService.editarSkill(skills);
        return new ResponseEntity<>(updateSkills, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Skills> crearSkills(@RequestBody Skills skills){
        Skills nuevaSkill = skillsService.addSkill(skills);
        return new ResponseEntity<>(nuevaSkill, HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> borrarSkills(@PathVariable("id") Long id){
        skillsService.borrarSkill(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
