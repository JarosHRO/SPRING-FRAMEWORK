/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 *
 * @author Jairo
 */
@Entity
public class citas {
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Date dma;    
    private byte horacita;
    private String especialidad;
    
    
   


    public Date getDma() {
        return dma;
    }

    public void setDma(Date dma) {
        this.dma = dma;
    }

    public byte getHoraCita() {
        return horacita;
    }

    public void setHoraCita(byte horacita) {
        this.horacita = horacita;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    
}
