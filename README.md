# sistema-bancario
 Este repositório é dedicado ao desafio técnico da South System
 
### Informações sobre os endpoint em Rest criados:
#### O cadastro das pessoas e contas é chamando pela operação ***localhost:8080/cadastrar*** passando como parâmetro um dos JSON abaixo: 

```json
{
	"nome":"Jessica Cardoso",
	"pessoaFisica":{
		"cpf":"11111111111"
	},
	"conta": {
            "agencia": "1544"
        }
    
}
```
```json
{
	"nome":"Jessica Cardoso",
	"pessoaJuridica":{
		"cnpj":"11111111111111"
	},
	"conta": {
            "agencia": "1544"
        }
    
}
```
#### A lista de pessoas é chamada pelo recurso  ***localhost:8080/listarPessoas*** e recebemos como resposta o JSON abaixo com um array de pessoa:

```json
{
        "nome": "Jessica Santos",
        "score": 5,
        "pessoaFisica": null,
        "pessoaJuridica": {
            "cnpj": "15423654897452"
        },
        "conta": {
            "numero": 985121,
            "agencia": "014125",
            "tipo": "E",
            "limiteCheque": 1000,
            "limiteCartao": 200
        }
    }
```
#### A lista de contas é chamada pelo recurso ***localhost:8080/listarContas*** e recebemos como resposta o JSON abaixo com array de conta:

```json
{
        "numero": 489472,
        "agencia": "1544",
        "tipo": "C",
        "limiteCheque": 1000,
        "limiteCartao": 200
}
```

