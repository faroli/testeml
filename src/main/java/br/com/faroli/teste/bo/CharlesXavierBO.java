package br.com.faroli.teste.bo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.faroli.teste.dao.DNARepository;
import br.com.faroli.teste.dto.Statistic;
import br.com.faroli.teste.model.DNA;

/**
 * Classe CharlesXavierBO - Classe com a logica de negocio dos mutantes
 * Nome: Leandro Faroli
 * @author Faroli </br> Copyright (c) 2017
 * @version 1.0
 */
@Component
public class CharlesXavierBO {
	
	@Autowired
	DNARepository dnaRepository;
	
	private final static String ADM_A = "A";
	private final static String ADM_T = "T";
	private final static String ADM_C = "C";
	private final static String ADM_G = "G";
	
	private final static Integer NUM_POSITION_ZERO = 0;
	private final static Integer NUM_POSITION_ONE = 1;
	private final static Integer NUM_POSITION_TWO = 2;
	private final static Integer NUM_POSITION_THREE = 3;
	private final static Integer NUM_POSITION_FOUR = 4;
	private final static Integer NUM_POSITION_FIVE = 5;
	
	static String[][] noMutante = { {ADM_A, ADM_T, ADM_G, ADM_C, ADM_G, ADM_A },
			{ADM_C, ADM_A, ADM_G, ADM_T, ADM_G, ADM_C },
			{ADM_T, ADM_T, ADM_A, ADM_T, ADM_T, ADM_T },
			{ADM_A, ADM_G, ADM_A, ADM_C, ADM_G, ADM_G },
			{ADM_G, ADM_C, ADM_G, ADM_T, ADM_C, ADM_A },
			{ADM_T, ADM_C, ADM_A, ADM_C, ADM_T, ADM_G }			
	};
	
	static String[][] mutante = { {ADM_A, ADM_T, ADM_G, ADM_C, ADM_G, ADM_A },
			{ADM_C, ADM_A, ADM_G, ADM_T, ADM_G, ADM_C },
			{ADM_T, ADM_T, ADM_A, ADM_T, ADM_G, ADM_T },
			{ADM_A, ADM_G, ADM_A, ADM_A, ADM_G, ADM_G },
			{ADM_C, ADM_C, ADM_C, ADM_C, ADM_T, ADM_A },
			{ADM_T, ADM_C, ADM_A, ADM_C, ADM_T, ADM_G }			
	};
	static Map<String, String> qNoMutante;
	static Map<String, String> qMutante;
	
	/**
	 * Construtor - responsavel por carregar os arrays
	 *
	 */
	public CharlesXavierBO() {
		if(qNoMutante==null || qMutante == null) {
			qNoMutante = new HashMap<>();
			qMutante = new HashMap<>();
			for (int i = 0; i < noMutante.length; i++) {
				qNoMutante.put(noMutante[i][NUM_POSITION_ZERO]+
						noMutante[i][NUM_POSITION_ONE]+
						noMutante[i][NUM_POSITION_TWO]+
						noMutante[i][NUM_POSITION_THREE], 
						noMutante[i][NUM_POSITION_ZERO]+
						noMutante[i][NUM_POSITION_ONE]+
						noMutante[i][NUM_POSITION_TWO]+
						noMutante[i][NUM_POSITION_THREE]+
					    noMutante[i][NUM_POSITION_FOUR]+
					    noMutante[i][NUM_POSITION_FIVE]);
				
				qNoMutante.put(noMutante[NUM_POSITION_ZERO][i]+
						noMutante[NUM_POSITION_ONE][i]+
						noMutante[NUM_POSITION_TWO][i]+
						noMutante[NUM_POSITION_THREE][i],
						noMutante[NUM_POSITION_ZERO][i]+
						noMutante[NUM_POSITION_ONE][i]+
						noMutante[NUM_POSITION_TWO][i]+
						noMutante[NUM_POSITION_THREE][i]+
					    noMutante[NUM_POSITION_FOUR][i]+
					    noMutante[NUM_POSITION_FIVE][i]);
						
	
				qMutante.put(mutante[i][NUM_POSITION_ZERO]+
						mutante[i][NUM_POSITION_ONE]+
						mutante[i][NUM_POSITION_TWO]+
						mutante[i][NUM_POSITION_THREE], 
						mutante[i][NUM_POSITION_ZERO]+
						mutante[i][NUM_POSITION_ONE]+
						mutante[i][NUM_POSITION_TWO]+
						mutante[i][NUM_POSITION_THREE]+
						mutante[i][NUM_POSITION_FOUR]+
					    mutante[i][NUM_POSITION_FIVE]);
				
				qMutante.put(mutante[NUM_POSITION_ZERO][i]+
						mutante[NUM_POSITION_ONE][i]+
						mutante[NUM_POSITION_TWO][i]+
						mutante[NUM_POSITION_THREE][i],
						mutante[NUM_POSITION_ZERO][i]+
						mutante[NUM_POSITION_ONE][i]+
						mutante[NUM_POSITION_TWO][i]+
						mutante[NUM_POSITION_THREE][i]+
						mutante[NUM_POSITION_FOUR][i]+
						mutante[NUM_POSITION_FIVE][i]);
					
			}
			
			qNoMutante.put(noMutante[NUM_POSITION_ZERO][NUM_POSITION_ZERO]+
					noMutante[NUM_POSITION_ONE][NUM_POSITION_ONE]+
					noMutante[NUM_POSITION_TWO][NUM_POSITION_TWO]+
					noMutante[NUM_POSITION_THREE][NUM_POSITION_THREE], 
					noMutante[NUM_POSITION_ZERO][NUM_POSITION_ZERO]+
					noMutante[NUM_POSITION_ONE][NUM_POSITION_ONE]+
					noMutante[NUM_POSITION_TWO][NUM_POSITION_TWO]+
					noMutante[NUM_POSITION_THREE][NUM_POSITION_THREE]+
				    noMutante[NUM_POSITION_FOUR][NUM_POSITION_FOUR]+
				    noMutante[NUM_POSITION_FIVE][NUM_POSITION_FIVE]);
	
			qMutante.put(mutante[NUM_POSITION_ZERO][NUM_POSITION_ZERO]+
					mutante[NUM_POSITION_ONE][NUM_POSITION_ONE]+
					mutante[NUM_POSITION_TWO][NUM_POSITION_TWO]+
					mutante[NUM_POSITION_THREE][NUM_POSITION_THREE], 
					mutante[NUM_POSITION_ZERO][NUM_POSITION_ZERO]+
					mutante[NUM_POSITION_ONE][NUM_POSITION_ONE]+
					mutante[NUM_POSITION_TWO][NUM_POSITION_TWO]+
					mutante[NUM_POSITION_THREE][NUM_POSITION_THREE]+
					mutante[NUM_POSITION_FOUR][NUM_POSITION_FOUR]+
					mutante[NUM_POSITION_FIVE][NUM_POSITION_FIVE]);
		}
	}
	
	/**
	 * Metodo responsavel por verificar se um humano é ou nao mutante
	 *
	 * @param String[] input array de DNA
	 * @return true = mutante e false humano
	 */
	public boolean isMutant(String[] input) {
		boolean isMutant=false;
		DNA dna = new DNA();
		
		for (int i = 0; i < input.length; i++) {
			
			if(qMutante.containsKey(input[i].substring(NUM_POSITION_ZERO, NUM_POSITION_FOUR))) {
				dna.setIsMutant(true);
				dnaRepository.save(dna);
				return true;
			}
		}
		dna.setIsMutant(false);
		dnaRepository.save(dna);
		return isMutant;
	}
	
	/**
	 * Metodo responsavel por retornar as estatisticas de consultas de DNA
	 *
	 */
	public Statistic getStatisticHumanMutant() {
		List<DNA> listDNA = dnaRepository.findAll();
		Statistic statistic = new Statistic();
		for (DNA dna : listDNA) {
			if(dna.getIsMutant()) {
				statistic.setCountMutantDna(statistic.getCountMutantDna()+1);
			}else {
				statistic.setCounthumanDna(statistic.getCounthumanDna()+1);
			}
		}
		statistic.setRatio((float) statistic.getCountMutantDna()/(float) statistic.getCounthumanDna());
		return statistic;
		
	}
	
	

}
