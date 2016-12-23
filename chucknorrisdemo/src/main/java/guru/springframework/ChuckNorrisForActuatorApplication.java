package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Example Spring Application implementing Chuck Norris quote generator for Spring Boot Actuator.
 *
 * @author John Thompson
 */
@SpringBootApplication
public class ChuckNorrisForActuatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChuckNorrisForActuatorApplication.class, args);
	}
}
