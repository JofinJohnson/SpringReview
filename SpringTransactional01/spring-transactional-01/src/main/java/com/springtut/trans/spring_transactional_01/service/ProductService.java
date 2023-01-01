package com.springtut.trans.spring_transactional_01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springtut.trans.spring_transactional_01.dto.Product;
import com.springtut.trans.spring_transactional_01.repo.ProductRepo;

@Service
public class ProductService {

	@Autowired
	private ProductRepo productRepo;

	public void saveProductInfo() {

		for (int i = 0; i < 10; i++) {
			System.out.println("inserting product " + i);
			productRepo.saveProduct(new Product(i, "Test product" + i));
		}
	}
}
