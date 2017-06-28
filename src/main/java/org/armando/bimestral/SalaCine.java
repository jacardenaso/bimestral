/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.armando.bimestral;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Jr.Armando
 */
@Entity
@Table(name="salacine")

public class SalaCine {
    
    @Id
    @Column
    private Long id_sala;
    
    @Column(name="tituloPelicul")
    private String tituloPelicula;
    @Column(name="clasificacion")
    private String clasificacion;
    @Column(name="numeroAsientos")
    private Integer numeroAsientos;

    @Override
    public String toString() {
        return "SalaCine{" + "id_sala=" + id_sala + ", tituloPelicula=" + tituloPelicula + ", clasificacion=" + clasificacion + ", numeroAsientos=" + numeroAsientos + '}';
    }

    public SalaCine() {
    }

    public SalaCine(Long id_sala, String tituloPelicula, String clasificacion, Integer numeroAsientos) {
        this.id_sala = id_sala;
        this.tituloPelicula = tituloPelicula;
        this.clasificacion = clasificacion;
        this.numeroAsientos = numeroAsientos;
    }

    public Long getId_sala() {
        return id_sala;
    }

    public void setId_sala(Long id_sala) {
        this.id_sala = id_sala;
    }

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public void setTituloPelicula(String tituloPelicula) {
        this.tituloPelicula = tituloPelicula;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public Integer getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(Integer numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }
    
}
