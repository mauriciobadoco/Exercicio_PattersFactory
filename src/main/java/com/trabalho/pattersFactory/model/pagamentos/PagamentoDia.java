package com.trabalho.pattersFactory.model.pagamentos;

import com.trabalho.pattersFactory.model.PagamentoModel;

import java.math.BigDecimal;

public class PagamentoDia implements CalculoPagamento {

    @Override

    public BigDecimal calculoPagamento(PagamentoModel pagamentoModel) {
        BigDecimal resultado = pagamentoModel.getValorPagar().subtract(pagamentoModel.getDiferencaValor());
        return resultado;
    }


}
