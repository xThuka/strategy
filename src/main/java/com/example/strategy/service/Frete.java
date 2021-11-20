package com.example.strategy.service;

public class Frete {

       public Double calcula(String servico, Double peso) throws Exception {

           Double valorTotal = null;

            if(servico.equals("sedex")) {
                Correios correios = new Correios();
                valorTotal=correios.calculaRemessa("SEDEX", peso);

            } else if(servico.equals("pac")) {
                Correios correios = new Correios();
                valorTotal=correios.calculaRemessa("PAC", peso);

            } else if(servico.equals("jadlog")) {
                Jadlog jadlog = new Jadlog();
                valorTotal=jadlog.calculaFreteJadLog(peso);

            } else if(servico.equals("dhl")) {
                DHL dhl = new DHL();
                valorTotal= dhl.priceCalculator(peso);

            } else if(servico.equals("fedex")) {
                Fedex fedex = new Fedex();
                valorTotal=fedex.shippingPrice(peso);

            } else if(servico.equals("tnt")) {
                TNT tnt = new TNT();
                valorTotal=tnt.shippingPriceCalculator(peso);

            } else {
                throw new Exception("Serviço de frete inválido");
            }

            return valorTotal;
        }

}

