
package com.dominio.exercicios;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Contrato {
    
    private int numero;
    private Date data;
    private double valorTotal;
    
    List<Parcela> parcelas = new ArrayList<>();

    public Contrato(int numero, Date data, double valorTotal) {
        this.numero = numero;
        this.data = data;
        this.valorTotal = valorTotal;
    }

    public Contrato() {
    }
    
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Parcela> getParcelas() {
        return parcelas;
    }
    

    @Override
    public String toString() {
        return "Contrato{" + "numero=" + numero + ", data=" + data + ", valorTotal=" + valorTotal + '}';
    }
    
}
