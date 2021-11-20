package com.example.strategy.strategy;

import com.example.strategy.service.provider.Jadlog;
import com.example.strategy.strategy.interfaces.ShippingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Shipping_JADLOG")
public class JadlogStrategy implements ShippingStrategy {

    @Autowired
    private Jadlog jadlog;

    @Override
    public Double calculaFrete(Double peso) {
        return jadlog.calculaFreteJadLog(peso);
    }
}
