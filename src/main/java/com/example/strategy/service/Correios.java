package com.example.strategy.service;

public class Correios {

    public Double calculaRemessa(String servico, Double peso){
        Double valor = 0D;

        if (servico.equals("PAC"))
            valor = 10D;

        else if (servico.equals("SEDEX"))
            valor = 30D;

        return valor;
    }

}
