package com.demchenko.microcervice.productcatalogservice.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Builder
@Document
public class Product {
    @Id
    private String id;
    private String title;
    private String desc;
    private String imagePath;
    private double unitPrice;

}
