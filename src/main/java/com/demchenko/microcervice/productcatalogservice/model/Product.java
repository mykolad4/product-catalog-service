package com.demchenko.microcervice.productcatalogservice.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Product {
    private String id;
    private String title;
    private String desc;
    private String imagePath;
    private double unitPrice;

}
