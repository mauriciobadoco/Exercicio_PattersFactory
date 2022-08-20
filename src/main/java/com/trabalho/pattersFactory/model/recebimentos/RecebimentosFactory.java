package com.trabalho.pattersFactory.model.recebimentos;

public class RecebimentosFactory {

    public CalculoRecebimentos calculoRecebimentos (String tipoPagamento){

        switch (tipoPagamento){
            case"CARTAO_DE_CREDITO":
                return new CartaoCredito();
            case"CARTAO_DE_DEBITO":
                return new CartaoDebito();
            case"DIN_PIX_CHEQUE":
                return new DinPixCheque();
            case"VALE_REFEICAO":
                return new ValeRefeicao();
            default:
                return null;

        }
    }
}
