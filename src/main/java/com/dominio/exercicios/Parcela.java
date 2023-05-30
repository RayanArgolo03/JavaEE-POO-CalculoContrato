
package com.dominio.exercicios;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Parcela {
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
    private Date dataVencimento;
    private double valorTotal;

    public Parcela(Date dataVencimento, double valorTotal) {
        this.dataVencimento = dataVencimento;
        this.valorTotal = valorTotal;
    }

    public Parcela() {
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return sdf.format(dataVencimento) + " - " + String.format("%.2f", valorTotal);
    }
    
    
}
