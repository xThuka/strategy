package com.example.strategy.service.provider;

import org.springframework.stereotype.Service;

@Service
public class DHL {

    public Double priceCalculator(Double weight){
        return weight*6.99;
    }

}
