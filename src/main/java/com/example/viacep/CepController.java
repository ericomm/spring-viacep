package com.example.viacep;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(exposedHeaders = "errors,content-type")

public class CepController {

	@Autowired
	private CepRepository cepRepository;

	@RequestMapping(value = "/{cep}", method = RequestMethod.GET, produces = "application/json")
	public Cep findByCep(@PathVariable("cep") String cep) {
		return this.cepRepository.findByCep(cep);
	
	}
		
	
	@RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json")
	public List<Cep> findAll() {
		List<Cep> cep = (List<Cep>) this.cepRepository.findAll();
		return cep;
	}
}