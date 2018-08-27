package br.com.faroli.teste.dto;

/**
 * Classe NPosition - Classe que representa uma posicao no quadro NXN
 * Nome: Leandro Faroli
 * @author Faroli </br> Copyright (c) 2017
 * @version 1.0
 */
public class NPosition {

	private Integer positionX;
	private Integer positionY;
	private String value;
	
	public NPosition(Integer positionX, Integer positionY, String value) {
		this.positionX = positionX;
		this.positionY = positionY;
		this.value = value;
	}

	/**
	 * @return the positionX
	 */
	public Integer getPositionX() {
		return positionX;
	}

	/**
	 * @param positionX the positionX to set
	 */
	public void setPositionX(Integer positionX) {
		this.positionX = positionX;
	}

	/**
	 * @return the positionY
	 */
	public Integer getPositionY() {
		return positionY;
	}

	/**
	 * @param positionY the positionY to set
	 */
	public void setPositionY(Integer positionY) {
		this.positionY = positionY;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}
	

}
