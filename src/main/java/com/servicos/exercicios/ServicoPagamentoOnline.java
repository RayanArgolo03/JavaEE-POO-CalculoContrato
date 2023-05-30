
package com.servicos.exercicios;

import java.util.Date;


public interface ServicoPagamentoOnline {
    double calcularJuros(int mes, double valor);
    double calcularTaxa(double valor);
}
