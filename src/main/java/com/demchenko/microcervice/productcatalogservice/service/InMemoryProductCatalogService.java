package com.demchenko.microcervice.productcatalogservice.service;

import com.demchenko.microcervice.productcatalogservice.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class InMemoryProductCatalogService implements ProductCatalogService {

    private final Map<String, Product> productCatalog = new HashMap<>();

    @Override
    public void addProduct(Product product) {
        productCatalog.put(product.getId(), product);
    }

    @Override
    public Product getProduct(String id) {
        return productCatalog.get(id);
    }

    @Override
    public List<Product> getAllProducts() {
        return new ArrayList<>(productCatalog.values());
    }

    @Override
    public void updateProduct(Product product) {
        productCatalog.put(product.getId(), product);
    }

    @Override
    public void deleteProduct(String id) {
        productCatalog.remove(id);
    }
}
