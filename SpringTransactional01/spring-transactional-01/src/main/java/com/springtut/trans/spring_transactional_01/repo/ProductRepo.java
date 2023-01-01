package com.springtut.trans.spring_transactional_01.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springtut.trans.spring_transactional_01.dto.Product;

@Repository
public class ProductRepo {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void saveProduct(Product product) {
		String sql = "insert into product values (?, ?)";
		Object[] args = {product.getId(), product.getName()};
		jdbcTemplate.update(sql, args);
	}
}
