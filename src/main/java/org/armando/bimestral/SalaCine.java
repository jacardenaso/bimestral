/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.armando.bimestral;

/**
 *
 * @author Jr.Armando
 */
public class SalaCine {
    
    private Integer id_sala;
    private String tituloPelicula;
    private String clasificacion;
    private Integer numeroAsientos;

    public SalaCine() {
    }

    public SalaCine(Integer id_sala, String tituloPelicula, String clasificacion, Integer numeroAsientos) {
        this.id_sala = id_sala;
        this.tituloPelicula = tituloPelicula;
        this.clasificacion = clasificacion;
        this.numeroAsientos = numeroAsientos;
    }

    public Integer getId_sala() {
        return id_sala;
    }

    public void setId_sala(Integer id_sala) {
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
