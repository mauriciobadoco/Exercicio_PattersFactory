package com.trabalho.pattersFactory.model.recebimentos;

import com.trabalho.pattersFactory.model.RecebimentosModel;

import java.math.BigDecimal;

public class CartaoDebito implements CalculoRecebimentos{


    @Override
    public BigDecimal calculoRecebimento(RecebimentosModel recebimentosModel) {
        BigDecimal resultado = recebimentosModel.getValorReceber().subtract(recebimentosModel.getValorReceber().multiply(new BigDecimal("0.025")));
        return resultado;
    }
}
