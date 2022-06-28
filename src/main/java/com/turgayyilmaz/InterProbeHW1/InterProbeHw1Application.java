package com.turgayyilmaz.InterProbeHW1;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition( info = @Info(description = "Patika.dev & InterProbe Java Spring Boot Bootcamp",
					title = "Homework#1",
					version = "v1",
					license = @License(name = "Apache 2.0",
					url = "https://www.apache.org/licenses/LICENSE-2.0")))
public class InterProbeHw1Application {

	public static void main(String[] args) {
		SpringApplication.run(InterProbeHw1Application.class, args);
	}

}
