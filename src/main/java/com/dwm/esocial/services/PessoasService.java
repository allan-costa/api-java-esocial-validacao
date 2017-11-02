package com.dwm.esocial.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dwm.esocial.domain.DadosPessoais;
import com.dwm.esocial.domain.Pessoa;
import com.dwm.esocial.repository.PessoasRepository;
import com.dwm.esocial.services.exceptions.PessoaNaoEncontradaException;

@Service
public class PessoasService {

	@Autowired
	private PessoasRepository pessoasRepository;

	boolean RESULTADO_VALIDACAO = true;

	public DadosPessoais validar(Pessoa pessoa) {

		DadosPessoais dadospessoais = validarDadosPessoais(pessoa);

		return dadospessoais;
	}

	public Pessoa salvar(Pessoa pessoa) {
		return pessoasRepository.save(pessoa);
	}
	
	// Esse método faz a verificação se o funcionário existe na empresa e se os dados recebidos estão de acordo o padrão do esocial
	public DadosPessoais validarDadosPessoais(Pessoa pessoa) {

		int INDIGINA = 1, BRANCO = 2, NEGRA = 3, AMARELA = 4, PARDA = 5, NAOINFORMADO = 6;
		int SOLTEIRO = 1, CASADO = 2, DIVORCIADO = 3, VIUVO = 4, UNIAOESTAVEL = 5, OUTROS = 6;

		DadosPessoais dadospessoais = new DadosPessoais();
		
		String erros = " ";
		
		boolean resultadoValidacao = true;
		
		Pessoa p = pessoasRepository.findOne(pessoa.getId());
		
		if (p == null) {
			throw new PessoaNaoEncontradaException("Essa pessoa não pôde ser encontrada no banco de dados da empresa");
		}

		if (pessoa.getNmTrab() == null || pessoa.getNmTrab() == " " || pessoa.getNmTrab().length() > 70) {
			erros += "Campo nome do trabalhador inválido";
			resultadoValidacao = false;
		}

		if (!pessoa.getSexo().equals("F") && !pessoa.getSexo().equals("M") || pessoa.getSexo().equals(" ")) {
			erros += "/ Sexo inválido";
			resultadoValidacao = false;
		}

		if (pessoa.getRacaCor() != INDIGINA && pessoa.getRacaCor() != BRANCO && pessoa.getRacaCor() != NEGRA
				&& pessoa.getRacaCor() != AMARELA && pessoa.getRacaCor() != PARDA
				&& pessoa.getRacaCor() != NAOINFORMADO) {
			erros += "/ Cor inválida";
			resultadoValidacao = false;
		}

		if (pessoa.getEstCiv() != SOLTEIRO && pessoa.getEstCiv() != CASADO && pessoa.getEstCiv() != DIVORCIADO
				&& pessoa.getEstCiv() != VIUVO && pessoa.getEstCiv() != UNIAOESTAVEL && pessoa.getEstCiv() != OUTROS) {

			erros += "/ Estado civil inválido";
			resultadoValidacao = false;
		}

		if (!pessoa.getGrauInstr().equals("01") && !pessoa.getGrauInstr().equals("02")
				&& !pessoa.getGrauInstr().equals("03") && !pessoa.getGrauInstr().equals("04")
				&& !pessoa.getGrauInstr().equals("05") && !pessoa.getGrauInstr().equals("06")
				&& !pessoa.getGrauInstr().equals("07") && !pessoa.getGrauInstr().equals("08")
				&& !pessoa.getGrauInstr().equals("09") && !pessoa.getGrauInstr().equals("10")
				&& !pessoa.getGrauInstr().equals("11") && !pessoa.getGrauInstr().equals("12")) {
			erros += "/ Grau de instrução inválido";
			resultadoValidacao = false;
		}

		if (pessoa.getNmSoc() == null || pessoa.getNmSoc() == " " || pessoa.getNmSoc().length() > 70) {
			erros += "/ Nome social inválido";
			resultadoValidacao = false;
		}

		if (pessoa.getCodMunicNascto() == null) {
			erros += "/ Código de municipio de nascimento inválido";
			resultadoValidacao = false;
		}

		// @TODO inserir enum com estados da federação
		if (pessoa.getUfNascto() == null) {
			erros += "/ Unidade da federação de nascimento inválido";
			resultadoValidacao = false;
		}

		if (pessoa.getPaisNascto() == null || pessoa.getPaisNascto().length() > 3) {
			erros += "/ País de nascimento inválido";
			resultadoValidacao = false;
		}

		if (pessoa.getPaisNac() == null || pessoa.getPaisNac().length() > 3) {
			erros += "/ Nacionalidade inválida";
			resultadoValidacao = false;
		}

		if (pessoa.getNmMae() == null || pessoa.getNmMae() == " " || pessoa.getNmMae().length() > 70) {
			erros += "/ Nome da mãe inválido";
			resultadoValidacao = false;
		}

		if (pessoa.getNmPai() == null || pessoa.getNmPai() == " " || pessoa.getNmPai().length() > 70) {
			erros += "/ Nome do pai inválido";
			resultadoValidacao = false;
		}

		if (!pessoa.getTrabAposent().equals("S") && !pessoa.getTrabAposent().equals("N")) {
			erros += "/ Trablahado aposentado inválido";
			resultadoValidacao = false;
		}

		dadospessoais.setErros(erros);
		dadospessoais.setResultadoValidacao(resultadoValidacao);

		return dadospessoais;
	}

}
