package com.example.strategy.strategy;

import com.example.strategy.dto.FreteType;
import com.example.strategy.service.provider.Correios;
import com.example.strategy.strategy.interfaces.ShippingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Shipping_SEDEX")
public class SedexStrategy implements ShippingStrategy {

    @Autowired
    private Correios correios;

    @Override
    public Double calculaFrete(Double peso) {
        return correios.calculaRemessa(FreteType.SEDEX.name(), peso);
    }

}
