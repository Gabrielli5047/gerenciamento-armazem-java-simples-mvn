package com.br.gabrielli.armazem.gerenciamento.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {
    
    @Id
	@Column(name = "id", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

    @Column(name = "nome", nullable = false, length = 50, unique = true)
	private String nome;

    @Column(name = "quantidade", nullable = false, length = 50, unique = true)
	private Integer quantidade;

    public Integer getId() {
		return id;
	}

    public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

    public Integer getQuantidade() {
		return quantidade;
	}

    public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

    public Produto orElse(Object object) {
        return null;
    }

}
