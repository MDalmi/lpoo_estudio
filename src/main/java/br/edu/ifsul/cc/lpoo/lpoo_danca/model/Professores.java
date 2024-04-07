/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.lpoo_danca.model;

import java.util.Calendar;

/**
 *
 * @author dalmi
 */
public class Professores extends Pessoas{
    
    private Calendar dataAdmissao;

    public Professores(Calendar dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    
    public Professores() {
    }

    public Professores(Calendar dataAdmissao, Integer id, String nome, String fone, Calendar dataAniver, String email, String endereco) {
        super(id, nome, fone, dataAniver, email, endereco);
        this.dataAdmissao = dataAdmissao;
    }

    public Calendar getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Calendar dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }
    
    
    
}
