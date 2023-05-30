
package com.servicos.exercicios;

import com.dominio.exercicios.Contrato;
import com.dominio.exercicios.Parcela;
import java.util.Calendar;
import java.util.Date;


public class GerarContrato {
    
    //Inversão de Controle do Serviço
    private ServicoPagamentoOnline spo;
    
    //Injeção de Dependência no Programa Principal
    public GerarContrato(ServicoPagamentoOnline spo) {
        this.spo = spo;
    }
    
    
    public void gerarContrato(Contrato contrato, int qtdParcelas){
        
        //Valor Base da Parcela
        double valorBase = contrato.getValorTotal() / qtdParcelas;
        
        //Adicionar Valor das Parcelas no Contrato
        for (int i = 1; i <= qtdParcelas; i++){
            
            double valorComJuros = valorBase + spo.calcularJuros(i, valorBase);
            double valorFinal = valorComJuros + spo.calcularTaxa(valorComJuros);
            Date data = addMeses(contrato.getData(), i);
            
            //Adicionar data a parcela
            contrato.getParcelas().add(new Parcela (data, valorFinal));
        }
    }
    
    private Date addMeses(Date data, int dia){
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);
        calendar.set(Calendar.MONTH, dia);
        return calendar.getTime();
        
    }
    
}
