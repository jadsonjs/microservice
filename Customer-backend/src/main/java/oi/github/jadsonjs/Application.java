/*
 *
 * This software is distributed WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND
 */
package oi.github.jadsonjs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Works as an initiator to Spring Boot - as defined by @SpringBootApplication annotation - rising a Spring context and the embedded server
 * 
 * @author jadson - jadsonjs@gmail.com
 *
 * @see https://dzone.com/articles/spring-boot-creating
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
}
