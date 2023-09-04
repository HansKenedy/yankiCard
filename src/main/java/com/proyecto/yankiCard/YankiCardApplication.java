package com.proyecto.yankiCard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class YankiCardApplication {

	public static void main(String[] args) {
		SpringApplication.run(YankiCardApplication.class, args);
	}

}
