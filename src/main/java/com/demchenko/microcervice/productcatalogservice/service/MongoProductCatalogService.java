package com.demchenko.microcervice.productcatalogservice.service;

import com.demchenko.microcervice.productcatalogservice.model.Product;
import com.demchenko.microcervice.productcatalogservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MongoProductCatalogService implements ProductCatalogService {

    private final ProductRepository productRepository;

    @Override
    public void addProduct(Product product) {
        productRepository.insert(product);
    }

    @Override
    public Product getProduct(String id) {
        return productRepository.findById(id)
                .orElse(null);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public void updateProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }
}
