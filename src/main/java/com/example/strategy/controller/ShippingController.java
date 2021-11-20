package com.example.strategy.controller;

import com.example.strategy.service.Frete;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ShippingController {

    @GetMapping("/{frete}/{peso}")
    public ResponseEntity<Double> frete(@PathVariable("frete") String servico,
                                      @PathVariable("peso") Double peso) throws Exception {
        return ResponseEntity.ok().body(new Frete().calcula(servico, peso));
    }

}
