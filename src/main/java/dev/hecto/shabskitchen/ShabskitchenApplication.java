package dev.hecto.shabskitchen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication
//@EnableMongoRepositories(basePackages = "dev.hecto.shabskitchen.Repository")
public class ShabskitchenApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShabskitchenApplication.class, args);
	}

}
