/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.lpoo_danca.model;

import java.util.Collection;

/**
 *
 * @author dalmi
 */
public class Contratos {
    
    private Integer id;
    private Integer dataInicio;
    private Double valorDesconto;
    private String formaPgto;
    private Alunos aluno;
    private Collection<itensContratos> itensContrato;
    

    public Contratos() {
    }

    public Contratos(Integer id, Integer dataInicio, Double valorDesconto, String formaPgto, Alunos aluno, Collection<itensContratos> itensContrato) {
        this.id = id;
        this.dataInicio = dataInicio;
        this.valorDesconto = valorDesconto;
        this.formaPgto = formaPgto;
        this.aluno = aluno;
        this.itensContrato = itensContrato;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Integer dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(Double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public String getFormaPgto() {
        return formaPgto;
    }

    public void setFormaPgto(String formaPgto) {
        this.formaPgto = formaPgto;
    }

    public Alunos getAluno() {
        return aluno;
    }

    public void setAluno(Alunos aluno) {
        this.aluno = aluno;
    }
    
     
    
    
    
}
