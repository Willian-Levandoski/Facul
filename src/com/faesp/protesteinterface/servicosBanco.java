package com.faesp.protesteinterface;

public abstract class servicosBanco {
	
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public abstract double calculaImposto();
	
	
	
	
}
