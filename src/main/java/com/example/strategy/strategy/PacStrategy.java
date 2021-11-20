package com.example.strategy.strategy;

import com.example.strategy.dto.FreteType;
import com.example.strategy.service.provider.Correios;
import com.example.strategy.strategy.interfaces.ShippingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Shipping_PAC")
public class PacStrategy implements ShippingStrategy {

    @Autowired
    private Correios correios;

    @Override
    public Double calculaFrete(Double peso) {
        return correios.calculaRemessa(FreteType.PAC.name(), peso);
    }
}
