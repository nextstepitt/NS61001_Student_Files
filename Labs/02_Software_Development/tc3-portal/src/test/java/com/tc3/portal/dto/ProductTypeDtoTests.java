// ProductTypeTests.java
// Copyright © 2019 NextStep IT Training. All rights reserved.
//
// Check constructore.
//

package com.tc3.portal.dto;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.tc3.core.models.ProductType;

public class ProductTypeDtoTests {

    private ProductType productType;
    private ProductTypeDto productTypeDto;

    @BeforeEach
    public void setup() {

        productType = new ProductType() {{
            setProductTypeId(1);
            setName("Beverage");
        }};

        productTypeDto = new ProductTypeDto(productType);
    }

    @Test
    public void getsProductTypeIdFromDto() {

        assertEquals(productType.getProductTypeId(), productTypeDto.getProductTypeId());
    }

    @Test
    public void getsNameFromDto() {

        assertEquals(productType.getName(), productTypeDto.getName());
    }
}
