package com.pinfinite.prengine.search.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pinfinite.prengine.model.Product;
import com.pinfinite.prengine.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public String addProduct(Product product) {
		return productRepository.save(product).getRandomID();
	}
}
