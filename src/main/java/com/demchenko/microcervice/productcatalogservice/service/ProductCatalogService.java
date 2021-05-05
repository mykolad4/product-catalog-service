package com.demchenko.microcervice.productcatalogservice.service;

import com.demchenko.microcervice.productcatalogservice.model.Product;

import java.util.List;

public interface ProductCatalogService {
    void addProduct(Product product);
    Product getProduct(String id);
    List<Product> getAllProducts();
    void updateProduct(Product product);
    void deleteProduct(String id);
}
