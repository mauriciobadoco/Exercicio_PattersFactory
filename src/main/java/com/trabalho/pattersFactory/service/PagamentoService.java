package com.trabalho.pattersFactory.service;

import com.trabalho.pattersFactory.model.PagamentoModel;
import com.trabalho.pattersFactory.model.pagamentos.PagamentoAtraso;
import com.trabalho.pattersFactory.model.pagamentos.PagamentoDia;
import com.trabalho.pattersFactory.model.pagamentos.PagamentoFactory;
import com.trabalho.pattersFactory.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class PagamentoService {

    @Autowired

    private PagamentoRepository repository;

    public List<PagamentoModel> buscarTodos(){
        return repository.findAll();
    }

    public PagamentoModel cadastrarPagamento(PagamentoModel pagamentoModel){
        PagamentoFactory pagamentoFactory = new PagamentoFactory();
        BigDecimal resultado = pagamentoFactory.calculoPagamento(pagamentoModel.getStatus()).calculoPagamento((pagamentoModel));

        pagamentoModel.getCodigoPagamento();
        pagamentoModel.getStatus();
        pagamentoModel.getDiferencaValor();
        pagamentoModel.getValorPagar();
        pagamentoModel.setValorPago(resultado);
        return repository.save(pagamentoModel);
    }

    public PagamentoModel alterarPagamento(PagamentoModel pagamentoModel){
        PagamentoFactory pagamentoFactory = new PagamentoFactory();
        BigDecimal resultado = pagamentoFactory.calculoPagamento(pagamentoModel.getStatus()).calculoPagamento((pagamentoModel));

        pagamentoModel.getCodigoPagamento();
        pagamentoModel.getStatus();
        pagamentoModel.getDiferencaValor();
        pagamentoModel.getValorPagar();
        pagamentoModel.setValorPago(resultado);
        return repository.save(pagamentoModel);
    }

    public void deletarPagamento(Long codigoPagamento){
        repository.deleteById(codigoPagamento);
    }



}
