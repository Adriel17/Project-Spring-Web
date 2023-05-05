package org.siges.siges;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SigesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SigesApplication.class, args);
	}
	

}
