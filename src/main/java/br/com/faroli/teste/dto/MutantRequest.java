package br.com.faroli.teste.dto;

/**
 * Classe MutantRequest - Classe request do servico que verifica mutantes
 * Nome: Leandro Faroli
 * @author Faroli </br> Copyright (c) 2017
 * @version 1.0
 */
public class MutantRequest {
	private String[] dna;

	/**
	 * @return the dna
	 */
	public String[] getDna() {
		return dna;
	}

	/**
	 * @param dna the dna to set
	 */
	public void setDna(String[] dna) {
		this.dna = dna;
	}

	
}
