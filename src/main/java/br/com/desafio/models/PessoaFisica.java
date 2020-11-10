package br.com.desafio.models;

public class PessoaFisica extends Pessoa {
	
	private int numDoc[]  =  new int[11];
	
	public PessoaFisica(String nome, Conta conta, int[] numDoc) {
		super(nome, conta);
		this.setNumDoc(numDoc);
	}

	public int[] getNumDoc() {
		return numDoc;
	}

	public void setNumDoc(int numDoc[]) {
		this.numDoc = numDoc;
	}

}
