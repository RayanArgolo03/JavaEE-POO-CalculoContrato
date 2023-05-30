
package com.servicos.exercicios;

import java.util.Date;

public class ServicoPayPal implements ServicoPagamentoOnline{
    
    public static final double VALOR_JUROS_MES = 0.01d;
    public static final double VALOR_TAXA = 0.02d;

    
    @Override
    public double calcularJuros(int mes, double valor) {
        return valor * VALOR_JUROS_MES * mes; 
    }

    @Override
    public double calcularTaxa(double valor) {
        return valor * VALOR_TAXA;
    }
    
}
