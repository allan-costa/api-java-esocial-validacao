package com.dwm.esocial.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dwm.esocial.domain.DadosPessoais;
import com.dwm.esocial.domain.Pessoa;
import com.dwm.esocial.services.PessoasService;

@RestController
@RequestMapping("/pessoas")
public class PessoasResources {
	
	
	boolean RESULTADO_VALIDACAO = false;
	
	@Autowired
	private PessoasService pessoasService;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<String> validar(@RequestBody Pessoa pessoa) {
		
		DadosPessoais dp = pessoasService.validar(pessoa);
		
			if(dp.isResultadoValidacao() == true) {
			pessoasService.salvar(pessoa);
			return ResponseEntity.status(HttpStatus.OK).body("Dados cadastrados com sucesso");
		}
		
		else {
			return ResponseEntity.status(HttpStatus.CONFLICT).body("Dados inválidos" + "\n" + dp.getErros());
		}
	}
	
}
