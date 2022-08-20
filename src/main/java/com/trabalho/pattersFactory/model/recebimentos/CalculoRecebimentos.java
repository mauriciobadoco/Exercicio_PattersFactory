package com.trabalho.pattersFactory.model.recebimentos;

import com.trabalho.pattersFactory.model.RecebimentosModel;

import java.math.BigDecimal;

public interface CalculoRecebimentos {

    BigDecimal calculoRecebimento(RecebimentosModel recebimentosModel);
}
