package com.example.strategy.controller;

import com.example.strategy.dto.FreteServico;
import com.example.strategy.dto.FreteType;
import com.example.strategy.service.FreteService;
import com.example.strategy.strategy.DHLStrategy;
import com.example.strategy.strategy.FedexStrategy;
import com.example.strategy.strategy.Frete;
import com.example.strategy.strategy.JadlogStrategy;
import com.example.strategy.strategy.PacStrategy;
import com.example.strategy.strategy.SedexStrategy;
import com.example.strategy.strategy.TNTStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class FreteController {

    @Autowired
    private FreteService service;

    @Autowired
    private FedexStrategy fedexStrategy;

    @Autowired
    private DHLStrategy dhlStrategy;

    @Autowired
    private JadlogStrategy jadlogStrategy;

    @Autowired
    private PacStrategy pacStrategy;

    @Autowired
    private SedexStrategy sedexStrategy;

    @Autowired
    private TNTStrategy tntStrategy;

    //Exemplo usando ApplicationContext do Spring
    @GetMapping("/{frete}/{peso}")
    public ResponseEntity<FreteServico> frete(@PathVariable("frete") FreteType frete,
                                              @PathVariable("peso") Double peso){
        return ResponseEntity.ok().body(service.calculaFrete(frete, peso));
    }

    //Exemplos utilizando a classe Frete
    @GetMapping("/{peso}/fedex")
    public ResponseEntity<Double> fedex(@PathVariable("peso") Double peso){
        return ResponseEntity.ok().body(new Frete(fedexStrategy).calculaFrete(peso));
    }

    @GetMapping("/{peso}/dhl")
    public ResponseEntity<Double> dhl(@PathVariable("peso") Double peso){
        return ResponseEntity.ok().body(new Frete(dhlStrategy).calculaFrete(peso));
    }

    @GetMapping("/{peso}/jadlog")
    public ResponseEntity<Double> jadlog(@PathVariable("peso") Double peso){
        return ResponseEntity.ok().body(new Frete(jadlogStrategy).calculaFrete(peso));
    }

    @GetMapping("/{peso}/pac")
    public ResponseEntity<Double> pac(@PathVariable("peso") Double peso){
        return ResponseEntity.ok().body(new Frete(pacStrategy).calculaFrete(peso));
    }

    @GetMapping("/{peso}/sedex")
    public ResponseEntity<Double> sedex(@PathVariable("peso") Double peso){
        return ResponseEntity.ok().body(new Frete(sedexStrategy).calculaFrete(peso));
    }

    @GetMapping("/{peso}/tnt")
    public ResponseEntity<Double> tnt(@PathVariable("peso") Double peso){
        return ResponseEntity.ok().body(new Frete(tntStrategy).calculaFrete(peso));
    }

}
