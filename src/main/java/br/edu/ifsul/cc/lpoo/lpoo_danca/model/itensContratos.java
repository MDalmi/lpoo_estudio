/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.lpoo_danca.model;

/**
 *
 * @author dalmi
 */
public class itensContratos {
    
    private Integer idContrato;
    private Integer idPacote;
    private Contratos contrato;
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
    
    
    
}
