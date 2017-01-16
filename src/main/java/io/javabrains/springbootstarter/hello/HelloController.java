package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	//Por defecto, si no espeficicamos otra cosa, mapea TODOS los métodos HTTP.
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	}

}
