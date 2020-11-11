package br.com.desafio.models;

public class Conta {
	private int numero;
	private String agencia;
	private String tipo;
	private float limiteCheque;
	private float limiteCartao;
	
	public Conta(int numero, String agencia, String tipo, Pessoa pessoa, Float limiteCheque) {
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.limiteCheque = limiteCheque;
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
	public float getlimiteCheque() {
		return limiteCheque;
	}
	public void setlimiteCheque(float limiteCheque) {
		this.limiteCheque = limiteCheque;
	}
	public float getLimiteCartao() {
		return limiteCartao;
	}
	public void setLimiteCartao(float limiteCartao) {
		this.limiteCartao = limiteCartao;
	}


	
}
