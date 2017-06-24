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
public class Boleto {
    private Integer id_boleto;
    private Integer id_sala;
    private float costoBoleto;

    public Boleto() {
    }
    

    public Integer getId_boleto() {
        return id_boleto;
    }

    public void setId_boleto(Integer id_boleto) {
        this.id_boleto = id_boleto;
    }

    public Integer getId_sala() {
        return id_sala;
    }

    public void setId_sala(Integer id_sala) {
        this.id_sala = id_sala;
    }

    public float getCostoBoleto() {
        return costoBoleto;
    }

    public void setCostoBoleto(float costoBoleto) {
        this.costoBoleto = costoBoleto;
    }

    public Boleto(Integer id_boleto, Integer id_sala, float costoBoleto) {
        this.id_boleto = id_boleto;
        this.id_sala = id_sala;
        this.costoBoleto = costoBoleto;
    }
    
     
    
}
