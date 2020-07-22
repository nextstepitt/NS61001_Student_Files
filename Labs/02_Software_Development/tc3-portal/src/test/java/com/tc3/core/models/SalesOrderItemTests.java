// SalesOrderItemTests.java
// Copyright © 2019 NextStep IT Training. All rights reserved.
//

package com.tc3.core.models;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import com.tc3.portal.dto.SalesOrderItemDto;

public class SalesOrderItemTests {

    private SalesOrderItemDto salesOrderItemDto;
    private SalesOrderItem salesOrderItem;

    @BeforeEach
    public void setup() {

        salesOrderItemDto = new SalesOrderItemDto() {{
            setSalesOrderItemId(1);
            setSalesOrderId(1);
            setProductId(1);
            setQuantity(1);
            setPrice(BigDecimal.valueOf(2.0));
        }};

        salesOrderItem = new SalesOrderItem(salesOrderItemDto);
    }
    
    @Test
    public void getsSalesOrderItemIdFromDto() {
        
        assertEquals(salesOrderItemDto.getSalesOrderItemId(), salesOrderItem.getSalesOrderItemId());
    }

    @Test
    public void getsSalesOrderIdFromDto() {

        assertEquals(salesOrderItemDto.getSalesOrderId(), salesOrderItem.getSalesOrderId());
    }

    @Test
    public void getsProductIdFromDto() {

        assertEquals(salesOrderItemDto.getProductId(), salesOrderItem.getProductId());
    }

    @Test
    public void getsQuantityFromDto() {

        assertEquals(salesOrderItemDto.getQuantity(), salesOrderItem.getQuantity());
    }

    @Test
    public void getsPriceFromDto() {

        assertEquals(salesOrderItemDto.getPrice(), salesOrderItem.getPrice());
    }

    @Test
    public void assertsIsEqual() {
        
        SalesOrderItem newSalesOrderItem = new SalesOrderItem(salesOrderItemDto);

        assertEquals(salesOrderItem, newSalesOrderItem);
    }

    @Test
    public void assertsIsNotEqualWithDifferentSalesOrderId() {

        SalesOrderItem newSalesOrderItem = new SalesOrderItem(salesOrderItemDto);

        newSalesOrderItem.setSalesOrderId(2);
        assertNotEquals(salesOrderItem, newSalesOrderItem);
    }

    @Test
    public void assertsIsNotEqualWithDifferentProductId() {

        SalesOrderItem newSalesOrderItem = new SalesOrderItem(salesOrderItemDto);

        newSalesOrderItem.setProductId(2);
        assertNotEquals(salesOrderItem, newSalesOrderItem);
    }

    @Test
    public void assertsIsNotEqualWithDifferentQuantity() {

        SalesOrderItem newSalesOrderItem = new SalesOrderItem(salesOrderItemDto);

        newSalesOrderItem.setQuantity(2);
        assertNotEquals(salesOrderItem, newSalesOrderItem);
    }

    @Test
    public void assertsIsNotEqualWithDifferentPrice() {

        SalesOrderItem newSalesOrderItem = new SalesOrderItem(salesOrderItemDto);

        newSalesOrderItem.setPrice(BigDecimal.valueOf(3.0));
        assertNotEquals(salesOrderItem, newSalesOrderItem);
    }

    @Test
    public void assertsIsNotEqualWithDifferentSalesOrderItemId() {

        SalesOrderItem newSalesOrderItem = new SalesOrderItem(salesOrderItemDto);

        newSalesOrderItem.setSalesOrderId(2);
        assertNotEquals(salesOrderItem, newSalesOrderItem);
    }

    @Test
    public void assertsHashIsEqual() {

        SalesOrderItem newSalesOrderItem = new SalesOrderItem(salesOrderItemDto);

        assertEquals(salesOrderItem.hashCode(), newSalesOrderItem.hashCode());
    }

    @Test
    public void assertsHashIsNotEqualWithDifferentSalesOrderId() {

        SalesOrderItem newSalesOrderItem = new SalesOrderItem(salesOrderItemDto);

        newSalesOrderItem.setSalesOrderId(2);
        assertNotEquals(salesOrderItem.hashCode(), newSalesOrderItem.hashCode());
    }

    @Test
    public void assertsHashIsNotEqualWithDifferentProductId() {

        SalesOrderItem newSalesOrderItem = new SalesOrderItem(salesOrderItemDto);

        newSalesOrderItem.setProductId(2);
        assertNotEquals(salesOrderItem.hashCode(), newSalesOrderItem.hashCode());
    }

    @Test
    public void assertsHashIsNotEqualWithDifferentQuantity() {

        SalesOrderItem newSalesOrderItem = new SalesOrderItem(salesOrderItemDto);

        newSalesOrderItem.setQuantity(2);
        assertNotEquals(salesOrderItem.hashCode(), newSalesOrderItem.hashCode());
    }

    @Test
    public void assertsHashIsNotEqualWithDifferentPrice() {

        SalesOrderItem newSalesOrderItem = new SalesOrderItem(salesOrderItemDto);

        newSalesOrderItem.setPrice(BigDecimal.valueOf(3.0));
        assertNotEquals(salesOrderItem.hashCode(), newSalesOrderItem.hashCode());
    }

    @Test
    public void assertsHashIsNotEqualWithDifferentSalesOrderItemId() {

        SalesOrderItem newSalesOrderItem = new SalesOrderItem(salesOrderItemDto);

        newSalesOrderItem.setSalesOrderId(2);
        assertNotEquals(salesOrderItem.hashCode(), newSalesOrderItem.hashCode());
    }
}
