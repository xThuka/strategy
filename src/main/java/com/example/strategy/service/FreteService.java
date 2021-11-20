package com.example.strategy.service;

import com.example.strategy.dto.FreteServico;
import com.example.strategy.dto.FreteType;
import com.example.strategy.strategy.interfaces.ShippingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class FreteService {

    @Autowired
    private ApplicationContext applicationContext;

    public FreteServico calculaFrete(FreteType freteType, Double peso){
        ShippingStrategy bean = applicationContext.getBean(String.format("Shipping_%s", freteType.name()), ShippingStrategy.class);
        return new FreteServico(freteType, peso, bean.calculaFrete(peso));
    }

}
