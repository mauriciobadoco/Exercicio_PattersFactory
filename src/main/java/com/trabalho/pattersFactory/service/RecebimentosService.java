package com.trabalho.pattersFactory.service;

import com.trabalho.pattersFactory.model.PagamentoModel;
import com.trabalho.pattersFactory.model.RecebimentosModel;
import com.trabalho.pattersFactory.model.pagamentos.PagamentoFactory;
import com.trabalho.pattersFactory.model.recebimentos.RecebimentosFactory;
import com.trabalho.pattersFactory.repository.PagamentoRepository;
import com.trabalho.pattersFactory.repository.RecebimentosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
@Service
public class RecebimentosService {
    @Autowired

    private RecebimentosRepository repository;

    public List<RecebimentosModel> buscarTodos(){
        return repository.findAll();
    }

    public RecebimentosModel cadastrarRecebimento(RecebimentosModel recebimentosModel){
        RecebimentosFactory recebimentosFactory = new RecebimentosFactory();
        BigDecimal resultado = recebimentosFactory.calculoRecebimentos(recebimentosModel.getTipoRecebimento()).calculoRecebimento(recebimentosModel);

        recebimentosModel.getCodigoRecebimento();
        recebimentosModel.getTipoRecebimento();
        recebimentosModel.getValorReceber();
        recebimentosModel.setValorRecebido(resultado);
        return repository.save(recebimentosModel);
    }

    public RecebimentosModel alterarRecebimento(RecebimentosModel recebimentosModel){
        RecebimentosFactory recebimentosFactory = new RecebimentosFactory();
        BigDecimal resultado = recebimentosFactory.calculoRecebimentos(recebimentosModel.getTipoRecebimento()).calculoRecebimento(recebimentosModel);

        recebimentosModel.getCodigoRecebimento();
        recebimentosModel.getTipoRecebimento();
        recebimentosModel.getValorReceber();
        recebimentosModel.setValorRecebido(resultado);
        return repository.save(recebimentosModel);
    }

    public void deletarRecebimento(Long codigoRecebimento){
        repository.deleteById(codigoRecebimento);
    }
}
