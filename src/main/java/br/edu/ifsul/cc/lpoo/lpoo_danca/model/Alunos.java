/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.lpoo_danca.model;

import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author dalmi
 */

public class Alunos extends Pessoas {

  
    private Calendar dataInicio;
    
    
    private Integer dataPgm;

    public Alunos() {
    }

    public Alunos(Calendar dataInicio, Integer dataPgm) {
        this.dataInicio = dataInicio;
        this.dataPgm = dataPgm;
    }

    public Alunos(Calendar dataInicio, Integer dataPgm, Integer id, String nome, String fone, Calendar dataAniver, String email, String endereco) {
        super(id, nome, fone, dataAniver, email, endereco);
        this.dataInicio = dataInicio;
        this.dataPgm = dataPgm;
    }

    public Calendar getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Calendar dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Integer getDataPgm() {
        return dataPgm;
    }

    public void setDataPgm(Integer dataPgm) {
        this.dataPgm = dataPgm;
    }

}
