// ProductTests.java
// Copyright © 2019 NextStep IT Training. All rights reserved.
//
// Check the constructore.
//

package com.tc3.portal.dto;

import com.tc3.core.models.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class ProductDtoTests {

    private Product product;
    private ProductDto productDto;

    @BeforeEach
    public void setup() {

        product = new Product() {{
            setProductId(1);
            setProductTypeId(1);
            setName("widget");
            setPrice(BigDecimal.valueOf(2.0));
        }};

        productDto = new ProductDto(product);
    }

    @Test
    public void getsProductIdFromDto() {

        assertEquals(product.getProductId(), productDto.getProductId());
    }

    @Test
    public void getsProductTypeIdFromDto() {

        assertEquals(product.getProductTypeId(), productDto.getProductTypeId());
    }

    @Test
    public void getsNameFromDto() {

        assertEquals(product.getName(), productDto.getName());
    }

    @Test
    public void getsPriceFromDto() {

        assertEquals(product.getPrice(), productDto.getPrice());
    }
}
