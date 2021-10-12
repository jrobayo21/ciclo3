package mintic.ciclo3.c3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = {"mintic.ciclo3.c3.model"})
@SpringBootApplication
public class C3Application {

	public static void main(String[] args) {
		SpringApplication.run(C3Application.class, args);
	}

}
