/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.cc.lpoo.lpoo_danca.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author 20221PF.CC0003
 */

@Entity
public class FolhaPagamento implements Serializable{
 
    @Id
    private Integer numeroPag;
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar data;
    
    @Column(nullable = false, columnDefinition = "DECIMAL(10,2)")
    private Double valorReceber;

    public FolhaPagamento() {
    }

    public FolhaPagamento(Calendar data, Double valorReceber) {
        this.data = data;
        this.valorReceber = valorReceber;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public Double getValorReceber() {
        return valorReceber;
    }

    public void setValorReceber(Double valorReceber) {
        this.valorReceber = valorReceber;
    }
    
    public void CalcularFolhaMes(){
        
        
        
    }
    
    
}
