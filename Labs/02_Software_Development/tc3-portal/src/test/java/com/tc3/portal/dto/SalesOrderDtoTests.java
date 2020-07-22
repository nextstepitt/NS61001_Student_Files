// SalesOrderTests.java
// Copyright © 2019 NextStep IT Training. All rights reserved.
//

package com.tc3.portal.dto;

import com.tc3.core.models.SalesOrder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SalesOrderDtoTests {

    private SalesOrder salesOrder;
    private SalesOrderDto salesOrderDto;

    @BeforeEach
    public void setup() {

        salesOrder = new SalesOrder() {{
                setOrderDate(new java.sql.Date(System.currentTimeMillis()));
                setCustomerId(1);
                setTotal(BigDecimal.valueOf(2.0));
                setPaymentTypeId(1);
                setSalesOrderId(1);
                setCardNumber("378282246310005");
                setCardExpires(new java.sql.Date(System.currentTimeMillis()));
                setFilled(null);
        }};

        salesOrderDto = new SalesOrderDto(salesOrder);
    }

    @Test
    public void getsSalesOrderIdFromDto() {

        assertEquals(salesOrder.getSalesOrderId(), salesOrderDto.getSalesOrderId());
    }

    @Test
    public void getsOrderDateFromDto() {

        assertEquals(salesOrder.getOrderDate(), salesOrderDto.getOrderDate());
    }

    @Test
    public void getsSCustomerIdFromDto() {

        assertEquals(salesOrder.getCustomerId(), salesOrderDto.getCustomerId());
    }

    @Test
    public void getsTotalFromDto() {

        assertEquals(salesOrder.getTotal(), salesOrderDto.getTotal());
    }

    @Test
    public void getsPaymentTypeIdFromDto() {

        assertEquals(salesOrder.getPaymentTypeId(), salesOrderDto.getPaymentTypeId());
    }

    @Test
    public void getsCardNumberFromDto() {

        // The card number cannot be passed through the constructor.

        assertEquals(null, salesOrderDto.getCardNumber());
    }

    @Test
    public void getCardExpiresFromDto() {

        // The card expires cannot be passed through the constructor.

        assertEquals(null, salesOrderDto.getCardExpires());
    }

    @Test
    public void getFilledFromDto() {

        assertEquals(salesOrder.getFilled(), salesOrderDto.getFilled());
    }
}
