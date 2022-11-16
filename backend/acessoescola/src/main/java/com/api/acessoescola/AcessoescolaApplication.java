package com.api.acessoescola;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {"com.api.acessoescola.model"})
@EnableJpaRepositories (basePackages = {"com.api.acessoescola.repositories"})
@ComponentScan(basePackages = {"com.api.acessoescola.controllers","com.api.acessoescola.serviceImpl"})
@SpringBootApplication
public class AcessoescolaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcessoescolaApplication.class, args);
	}

}
