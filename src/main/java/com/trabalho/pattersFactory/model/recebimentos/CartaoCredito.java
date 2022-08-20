package com.trabalho.pattersFactory.model.recebimentos;

import com.trabalho.pattersFactory.model.RecebimentosModel;

import java.math.BigDecimal;

public class CartaoCredito implements CalculoRecebimentos{

    @Override
    public BigDecimal calculoRecebimento(RecebimentosModel recebimentosModel){
        BigDecimal resultado = recebimentosModel.getValorReceber().subtract(recebimentosModel.getValorReceber().multiply(new BigDecimal("0.37")));
        return resultado;
    }
}
