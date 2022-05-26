package com.br.gabrielli.armazem.gerenciamento.service;

import java.util.List;

import com.br.gabrielli.armazem.gerenciamento.model.Produto;

import org.springframework.http.ResponseEntity;

public interface IprodutoService {
    public List<Produto> recuperarTodos();
    public Produto addProduto(Produto novo);
    public ResponseEntity<?> recuperarProduto(Integer id);
}
