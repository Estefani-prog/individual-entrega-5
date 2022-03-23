package entregafinal.forrester;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@SpringBootApplication
// @ComponentScan(basePackages = "recodepro1.traveller")
public class SpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringApplication.class, args);
	}

}
