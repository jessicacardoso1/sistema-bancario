package br.com.desafio.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import br.com.desafio.models.Conta;
import br.com.desafio.models.Pessoa;

@Service
public class PessoaServices {
	List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
	List<Conta> listaContas = new ArrayList<Conta>();
	
	public String cadastroPessoa(Pessoa pessoaParam) {
		Random randomNum = new Random(); 
		Random randomScore = new Random();
		Conta conta = new Conta();
		Pessoa pessoa = new Pessoa();
		int num = 100000 + randomNum.nextInt(900000);
		int score = randomScore.nextInt(10);
		
		conta.setNumero(num);
		conta.setAgencia(pessoaParam.getConta().getAgencia());
		if(pessoaParam.getPessoaFisica() != null) {
			conta.setTipo("C");
		}else {
			conta.setTipo("E");
		}
		
		pessoa.setNome(pessoaParam.getNome());
		pessoa.setScore(score);
		
		if(score ==0 || score ==1) {
			conta.setlimiteCheque(0);
			conta.setLimiteCartao(0);
		}else if(score >=2 || score <=5){
			conta.setlimiteCheque(1000);
			conta.setLimiteCartao(200);
		}else if(score >=6 || score <=8){
			conta.setlimiteCheque(2000);
			conta.setLimiteCartao(2000);
		}else if(score == 9){
			conta.setlimiteCheque(5000);
			conta.setLimiteCartao(1500);
		}
		
		if(pessoaParam.getPessoaFisica() != null) {
			if(pessoaParam.getPessoaFisica().getCpf().length() != 11) {
				return "CPF invalido";
			}
			pessoa.setPessoaFisica(pessoaParam.getPessoaFisica());
		}else if(pessoaParam.getPessoaJuridica() != null){ 
			if(pessoaParam.getPessoaJuridica().getCnpj().length() != 14){
				return "CNPJ invalido";
			}
			pessoa.setPessoaJuridica(pessoaParam.getPessoaJuridica());
		}else {
			return "Pessoa invalida. É necessário informar uma Pessoa Física ou Jurídica.";
		}
		
		pessoa.setConta(conta);
		listaPessoas.add(pessoa);
		listaContas.add(conta);
		
		
		return "Cadastro Realizado com sucesso";
	}
	
	public List<Pessoa> listarPessoas(){
		
		return listaPessoas;
	}
	
	public List<Conta> listarContas(){
	
		return listaContas;
	}
}
