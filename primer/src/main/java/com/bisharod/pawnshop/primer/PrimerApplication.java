package com.bisharod.pawnshop.primer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.hibernate6.Hibernate6Module;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimerApplication.class, args);
	}

	@Autowired
	void configureObjectMapper(final ObjectMapper mapper) {
		Hibernate6Module hibernate6Module = new Hibernate6Module();
		hibernate6Module.disable(Hibernate6Module.Feature.USE_TRANSIENT_ANNOTATION);
		hibernate6Module.enable(Hibernate6Module.Feature.FORCE_LAZY_LOADING);
		mapper.registerModule(hibernate6Module);
	}

}
