package br.com.faroli.teste.dto;

/**
 * Classe Statistic - Classe que representa um objeto de estatistica de DNA 
 * Nome: Leandro Faroli
 * @author Faroli </br> Copyright (c) 2017
 * @version 1.0
 */
public class Statistic {
	
	private int countMutantDna;
	private int counthumanDna;
	private float ratio;
	
	/**
	 * @return the countMutantDna
	 */
	public int getCountMutantDna() {
		return countMutantDna;
	}
	/**
	 * @param countMutantDna the countMutantDna to set
	 */
	public void setCountMutantDna(int countMutantDna) {
		this.countMutantDna = countMutantDna;
	}
	/**
	 * @return the counthumanDna
	 */
	public int getCounthumanDna() {
		return counthumanDna;
	}
	/**
	 * @param counthumanDna the counthumanDna to set
	 */
	public void setCounthumanDna(int counthumanDna) {
		this.counthumanDna = counthumanDna;
	}
	/**
	 * @return the ratio
	 */
	public float getRatio() {
		return ratio;
	}
	/**
	 * @param ratio the ratio to set
	 */
	public void setRatio(float ratio) {
		this.ratio = ratio;
	}
	
}
