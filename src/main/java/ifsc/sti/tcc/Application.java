package ifsc.sti.tcc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/*
 * 
 * LocalHost swagger - http://localhost:8081/swagger-ui.html
 * LocalHost Aplicação - http://localhost:8081
 * */

@SpringBootApplication
@ComponentScan
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
