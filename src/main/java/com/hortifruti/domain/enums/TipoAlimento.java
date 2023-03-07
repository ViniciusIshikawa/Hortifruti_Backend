package com.hortifruti.domain.enums;

public enum TipoAlimento {
	FRUTA(1, "Fruta"),
	LEGUME(2, "Legume"),
	VERDURA(3, "Verdura");
	
	private int cod;
	private String descricao;
	
	private TipoAlimento(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public static TipoAlimento toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		
		//Percorre por todos os tipos do enum
		for(TipoAlimento x : TipoAlimento.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		
		//Se n achar o cod retorna uma exceção
		throw new IllegalArgumentException("Id ínvalido: " + cod);
	}
}
