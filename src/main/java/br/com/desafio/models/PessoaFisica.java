package br.com.desafio.models;

public class PessoaFisica{
	
	private String cpf;

	public PessoaFisica(String cpf) {
		super();
		this.cpf = cpf;
	}
	public PessoaFisica() {}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
		

}
