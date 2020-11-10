package br.com.desafio.models;

public class PessoaJuridica extends Pessoa{
	private int numDoc[]  =  new int[14];
	

	public PessoaJuridica(String nome, Conta conta, int[] numDoc) {
		super(nome, conta);
		this.numDoc = numDoc;
	}

	public int[] getNumDoc() {
		return numDoc;
	}

	public void setNumDoc(int numDoc[]) {
		this.numDoc = numDoc;
	}
}
