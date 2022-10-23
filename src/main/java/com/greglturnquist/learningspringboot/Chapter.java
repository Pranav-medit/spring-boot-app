package com.greglturnquist.learningspringboot;

import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data// generates getters/setters/tostring/equals/hashcode/constructor for final fields
@Document// indicates suitable for storing in a mongo db data store
public class Chapter {

	@Id// primary key of our mongo document
	private String id;
	private String name;

	public Chapter(String name) {
		this.name = name;
	}

}
