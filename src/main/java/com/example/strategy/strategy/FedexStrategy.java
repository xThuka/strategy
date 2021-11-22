package com.example.strategy.strategy;

import com.example.strategy.service.provider.Fedex;
import com.example.strategy.strategy.interfaces.ShippingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Shipping_FEDEX")
public class FedexStrategy implements ShippingStrategy {

    @Autowired
    private Fedex fedex;

    @Override
    public Double calculaFrete(Double peso) {
        return fedex.shippingPrice(peso);
    }
}
