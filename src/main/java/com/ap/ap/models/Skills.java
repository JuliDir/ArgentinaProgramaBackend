/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ap.ap.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author InfoSoporte
 */
@Entity
public class Skills {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long idSkills;
   private String nombreSkill;
   private int porcentajeSkill;
    
   public Skills(){
   }

    public Skills(Long idSkills, String nombreSkill, int porcentaje) {
        this.idSkills = idSkills;
        this.nombreSkill = nombreSkill;
        this.porcentajeSkill = porcentaje;
    }

    public long getIdSkill() {
        return idSkills;
    }

    public void setIdSkill(Long idSkill) {
        this.idSkills = idSkill;
    }

    public String getNombreSkill() {
        return nombreSkill;
    }

    public void setNombreSkill(String nombreSkill) {
        this.nombreSkill = nombreSkill;
    }

    public int getPorcentaje() {
        return porcentajeSkill;
    }

    public void setPorcentaje(int porcentajeSkill) {
        this.porcentajeSkill= porcentajeSkill;
    }
   
   
    
}
