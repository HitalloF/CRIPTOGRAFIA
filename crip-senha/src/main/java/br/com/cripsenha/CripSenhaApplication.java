package br.com.cripsenha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class CripSenhaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CripSenhaApplication.class, args);
	}

}
