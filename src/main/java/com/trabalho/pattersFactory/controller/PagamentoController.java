package com.trabalho.pattersFactory.controller;

import com.trabalho.pattersFactory.model.PagamentoModel;
import com.trabalho.pattersFactory.model.pagamentos.PagamentoAtraso;
import com.trabalho.pattersFactory.model.pagamentos.PagamentoDia;
import com.trabalho.pattersFactory.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import java.util.List;

@RestController
public class PagamentoController {

    @Autowired
    private PagamentoService service;

    @GetMapping (path = "/pagamentos")
    public List<PagamentoModel> buscarPagamento(){
        return service.buscarTodos();
    }

    @PostMapping (path = "/pagamentos")
    @ResponseStatus(HttpStatus.CREATED)
    public PagamentoModel cadastrarPagamento(@RequestBody PagamentoModel pagamentoModel){
        return service.cadastrarPagamento(pagamentoModel);
    }

    @GetMapping (path = "/pagamentos/{codigoPagamento}")
    public PagamentoModel alterarPagamento(@RequestBody PagamentoModel pagamentoModel){
        return service.alterarPagamento(pagamentoModel);
    }

    @DeleteMapping(path = "/pagamentos/{codigoPagamento}")
    public void deletarPagamento(@PathVariable Long codigoPagamento){
        service.deletarPagamento(codigoPagamento);

    }



}
