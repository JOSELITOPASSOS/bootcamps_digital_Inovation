package br.com.estudos.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import lombok.Getter;
import lombok.Setter;

@Configuration
@ConfigurationProperties("spring.datasource")
@Getter
@Setter
public class DBConfiguration {

	private String driverClassName;
	private String url;
	private String userName;
	private String password;

	@Profile("dev")
	@Bean
	public String testeDataBaseConnection() {
		System.out.println("DB Connection for DEV - H2");
		System.out.println(this.driverClassName);
		System.out.println(this.url);
		return "DB Connection to H2_TEST - Test instance";
	}
	
	@Profile("prod")
	@Bean
	public String productionDataBaseConnection() {
		System.out.println("DB Connection for Production - MYSQL");
		System.out.println(this.driverClassName);
		System.out.println(this.url);
		return "DB Connection to MYSQL_PROD - Producion instance";
	}
}