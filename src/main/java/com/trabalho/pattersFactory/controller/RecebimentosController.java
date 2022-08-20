package com.trabalho.pattersFactory.controller;

import com.trabalho.pattersFactory.model.PagamentoModel;
import com.trabalho.pattersFactory.model.RecebimentosModel;
import com.trabalho.pattersFactory.service.PagamentoService;
import com.trabalho.pattersFactory.service.RecebimentosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class RecebimentosController {

    @Autowired
    private RecebimentosService service;

    @GetMapping(path = "/recebimentos")
    public List<RecebimentosModel> buscarRecebimento(){
        return service.buscarTodos();
    }

    @PostMapping(path = "/recebimentos")
    @ResponseStatus(HttpStatus.CREATED)
    public RecebimentosModel cadastrarRecebimento(@RequestBody RecebimentosModel recebimentosModel){
        return service.cadastrarRecebimento(recebimentosModel);
    }

    @GetMapping (path = "/recebimentos/{codigoRecebimento}")
    public RecebimentosModel alterarRecebimento(@RequestBody RecebimentosModel recebimentosModel){
        return service.alterarRecebimento(recebimentosModel);
    }

    @DeleteMapping(path = "/recebimentos/{codigoRecebimento}")
    public void deletarRecebimento(@PathVariable Long codigoRecebimento){
        service.deletarRecebimento(codigoRecebimento);

    }
}
