/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.lpoo_danca.model;

import java.util.Calendar;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author dalmi
 */
@Entity
public class Professores extends Pessoas{
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar dataAdmissao;
    
    @Column(nullable = false)
    private Collection<FolhaPagamento> folhapagamento;
   
    @Column(nullable = false)
    private Collection<Modalidades> modalidades;

    
    public Professores() {
    }

    public Professores(Calendar dataAdmissao, Collection<FolhaPagamento> folhapagamento, Integer id, String nome, String fone, Calendar dataAniver, String email, String endereco) {
        super(id, nome, fone, dataAniver, email, endereco);
        this.dataAdmissao = dataAdmissao;
        this.folhapagamento = folhapagamento;
    }

    public Calendar getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Calendar dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public void setFolhapagamento(Collection<FolhaPagamento> folhapagamento) {
        this.folhapagamento = folhapagamento;
    }

    public Collection<FolhaPagamento> getFolhapagamento() {
        return folhapagamento;
    }
    
    
    
    
    
}
