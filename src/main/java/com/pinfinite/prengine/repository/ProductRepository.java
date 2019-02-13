package com.pinfinite.prengine.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pinfinite.prengine.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, Long> {

}
