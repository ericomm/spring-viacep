package com.example.viacep;

/*import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
*/
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ViaCepApplication {

	//private static final Logger log = LoggerFactory.getLogger(ViaCepApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ViaCepApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(CepRepository repository) {
		return (args) -> {
			// save a few ceps
			repository.save(new Cep("91720000", "Avenida Nonoai", "", "Nonoai", "Porto Alegre", "RS",
					"4314902", "", "51", "8801"));
			repository.save(new Cep("90040001", "Avenida João Pessoa", "", "Farroupilha", "Porto Alegre", "RS",
					"4314902", "", "51", "8801"));
			repository.save(new Cep("90010320", "Rua Coronel Fernando Machado", "", "Centro Histórico", "Porto Alegre", "RS",
					"4314902", "", "51", "8801"));
			repository.save(new Cep("90160093", "Avenida Coronel Ipiranda", "", "Azenha", "Porto Alegre", "RS",
					"4314902", "", "51", "8801"));
			
			
			
			/*// fetch all ceps
			log.info("Ceps found with findAll():");
			log.info("-------------------------------");
			for (Cep cep : repository.findAll()) {
				log.info(cep.toString());
			}
			log.info("");

			// fetch an individual cep by ID
			Optional<Cep> cep = repository.findById(1L);
			log.info("Cep found with findById(1L):");
			log.info("--------------------------------");
			log.info(cep.toString());
			log.info("");

			// fetch cep by cep
			log.info("Cep found with findByCep('91530080'):");
			log.info("--------------------------------------------");
			repository.findByCep("91530080").toString();
			// for (Customer bauer : repository.findByLastName("Bauer")) {
			// log.info(bauer.toString());
			// }
			log.info("");
		};*/
	};
}		
}

	