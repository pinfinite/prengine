package com.pinfinite.prengine.search.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pinfinite.prengine.model.Product;
import com.pinfinite.prengine.search.service.ProductService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;



@Api( value = "Product", description = "Operations with product",consumes="application/json", produces = "application/json")
@RestController
@RequestMapping(value="/product", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
public class ProductController {
	
	@Autowired
	private ProductService productService;
	

	@PostMapping(value="/add")
	@ApiOperation(value = "Add Product", notes = "Add Product")
	public ResponseEntity addProduct(@RequestBody Product product){
		return new ResponseEntity<String>("Product Created With Id: "+productService.addProduct(product),HttpStatus.CREATED);
	}
	
	
}
