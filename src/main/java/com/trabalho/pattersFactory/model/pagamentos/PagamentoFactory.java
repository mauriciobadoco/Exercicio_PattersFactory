package com.trabalho.pattersFactory.model.pagamentos;

import org.hibernate.boot.model.relational.internal.SqlStringGenerationContextImpl;

public class PagamentoFactory {

    public CalculoPagamento calculoPagamento(String tipoDePagamento) {

        if (tipoDePagamento.equalsIgnoreCase("PAGAMENTO_ATRASADO")) {
            return new PagamentoAtraso();
        } else {
            return new PagamentoDia();
        }
    }
}
