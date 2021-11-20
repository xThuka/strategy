package com.example.strategy.service.provider;

import org.springframework.stereotype.Service;

@Service
public class TNT {
    public Double shippingPriceCalculator(Double peso) {
        return peso*11D;
    }
}
