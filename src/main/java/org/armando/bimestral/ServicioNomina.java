/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.armando.bimestral;

import org.springframework.stereotype.Service;

/**
 *
 * @author Jr.Armando
 */
@Service
public class ServicioNomina {
    public Nomina servicioPagarNomina(){
    Nomina n=new TrabajadorHonorarios();
    return n;
    }
}
