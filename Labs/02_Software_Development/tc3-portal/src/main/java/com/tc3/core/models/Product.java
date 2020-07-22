// Product.java
// Copyright © 2019 NextStep IT Training. All rights reserved.
//

package com.tc3.core.models;

import com.tc3.portal.dto.ProductDto;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private long productId;
    
    private long productTypeId;
    private String name;
    private BigDecimal price;

//    @ManyToOne(optional = false)
//    @JoinColumn(name = "productTypeId", referencedColumnName = "product_type_id", insertable = false, updatable = false)
//    private ProductType productType;

    public Product() {
    }

    public Product(ProductDto productDto) {

        this();

        setProductId(productDto.getProductId());
        setProductTypeId(productDto.getProductTypeId());
        setName(productDto.getName());
        setPrice(productDto.getPrice());
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

//    public ProductType getProductType() {
//
//        return productType;
//    }
//
//    public void setProductType(ProductType productType) {
//
//        this.productType = productType;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId == product.productId &&
                productTypeId == product.productTypeId &&
                Objects.equals(name, product.name) &&
                Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {

        return Objects.hash(productId, productTypeId, name, price);
    }
}
