package com.nav.springapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Mono;
import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;

@SpringBootApplication
public class SpringapigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringapigatewayApplication.class, args);
	}

	@Bean
	public KeyResolver keyResolver(){
		return exchange -> Mono.just("userKey");
	}
}
