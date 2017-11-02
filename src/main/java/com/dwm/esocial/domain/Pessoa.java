package com.dwm.esocial.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
public class Pessoa {
	
	@JsonInclude(Include.NON_EMPTY)
	private String nmTrab;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@JsonInclude(Include.NON_EMPTY)
	private String paisNascto; // PAÍS DE NASCIMENTO TAM 3
	
	@JsonInclude(Include.NON_EMPTY)
	private String paisNac; // NASCIONALIDADE TAM 3
	
	//@JsonInclude(Include.NON_EMPTY)
	private String sexo; // TAM 1 M/F
	
	//@JsonInclude(Include.NON_EMPTY)
	private Long racaCor;
	
	@JsonInclude(Include.NON_EMPTY)
	private Long estCiv;
	
	@JsonInclude(Include.NON_EMPTY)
	private String grauInstr; // TAM 2
	
	@JsonInclude(Include.NON_EMPTY)
	private String nmSoc;
	
	@JsonInclude(Include.NON_EMPTY)
	private Date dtNascto;
	
	@JsonInclude(Include.NON_EMPTY)
	private String codMunicNascto; // TAM 7
	
	@JsonInclude(Include.NON_EMPTY)
	private String ufNascto; // TAM 2
	
	@JsonInclude(Include.NON_EMPTY)
	private String nmPai;
	
	@JsonInclude(Include.NON_EMPTY)
	private String nmMae;
	
	//@JsonInclude(Include.NON_EMPTY)
	private String trabAposent; // TAM 1 S/N

	// SETTER AND GETTERS
	public String getNmTrab() {
		return nmTrab;
	}

	public void setNmTrab(String nmTrab) {
		this.nmTrab = nmTrab;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPaisNascto() {
		return paisNascto;
	}

	public void setPaisNascto(String paisNascto) {
		this.paisNascto = paisNascto;
	}

	public String getPaisNac() {
		return paisNac;
	}

	public void setPaisNac(String paisNac) {
		this.paisNac = paisNac;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Long getRacaCor() {
		return racaCor;
	}

	public void setRacaCor(Long racaCor) {
		this.racaCor = racaCor;
	}

	public Long getEstCiv() {
		return estCiv;
	}

	public void setEstCiv(Long estCiv) {
		this.estCiv = estCiv;
	}

	public String getGrauInstr() {
		return grauInstr;
	}

	public void setGrauInstr(String grauInstr) {
		this.grauInstr = grauInstr;
	}

	public String getNmSoc() {
		return nmSoc;
	}

	public void setNmSoc(String nmSoc) {
		this.nmSoc = nmSoc;
	}

	public Date getDtNascto() {
		return dtNascto;
	}

	public void setDtNascto(Date dtNascto) {
		this.dtNascto = dtNascto;
	}

	public String getCodMunicNascto() {
		return codMunicNascto;
	}

	public void setCodMunicNascto(String codMunicNascto) {
		this.codMunicNascto = codMunicNascto;
	}

	public String getUfNascto() {
		return ufNascto;
	}

	public void setUfNascto(String ufNascto) {
		this.ufNascto = ufNascto;
	}

	public String getNmPai() {
		return nmPai;
	}

	public void setNmPai(String nmPai) {
		this.nmPai = nmPai;
	}

	public String getNmMae() {
		return nmMae;
	}

	public void setNmMae(String nmMae) {
		this.nmMae = nmMae;
	}

	public String getTrabAposent() {
		return trabAposent;
	}

	public void setTrabAposent(String trabAposent) {
		this.trabAposent = trabAposent;
	}

	

}
