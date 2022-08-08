package com.deimos.pruebatecnica;

import com.deimos.pruebatecnica.Domain.Model.UsersResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@SpringBootApplication
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
public class PruebatecnicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebatecnicaApplication.class, args);
	}

	@Bean
	@Scope("singleton")
	Mono<UsersResponse> usersData() {
		WebClient client = WebClient.create();
		return client.get()
				.uri("https://gorest.co.in/public/v1/users")
				.retrieve()
				.bodyToMono(UsersResponse.class);

	}
}
