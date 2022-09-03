package com.gl.biblio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages={
"com.gl.biblio", "com.gl.biblio.controller","com.gl.biblio.model" ,"com.gl.biblio.repository","com.gl.biblio.service"})
@RestController
public class BiblioApplication {

	public static void main(String[] args) {
		SpringApplication.run(BiblioApplication.class, args);
	}

}
