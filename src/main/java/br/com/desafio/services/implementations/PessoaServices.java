package br.com.desafio.services.implementations;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import br.com.desafio.models.Conta;
import br.com.desafio.models.Pessoa;

@Service
public class PessoaServices {
	
	public Pessoa cadastroPessoa(Pessoa pessoaParam, List<Pessoa> listaPessoa, List<Conta> listaConta) {
		Conta conta = new Conta();
		conta.setNumero(2244556);
		conta.setAgencia("pernambues");
		conta.setTipo("corrente");
		
		Random random = new Random();
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(pessoaParam.getNome());
		pessoa.setScore(random.nextInt(10));
		pessoa.setPessoaFisica(pessoaParam.getPessoaFisica());
		pessoa.setConta(conta);
		listaPessoa.add(pessoa);
		listaConta.add(conta);
		return pessoa;
	}
	
	public List<Pessoa> listarPessoas(){
		ArrayList<Pessoa> pessoas = new ArrayList<>();
		
		return pessoas;
	}
	
	public List<Conta> listarContas(){
		ArrayList<Conta> contas = new ArrayList<>();
	
		return contas;
	}
}
