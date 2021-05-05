package com.demchenko.microcervice.productcatalogservice.controller;

import com.demchenko.microcervice.productcatalogservice.model.Product;
import com.demchenko.microcervice.productcatalogservice.service.ProductCatalogService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductCatalogController {
    private final ProductCatalogService productCatalog;

    @PostMapping("/product")
    public String addProduct(@RequestBody Product product) {
        productCatalog.addProduct(product);
        return "product added successfully";
    }

    @GetMapping("/product/{id}")
    public Product getProductDetails(@PathVariable String id) {
        return productCatalog.getProduct(id);
    }

    @GetMapping("/product")
    public List<Product> getProductList() {
        return productCatalog.getAllProducts();
    }

    @PutMapping("/product")
    public String updateProduct(@RequestBody Product product) {
        productCatalog.updateProduct(product);
        return "product updated successfully";
    }

    @DeleteMapping("/product/{id}")
    public String deleteProduct(@PathVariable String id) {
        productCatalog.deleteProduct(id);
        return "product deleted successfully";
    }
}
