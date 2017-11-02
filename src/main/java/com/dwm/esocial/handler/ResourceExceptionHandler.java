package com.dwm.esocial.handler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.dwm.esocial.domain.DetalhesErro;
import com.dwm.esocial.services.exceptions.PessoaNaoEncontradaException;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(PessoaNaoEncontradaException.class)
	public ResponseEntity<DetalhesErro> handlePessoaNaoEncontradaException
						(PessoaNaoEncontradaException e, HttpServletRequest request) {
		
		DetalhesErro erro = new DetalhesErro();
		erro.setStatus(404l);
		erro.setTitulo("O funcionário não pôde ser encontrado no banco da empresa");
		erro.setTimestamp(System.currentTimeMillis());
		erro.setMensagemDesenvolvedor("http://erros.esocial.com/404");
	
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
	}
	
	
	@ExceptionHandler(DataIntegrityViolationException.class)
	public ResponseEntity<DetalhesErro> handleDataIntegrityViolationException
						(DataIntegrityViolationException e, HttpServletRequest request) {
		
		DetalhesErro erro = new DetalhesErro();
		erro.setStatus(400l);
		erro.setTitulo("Requisição inválida");
		erro.setTimestamp(System.currentTimeMillis());
		erro.setMensagemDesenvolvedor("http://erros.esocial.com/400");
	
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(erro);
	}
	
	
}
