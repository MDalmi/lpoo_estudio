/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.lpoo_danca.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author dalmi
 */

@Entity
public class itensContratos implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer idContrato;
    
    @Column(nullable = false)
    private Integer idPacote;
    
    @Column(nullable = false)
    private Contratos contrato;
    
    @Column(nullable = false)
    private Pacotes pacote;

    public itensContratos() {
    }

    public itensContratos(Integer idContrato, Integer idPacote, Contratos contrato, Pacotes pacote) {
        this.idContrato = idContrato;
        this.idPacote = idPacote;
        this.contrato = contrato;
        this.pacote = pacote;
    }

    
    

    public Integer getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(Integer idContrato) {
        this.idContrato = idContrato;
    }

    public Integer getIdPacote() {
        return idPacote;
    }

    public void setIdPacote(Integer idPacote) {
        this.idPacote = idPacote;
    }

    public Contratos getContrato() {
        return contrato;
    }

    public void setContrato(Contratos contrato) {
        this.contrato = contrato;
    }

    public void setPacote(Pacotes pacote) {
        this.pacote = pacote;
    }

    public Pacotes getPacote() {
        return pacote;
    }
    
    
    
}
