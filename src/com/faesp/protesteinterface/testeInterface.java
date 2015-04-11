package com.faesp.protesteinterface;

public class testeInterface {

	public static void main(String[] args) {
		servicosBanco conta = new contaCorrente((double)1000);
		ImprimrStringImposto(conta);
	
		servicosBanco seguro = new seguroDeVida((double)1000);
		ImprimrStringImposto(seguro);
		
	}
	
	public static void ImprimrStringImposto(servicosBanco servico){
		System.out.println("[Imposto] de: " +servico.calculaImposto());
	}
	

}
