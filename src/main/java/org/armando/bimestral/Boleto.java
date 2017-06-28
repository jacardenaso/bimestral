/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.armando.bimestral;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import static jdk.nashorn.internal.runtime.Debug.id;

/**
 *
 * @author Jr.Armando
 */
@Entity
@Table(name="boleto")
public class Boleto {

    @Id
    @GeneratedValue
    @Column
    private Long id_boleto;
    @Column
    private Long id_sala;
    @Column
    private float costoBoleto;
    
    @ManyToOne
    //foreign key
    @JoinColumn(name="id_sala")
    SalaCine salaCine;

    @Override
    public String toString() {
        return "Boleto{" + "id_boleto=" + id_boleto + ", id_sala=" + id_sala + ", costoBoleto=" + costoBoleto + ", salaCine=" + salaCine + '}';
    }
    

    public Boleto() {
    }
    

    public Long getId_boleto() {
        return id_boleto;
    }

    public void setId_boleto(Long id_boleto) {
        this.id_boleto = id_boleto;
    }

    public Long getId_sala() {
        return id_sala;
    }

    public void setId_sala(Long id_sala) {
        this.id_sala = id_sala;
    }

    public float getCostoBoleto() {
        return costoBoleto;
    }

    public void setCostoBoleto(float costoBoleto) {
        this.costoBoleto = costoBoleto;
    }

    public Boleto(Long id_boleto, Long id_sala, float costoBoleto) {
        this.id_boleto = id_boleto;
        this.id_sala = id_sala;
        this.costoBoleto = costoBoleto;
    }
    
     
    
}
