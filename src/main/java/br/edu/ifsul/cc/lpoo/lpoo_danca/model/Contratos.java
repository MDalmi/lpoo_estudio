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
  
    private Alunos aluno;
    private Collection<itensContratos> itensContrato;
    private FormaPgt formaPgt;
    

    public Contratos() {
    }

    public Contratos(Integer id, Integer dataInicio, Double valorDesconto, Alunos aluno, Collection<itensContratos> itensContrato, FormaPgt formaPgt) {
        this.id = id;
        this.dataInicio = dataInicio;
        this.valorDesconto = valorDesconto;
        this.aluno = aluno;
        this.itensContrato = itensContrato;
        this.formaPgt = formaPgt;
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

    public void setFormaPgt(FormaPgt formaPgt) {
        this.formaPgt = formaPgt;
    }

    public FormaPgt getFormaPgt() {
        return formaPgt;
    }

    public void setItensContrato(Collection<itensContratos> itensContrato) {
        this.itensContrato = itensContrato;
    }

    public Collection<itensContratos> getItensContrato() {
        return itensContrato;
    }

    


    public Alunos getAluno() {
        return aluno;
    }

    public void setAluno(Alunos aluno) {
        this.aluno = aluno;
    }
    
     
    
    
    
}
