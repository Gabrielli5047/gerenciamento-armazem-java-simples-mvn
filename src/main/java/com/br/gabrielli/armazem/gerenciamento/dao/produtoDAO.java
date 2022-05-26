package com.br.gabrielli.armazem.gerenciamento.dao;

import java.util.Optional;

import com.br.gabrielli.armazem.gerenciamento.model.Produto;

import org.springframework.data.repository.CrudRepository;

public interface produtoDAO extends CrudRepository<Produto, Integer> {
    public Optional<Produto> findById(Integer id);
}
