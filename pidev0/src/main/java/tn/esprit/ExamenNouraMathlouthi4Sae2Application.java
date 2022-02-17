package tn.esprit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@EnableScheduling
@SpringBootApplication
public class ExamenNouraMathlouthi4Sae2Application {

	public static void main(String[] args) {
		SpringApplication.run(ExamenNouraMathlouthi4Sae2Application.class, args);
	}

}
