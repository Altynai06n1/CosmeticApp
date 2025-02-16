package com.example.cosmetics;

import org.springframework.stereotype.Component;

@Component
public class Skincare {
    private String productType;

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }
}