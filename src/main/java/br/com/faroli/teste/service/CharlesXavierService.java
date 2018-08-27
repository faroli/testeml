package br.com.faroli.teste.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.faroli.teste.bo.CharlesXavierBO;
import br.com.faroli.teste.dto.MutantRequest;
import br.com.faroli.teste.dto.Statistic;

/**
 * Classe CharlesXavierBO - Classe que representa uma posicao no quadro NXN
 * Nome: Leandro Faroli
 * @author Faroli </br> Copyright (c) 2017
 * @version 1.0
 */
@RestController
public class CharlesXavierService {
	
	@Autowired
	public CharlesXavierBO charlesXavierBO;
	
	@RequestMapping(value="/mutant", method= RequestMethod.POST)
	public ResponseEntity<Boolean> isMutant(@RequestBody MutantRequest dna) {
		boolean isMutant = charlesXavierBO.isMutant(dna.getDna());
		if(isMutant) {
			return new ResponseEntity<Boolean>(isMutant, HttpStatus.OK);
		}else{
			return new ResponseEntity<Boolean>(isMutant, HttpStatus.FORBIDDEN);
		}
		
	}
	
	@RequestMapping(value="/stats", method= RequestMethod.GET)
	public Statistic stats() {
		return charlesXavierBO.getStatisticHumanMutant();		
	}
}
