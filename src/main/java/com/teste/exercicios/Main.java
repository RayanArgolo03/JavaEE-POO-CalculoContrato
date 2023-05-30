package com.teste.exercicios;

import com.dominio.exercicios.Contrato;
import com.dominio.exercicios.Parcela;
import com.servicos.exercicios.GerarContrato;
import com.servicos.exercicios.ServicoPayPal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Número do contrato: ");
        int numero = sc.nextInt();
        
        System.out.print("Data de inicio do contrato: ");
        Date data = sdf.parse(sc.next());
        
        System.out.print("Valor do contrato: ");
        double valor = sc.nextDouble();
        
        //Novo Contrato
        Contrato contrato = new Contrato(numero, data, valor);
        
        System.out.print("Quantidade de parcelas: ");
        int parcelas = sc.nextInt();
        
        //Injetando Dependência no Serviço GerarContrato
        GerarContrato gerarContrato = new GerarContrato(new ServicoPayPal());
        
        gerarContrato.gerarContrato(contrato, parcelas);
        
        //Imprimir Parcelas
        for (Parcela parcela : contrato.getParcelas()) {
            System.out.println(parcela.toString());
        }
        
        sc.close();
    }
}
