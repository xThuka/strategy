package com.example.strategy.strategy;

import com.example.strategy.strategy.interfaces.ShippingStrategy;

public class Frete {

    private ShippingStrategy servico;

    public Frete(ShippingStrategy servico){
        this.servico = servico;
    }

    public Double calculaFrete(Double peso){
        return servico.calculaFrete(peso);
    }

}
