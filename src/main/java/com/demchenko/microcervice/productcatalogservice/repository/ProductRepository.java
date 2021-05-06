package com.demchenko.microcervice.productcatalogservice.repository;

import com.demchenko.microcervice.productcatalogservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
