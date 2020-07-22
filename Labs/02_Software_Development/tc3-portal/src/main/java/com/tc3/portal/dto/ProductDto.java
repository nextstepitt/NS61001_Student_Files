// Product.java
// Copyright © 2019 NextStep IT Training. All rights reserved.
//

package com.tc3.portal.dto;

import com.tc3.core.models.Product;

import java.math.BigDecimal;

public class ProductDto {

    private long productId;
    private long productTypeId;
    private String name;
    private BigDecimal price;

    public ProductDto() {
    }

    public ProductDto(Product product) {

        this();

        setProductId(product.getProductId());
        setProductTypeId(product.getProductTypeId());
        setName(product.getName());
        setPrice(product.getPrice());
    }

    public long getProductId() {

        return productId;
    }

    public void setProductId(long productId) {

        this.productId = productId;
    }

    public long getProductTypeId() {

        return productTypeId;
    }

    public void setProductTypeId(long productTypeId) {

        this.productTypeId = productTypeId;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public BigDecimal getPrice() {

        return price;
    }

    public void setPrice(BigDecimal price) {

        this.price = price;
    }
}
