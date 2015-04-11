package com.faesp.protesteinterface;

public class contaCorrente extends servicosBanco{

	public double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public double calculaImposto() {  //Falta o Overide
		
		return saldo * 0.1;
	}

	public contaCorrente(double saldo) {
		super();
		this.saldo = saldo;
	}

}
