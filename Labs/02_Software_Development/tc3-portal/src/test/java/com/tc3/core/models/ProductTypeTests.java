// ProductTypeTests.java
// Copyright © 2019 NextStep IT Training. All rights reserved.
//
// Check constructor, equals, and hashCode.
//

package com.tc3.core.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import com.tc3.portal.dto.ProductTypeDto;

public class ProductTypeTests {

    private ProductTypeDto productTypeDto;
    private ProductType productType;

    @BeforeEach
    public void setup() {

        productTypeDto = new ProductTypeDto() {{
            setProductTypeId(1);
            setName("Beverage");
        }};

        productType = new ProductType(productTypeDto);
    }

    @Test
    public void getsProductTypeIdFromDto() {

        assertEquals(productTypeDto.getProductTypeId(), productType.getProductTypeId());
    }

    @Test
    public void getsNameFromDto() {

        assertEquals(productTypeDto.getName(), productType.getName());
    }

    @Test
    public void assertsIsEqual() {

        ProductType newProductType = new ProductType(productTypeDto);

        assertEquals(productType, newProductType);
    }

    @Test
    public void assertsIsNotEqualWithDifferentProductTypeId() {

        ProductType newProductType = new ProductType(productTypeDto);

        newProductType.setProductTypeId(2);
        assertNotEquals(productType, newProductType);
    }

    @Test
    public void assertsIsNotEqualWithDifferentName() {

        ProductType newProductType = new ProductType(productTypeDto);

        newProductType.setName("Pastry");
        assertNotEquals(productType, newProductType);
    }

    @Test
    public void assertsSameHashIsEqual() {

        ProductType newProductType = new ProductType(productTypeDto);

        assertEquals(productType.hashCode(), newProductType.hashCode());
    }

    @Test
    public void assertsHashIsNotEqualWithDifferentProductTypeId() {

        ProductType newProductType = new ProductType(productTypeDto);

        newProductType.setProductTypeId(2);
        assertNotEquals(productType.hashCode(), newProductType.hashCode());
    }

    @Test
    public void assertsHashIsNotEqualWithDifferentName() {

        ProductType newProductType = new ProductType(productTypeDto);

        newProductType.setName("Pastry");
        assertNotEquals(productType.hashCode(), newProductType.hashCode());
    }
}
