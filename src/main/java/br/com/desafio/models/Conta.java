package br.com.desafio.models;

public class Conta {
	private int numero;
	private String agencia;
	private String tipo;
	
	public Conta(int numero, String agencia, String tipo, Pessoa pessoa) {
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
	}
	public Conta() {}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	
}
