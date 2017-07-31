package com.productdata.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories("com.productdata.repository")
@EnableCaching
@EntityScan("com.productdata.entity")
@ComponentScan(basePackages="com.productdata")
public class ProductDataApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProductDataApplication.class, args);
	}
}
