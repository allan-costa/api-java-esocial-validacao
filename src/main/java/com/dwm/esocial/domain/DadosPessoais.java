package com.dwm.esocial.domain;

public class DadosPessoais {
	private String mensagem = " ";
	private boolean resultadoValidacao;
	private String erros = " ";
	
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public boolean isResultadoValidacao() {
		return resultadoValidacao;
	}
	public void setResultadoValidacao(boolean resultado) {
		this.resultadoValidacao = resultado;
	}
	public String getErros() {
		return erros;
	}
	public void setErros(String erros) {
		this.erros = erros;
	}
	
	

}
