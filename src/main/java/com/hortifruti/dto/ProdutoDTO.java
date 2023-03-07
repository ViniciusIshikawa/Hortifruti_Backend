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
	private TipoAlimento tipoAlimento;
	
	public ProdutoDTO() {}
	
	public ProdutoDTO(Produto obj) {
		id = obj.getId();
		nome = obj.getNome();
		preco = obj.getPreco();
		tipoAlimento = obj.getTipoAlimento();
	}

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
	
	public TipoAlimento getTipoAlimento() {
		return tipoAlimento;
	}
	
	public void setTipoAlimento(TipoAlimento tipoAlimento) {
		this.tipoAlimento = tipoAlimento;
	}

}
