package com.greglturnquist.learningspringboot;

import reactor.core.publisher.Flux;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //marks class as source of bean
public class LoadDatabase {

	@Bean // indicates that the return value of the method will be spring bean
		// to be managed by spring context
	CommandLineRunner init(ChapterRepository repository) {
		// Spring runs all commandLineRunner beans after the entire application is up and running.
		return args -> {
			Flux.just(
				new Chapter("Quick Start with Java"),
				new Chapter("Reactive Web with Spring Boot"),
				new Chapter("...and more!"))
			.flatMap(repository::save)
			.subscribe(System.out::println);
		};
	}

}
