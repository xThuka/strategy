package com.example.strategy.dto;

import lombok.Data;

@Data
public class FreteServico {

    public FreteServico(FreteType frete, Double peso, Double valor){
        this.frete = frete;
        this.peso = peso;
        this.valor = valor;
    }

    private FreteType frete;
    private Double peso;
    private Double valor;

}
