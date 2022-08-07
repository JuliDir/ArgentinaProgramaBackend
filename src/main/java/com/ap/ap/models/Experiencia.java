/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ap.ap.models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author InfoSoporte
 */
@Entity
public class Experiencia {
   @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExp; 
    private String tituloExp; 
    private int fechaInicioExp;
    private int fechaFinExp;
    private String descExp; 
    private String imagenExp;

    private String nombreExp;
    
    public Experiencia(){
        
    }

    public Experiencia(Long idExp, String tituloExp, int fechaInicioExp, int fechaFinExp, String descExp, String imagenExp, String nombreExp) {
        this.idExp = idExp;
        this.tituloExp = tituloExp;
        this.fechaInicioExp = fechaInicioExp;
        this.fechaFinExp = fechaFinExp;
        this.descExp = descExp;
        this.imagenExp = imagenExp;
        this.nombreExp = nombreExp;
    }

    public long getIdExp() {
        return idExp;
    }

    public void setIdExp(Long idExp) {
        this.idExp = idExp;
    }

    public String getTituloExp() {
        return tituloExp;
    }

    public void setTituloExp(String tituloExp) {
        this.tituloExp = tituloExp;
    }

    public int getFechaInicioExp() {
        return fechaInicioExp;
    }

    public void setFechaInicioExp(int fechaInicioExp) {
        this.fechaInicioExp = fechaInicioExp;
    }

    public int getFechaFinExp() {
        return fechaFinExp;
    }

    public void setFechaFinExp(int fechaFinExp) {
        this.fechaFinExp = fechaFinExp;
    }

    public String getDescExp() {
        return descExp;
    }

    public void setDescExp(String descExp) {
        this.descExp = descExp;
    }

    public String getImagenExp() {
        return imagenExp;
    }

    public void setImagenExp(String imagenExp) {
        this.imagenExp = imagenExp;
    }

    public String getNombreExp() {
        return nombreExp;
    }

    public void setNombreExp(String nombreExp) {
        this.nombreExp = nombreExp;
    }
}
