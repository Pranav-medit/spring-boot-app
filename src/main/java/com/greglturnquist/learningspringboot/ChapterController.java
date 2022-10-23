package com.greglturnquist.learningspringboot;

import reactor.core.publisher.Flux;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChapterController {

	private final ChapterRepository repository;// will be automatically loaded without autowired if we have only one constructor call

	public ChapterController(ChapterRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/chapters")
	public Flux<Chapter> listing() {
		return repository.findAll();
	}
}
