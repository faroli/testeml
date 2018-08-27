package br.com.faroli.teste.model;

import org.springframework.data.annotation.Id;

/**
 * Classe DNA - Classe que representa uma entidade DNA
 * Nome: Leandro Faroli
 * @author Faroli </br> Copyright (c) 2017
 * @version 1.0
 */
public class DNA {
    
	@Id
	private String id;
    private Boolean isMutant;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the isMutant
	 */
	public Boolean getIsMutant() {
		return isMutant;
	}
	/**
	 * @param isMutant the isMutant to set
	 */
	public void setIsMutant(Boolean isMutant) {
		this.isMutant = isMutant;
	}
   
}
