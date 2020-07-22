// ProductTests.java
// Copyright © 2019 NextStep IT Training. All rights reserved.
//
// Check the constructor, equals, and hashCode.
//

package com.tc3.core.models;

import com.tc3.portal.dto.ProductDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ProductTests {

    private ProductDto productDto;
    private Product product;

    @BeforeEach
    public void setup() {

        productDto = new ProductDto() {{
            setProductId(1);
            setProductTypeId(1);
            setName("widget");
            setPrice(BigDecimal.valueOf(2.0));
        }};

        product = new Product(productDto);
    }

    @Test
    public void getsProductIdFromDto() {

        assertEquals(productDto.getProductId(), product.getProductId());
    }

    @Test
    public void getsProductTypeIdFromDto() {

        assertEquals(productDto.getProductTypeId(), product.getProductTypeId());
    }

    @Test
    public void getsNameFromDto() {

        assertEquals(productDto.getName(), product.getName());
    }

    @Test
    public void getsPriceFromDto() {

        assertEquals(productDto.getPrice(), product.getPrice());
    }

    @Test
    public void assertsIsEqual() {

        Product newProduct = new Product(productDto);

        assertEquals(product, newProduct);
    }

    @Test
    public void assertsIsNotEquaWithDifferentProductId() {

        Product newProduct = new Product(productDto);

        newProduct.setProductId(2);
        assertNotEquals(product, newProduct);
    }

    @Test
    public void assertsIsNotEquaWithDifferentProductTypeId() {

        Product newProduct = new Product(productDto);

        newProduct.setProductTypeId(2);
        assertNotEquals(product, newProduct);
    }

    @Test
    public void assertsIsNotEquaWithDifferentName() {

        Product newProduct = new Product(productDto);

        newProduct.setName("gear");
        assertNotEquals(product, newProduct);
    }

    @Test
    public void assertsIsNotEquaWithDifferentPrice() {

        Product newProduct = new Product(productDto);

        newProduct.setPrice(BigDecimal.valueOf(3.0));
        assertNotEquals(product, newProduct);
    }

    @Test
    public void assertsHashIsEqual() {

        Product newProduct = new Product(productDto);

        assertEquals(product.hashCode(), newProduct.hashCode());
    }
    
    @Test
    public void assertsHashIsNotEquaWithDifferentProductId() {

        Product newProduct = new Product(productDto);

        newProduct.setProductId(2);
        assertNotEquals(product.hashCode(), newProduct.hashCode());
    }

    @Test
    public void assertsHashIsNotEquaWithDifferentProductTypeId() {

        Product newProduct = new Product(productDto);

        newProduct.setProductTypeId(2);
        assertNotEquals(product.hashCode(), newProduct.hashCode());
    }

    @Test
    public void assertsHashIsNotEquaWithDifferentName() {

        Product newProduct = new Product(productDto);

        newProduct.setName("gear");
        assertNotEquals(product.hashCode(), newProduct.hashCode());
    }

    @Test
    public void assertsHashIsNotEquaWithDifferentPrice() {

        Product newProduct = new Product(productDto);

        newProduct.setPrice(BigDecimal.valueOf(3.0));
        assertNotEquals(product.hashCode(), newProduct.hashCode());
    }
}
