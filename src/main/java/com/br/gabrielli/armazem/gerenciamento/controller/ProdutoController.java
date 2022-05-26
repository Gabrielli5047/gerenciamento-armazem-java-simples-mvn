package com.br.gabrielli.armazem.gerenciamento.controller;

import java.util.List;

import com.br.gabrielli.armazem.gerenciamento.model.Produto;
import com.br.gabrielli.armazem.gerenciamento.service.IprodutoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {
    @Autowired
    private IprodutoService service;

    @GetMapping("/")
    public String sayhello(){
        return "oi";
    }

    @GetMapping("/produtos")
    public ResponseEntity<List<Produto>> listarProdutos(){
        return  ResponseEntity.ok(service.recuperarTodos());
    }

    @GetMapping("/produto/{id}")
    public ResponseEntity<?> listarProduto(@PathVariable(value = "id") Integer id){
        return  service.recuperarProduto(id);
    }
    
    @PostMapping("/produto")
    public Produto addNovo(@RequestBody Produto novo) {
    	return service.addProduto(novo);
    }
}
