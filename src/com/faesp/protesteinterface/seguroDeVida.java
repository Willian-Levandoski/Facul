package com.faesp.protesteinterface;

public class seguroDeVida extends servicosBanco {
	private double valorSeguro;

	public double getValorSeguro() {
		return valorSeguro;
	}

	public void setValorSeguro(double valorSeguro) {
		this.valorSeguro = valorSeguro;
	}

	@Override
	public double calculaImposto() {
		
		return valorSeguro * 0.2;
	}

	public seguroDeVida(double valorSeguro) {
		this.valorSeguro = valorSeguro;
	}

}
