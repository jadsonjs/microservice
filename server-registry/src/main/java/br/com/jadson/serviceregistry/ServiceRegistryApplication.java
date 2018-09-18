package br.com.jadson.serviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * ServerRegistryApplication.java
 *
 * <p> Class responsible for managing the status and location of Microservices in our network
 * Eureka is a Representational State Transfer (REST) service that is used to locate services for the purpose of load balancing 
 * and server failover. The Spring Cloud toolkit has an Eureka implementation so we can upload an Eureka Server 
 * using a Spring Boot application. 
 * </p>
 *
 * @author Jadson Santos - jadson@info.ufrn.br
 * @version
 * @since
 *  
 * <p><i>This program is distributed without any warranty and it
 * can be freely redistributed for research, classes or private studies, 
 * since the copyright notices are not removed.</i></p>
 *
 */
@SpringBootApplication
@EnableEurekaServer  /** Indicate to Spring Boot that this class will be an Eureka Server.*/
public class ServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryApplication.class, args);
	}
}
