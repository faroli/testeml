package br.com.faroli.teste.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.faroli.teste.model.DNA;


public interface DNARepository extends MongoRepository<DNA, String>{

}
