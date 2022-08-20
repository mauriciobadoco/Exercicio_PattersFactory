package com.trabalho.pattersFactory.model.pagamentos;

import com.trabalho.pattersFactory.model.PagamentoModel;

import java.math.BigDecimal;

public interface CalculoPagamento {

    BigDecimal calculoPagamento(PagamentoModel pagamentoModel);

}
