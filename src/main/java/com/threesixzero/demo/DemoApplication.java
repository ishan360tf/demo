package com.threesixzero.demo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Value("${spring.application.name}")
	private String applicationName;

	@Value("${db_rds_username}")
	private String username;

	@Value("${db_rds_password}")
	private String password;
	private Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) {
		logger.info("Application Name: " + this.applicationName);
		logger.info("Username: " + this.username);
		logger.info("Password: " + this.password);

	}

}
