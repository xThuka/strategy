package com.example.strategy.strategy;

import com.example.strategy.service.provider.Fedex;
import com.example.strategy.strategy.interfaces.ShippingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Shipping_FEDEX")
public class FedexStrategy implements ShippingStrategy {
    //todo pq um AUTOWIRED Aqui nao funciona? Tive que criar um contrutor instanciando
    private Fedex fedex;

    public FedexStrategy(){
        fedex = new Fedex();
    }

    @Override
    public Double calculaFrete(Double peso) {
        return fedex.shippingPrice(peso);
    }
}
