package com.greglturnquist.learningspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Not to render views but to return results straight into response body
@RestController
public class HomeController {

	// Shorthand for @RequestMapping(method=RequestMethod.GET)
	@GetMapping
	public String greeting(@RequestParam(required = false,
							defaultValue = "") String name) {
		return name.equals("")
			? "Hey!"
			: "Hey, " + name + "!";
	}

}
