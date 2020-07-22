// SalesOrderItemDtoTests.java
// Copyright © 2019 NextStep IT Training. All rights reserved.
//

package com.tc3.portal.dto;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import com.tc3.core.models.SalesOrderItem;

public class SalesOrderItemDtoTests {

    private SalesOrderItem salesOrderItem;
    private SalesOrderItemDto salesOrderItemDto;

    @BeforeEach
    public void setup() {

        salesOrderItem = new SalesOrderItem() {{
            setSalesOrderItemId(1);
            setSalesOrderId(1);
            setProductId(1);
            setQuantity(1);
            setPrice(BigDecimal.valueOf(2.0));
        }};

        salesOrderItemDto = new SalesOrderItemDto(salesOrderItem);
    }
    
    @Test
    public void getsSalesOrderItemIdFromDto() {
        
        assertEquals(salesOrderItem.getSalesOrderItemId(), salesOrderItemDto.getSalesOrderItemId());
    }

    @Test
    public void getsSalesOrderIdFromDto() {

        assertEquals(salesOrderItem.getSalesOrderId(), salesOrderItemDto.getSalesOrderId());
    }

    @Test
    public void getsProductIdFromDto() {

        assertEquals(salesOrderItem.getProductId(), salesOrderItemDto.getProductId());
    }

    @Test
    public void getsQuantityFromDto() {

        assertEquals(salesOrderItem.getQuantity(), salesOrderItemDto.getQuantity());
    }

    @Test
    public void getsPriceFromDto() {

        assertEquals(salesOrderItem.getPrice(), salesOrderItemDto.getPrice());
    }
}
