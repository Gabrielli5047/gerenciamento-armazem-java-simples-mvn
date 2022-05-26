package com.br.gabrielli.armazem.gerenciamento.service;

import java.util.List;

import com.br.gabrielli.armazem.gerenciamento.dao.produtoDAO;
import com.br.gabrielli.armazem.gerenciamento.model.Produto;
import com.br.gabrielli.armazem.gerenciamento.util.Mensagem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class produtoService implements IprodutoService {

    @Autowired
    private produtoDAO dao;

    @Override
    public List<Produto> recuperarTodos() {
        List<Produto> lista = (List<Produto>) dao.findAll();
        return lista;
    }

    @Override
    public ResponseEntity<?> recuperarProduto( Integer id) {
        Produto res = dao.findById(id).orElse(null);
        if (res != null) {
			return ResponseEntity.ok(res);
		}
		return ResponseEntity.status(404).body(new Mensagem(404,"Produto nao encontrado"));
    }

	@Override
	public Produto addProduto(Produto novo) {
		Produto novoprod = dao.save(novo);
		return novoprod;
	}
    
}
