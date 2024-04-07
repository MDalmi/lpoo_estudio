/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.lpoo_danca.model;

/**
 *
 * @author dalmi
 */
class Pacotes {
    
    private Integer id;
    private String descricao;
    private Double valor;
    private Modalidades modalidade;

    public Pacotes() {
    }

    public Pacotes(Integer id, String descricao, Double valor, Modalidades modalidade) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
        this.modalidade = modalidade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Modalidades getModalidade() {
        return modalidade;
    }

    public void setModalidade(Modalidades modalidade) {
        this.modalidade = modalidade;
    }
    
    
    
    
}
