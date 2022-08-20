package com.trabalho.pattersFactory.model.recebimentos;

import com.trabalho.pattersFactory.model.RecebimentosModel;

import java.math.BigDecimal;

public class DinPixCheque implements CalculoRecebimentos {


    @Override
    public BigDecimal calculoRecebimento(RecebimentosModel recebimentosModel) {
        return recebimentosModel.getValorReceber();
    }
}

