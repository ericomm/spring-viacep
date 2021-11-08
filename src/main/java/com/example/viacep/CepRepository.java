package com.example.viacep;

import org.springframework.data.repository.CrudRepository;

public interface CepRepository extends CrudRepository<Cep, Long> {

	Cep findByCep(String cep);
	
	
}