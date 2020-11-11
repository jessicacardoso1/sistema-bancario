package br.com.desafio.models;


public class Pessoa {
	
	private String nome;
	private int score;
	private PessoaFisica pessoaFisica;
	private PessoaJuridica pessoaJuridica;
	private Conta conta;
	

	public Pessoa(String nome, int score, PessoaFisica pessoaFisica, 
			PessoaJuridica pessoaJuridica, Conta conta) {
		this.nome = nome;
		this.score = score;
		this.pessoaFisica = pessoaFisica;
		this.pessoaJuridica = pessoaJuridica;
		this.conta = conta;
	}
	public Pessoa() {}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public PessoaFisica getPessoaFisica() {
		return pessoaFisica;
	}

	public void setPessoaFisica(PessoaFisica pessoaFisica) {
		this.pessoaFisica = pessoaFisica;
	}

	public PessoaJuridica getPessoaJuridica() {
		return pessoaJuridica;
	}

	public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
		this.pessoaJuridica = pessoaJuridica;
	}

}
