package com.example.strategy.service.provider;

import org.springframework.stereotype.Service;

@Service
public class Jadlog {
    public Double calculaFreteJadLog(Double peso) {
        return peso*34D;
    }

}
