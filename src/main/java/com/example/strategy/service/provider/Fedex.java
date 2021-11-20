package com.example.strategy.service.provider;

import org.springframework.stereotype.Service;

@Service
public class Fedex {
    public Double shippingPrice(Double peso) {
        return peso*34D;
    }
}
