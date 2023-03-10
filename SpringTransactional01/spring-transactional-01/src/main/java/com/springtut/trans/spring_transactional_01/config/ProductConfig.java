package com.springtut.trans.spring_transactional_01.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com")
public class ProductConfig {

	@Bean
	public DataSource datasource() {
		return new DriverManagerDataSource("jdbc:mysql://localhost:3306/productnew", "root", "root");
	}

	@Bean
	public JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(datasource());
	}
}
