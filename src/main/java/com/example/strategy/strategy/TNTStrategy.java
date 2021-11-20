package com.example.strategy.strategy;

import com.example.strategy.service.provider.TNT;
import com.example.strategy.strategy.interfaces.ShippingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Shipping_TNT")
public class TNTStrategy implements ShippingStrategy {

    @Autowired
    private TNT tnt;

    @Override
    public Double calculaFrete(Double peso) {
        return tnt.shippingPriceCalculator(peso);
    }
}
