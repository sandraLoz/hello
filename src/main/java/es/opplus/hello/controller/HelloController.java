package es.opplus.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

public class HelloController {

	@RestController
	public class HelloWorldController {

		@GetMapping(path = "/")
		public String greeting(@RequestParam(value = "name", defaultValue = "world") String name) {
			return String.format("hello %s", name);
		}
	}
}
