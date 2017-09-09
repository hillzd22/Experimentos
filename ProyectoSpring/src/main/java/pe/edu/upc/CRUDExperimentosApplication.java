package pe.edu.upc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class CRUDExperimentosApplication {

	public static void main(String[] args) throws Exception{
		SpringApplication.run(CRUDExperimentosApplication.class, args);
	
	}
	
	 protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(CRUDExperimentosApplication.class);
	  }

	
}
