package com.example.strategy.service.provider;

import org.springframework.stereotype.Service;

@Service
public class Correios {

    public Double calculaRemessa(String servico, Double peso){
        Double valor = 0D;

        if (servico.equals("PAC"))
            valor = peso*10D;

        else if (servico.equals("SEDEX"))
            valor = peso*30D;

        return valor;
    }

}
