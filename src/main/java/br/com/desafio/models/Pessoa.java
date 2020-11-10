package br.com.desafio.models;

import java.util.Random;

public class Pessoa {
	
	private String nome;
	private int score;
	private PessoaFisica pessoaFisica;
	private PessoaJuridica pessoaJuridica;
	private Conta conta;
	

	public Pessoa(String nome, Conta conta) {
		Random random = new Random();
		this.nome = nome;
		this.score = random.nextInt(10);
		this.conta = conta;
	}

	public int getScore() {
		return score;
	}

	public void setScore() {
		Random random = new Random();
		this.score = random.nextInt(10);
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

}
