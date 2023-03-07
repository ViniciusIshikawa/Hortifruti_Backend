package com.hortifruti.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.hortifruti.domain.Produto;
import com.hortifruti.domain.enums.TipoAlimento;

public class ProdutoDTO implements Serializable {
	private static final long serialVersionUID = 1L;


	private Integer id;
	
	@NotEmpty(message = "Nome obrigatório")
	private String nome;
	
	@NotNull(message = "Preço obrigatório")
	private Double preco;
	
	@NotNull(message = "Tipo do alimento obrigatório")
	private Integer tipoAlimento;
	
	public ProdutoDTO() {}
	

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

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public Integer getTipoAlimento() {
		return tipoAlimento;
	}
	
	public void setTipoAlimento(Integer tipoAlimento) {
		this.tipoAlimento = tipoAlimento;
	}

}
