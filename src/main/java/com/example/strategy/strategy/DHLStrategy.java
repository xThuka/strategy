package com.example.strategy.strategy;

import com.example.strategy.service.provider.DHL;
import com.example.strategy.strategy.interfaces.ShippingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Shipping_DHL")
public class DHLStrategy implements ShippingStrategy {

    @Autowired
    private DHL dhlService;

    @Override
    public Double calculaFrete(Double peso) {
        return dhlService.priceCalculator(peso);
    }
}
