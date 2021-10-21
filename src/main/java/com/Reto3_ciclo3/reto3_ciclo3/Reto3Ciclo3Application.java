package com.Reto3_ciclo3.reto3_ciclo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = {"com.Reto3_ciclo3.reto3_ciclo3.Entidad"})
@SpringBootApplication

public class Reto3Ciclo3Application {

	public static void main(String[] args) {
		SpringApplication.run(Reto3Ciclo3Application.class, args);
	}

}
