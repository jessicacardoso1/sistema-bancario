package br.com.desafio.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafio.models.Conta;
import br.com.desafio.models.Pessoa;
import br.com.desafio.services.PessoaServices;

@RestController
public class PessoaController {
	
	
	@Autowired
    private PessoaServices pessoaService;
    
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/listarPessoas", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Pessoa> listarPessoas(){
        return pessoaService.listarPessoas();
    }
    @ResponseStatus(HttpStatus.OK)
    @RequestMapping(value = "/listarContas", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Conta> listarContas(){
        return pessoaService.listarContas();
    }
    
    
    @RequestMapping(value = "/cadastro", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces="text/plain")
    public String cadastroPessoa(@RequestBody Pessoa pessoa){
    	 return pessoaService.cadastroPessoa(pessoa);
    }
}
