package br.com.jadson.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * ConfigServerApplication.java
 * 
 * <p>Since we will no longer have only one application, but several scattered over several servers it is necessary to centralize 
 *   the configuration ofall the applications in one place.
 *   Spring Cloud Config enables the creation of an externalized configuration in a distributed system. 
 *   With Config Server you have a central place, a git repository for example, to manage the configuration files of each 
 *   application that are running in other environments. </p>
 * 
 * @author Jadson Santos - jadson@info.ufrn.br
 * @version 1.0
 * @since 24/05/2014
 * 
 * <p><i>This program is distributed without any warranty and it
 * can be freely redistributed for research, classes or private studies, 
 * since the copyright notices are not removed.</i></p>
 *
 */
@SpringBootApplication
@EnableConfigServer           /** Include this annotation to turn our apllication in a config server */
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
