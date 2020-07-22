// SalesOrderTests.java
// Copyright © 2019 NextStep IT Training. All rights reserved.
//

package com.tc3.core.models;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import com.tc3.portal.dto.SalesOrderDto;

public class SalesOrderTests {

    private SalesOrderDto salesOrderDto;
    private SalesOrder salesOrder;

    @BeforeEach
    public void setup() {

        salesOrderDto = new SalesOrderDto() {{
                setOrderDate(new java.sql.Date(System.currentTimeMillis()));
                setCustomerId(1);
                setTotal(BigDecimal.valueOf(2.0));
                setPaymentTypeId(1);
                setSalesOrderId(1);
                setCardNumber("378282246310005");
                setCardExpires(new java.sql.Date(System.currentTimeMillis()));
                setFilled(null);
        }};

        salesOrder = new SalesOrder(salesOrderDto);
    }

    @Test
    public void getsSalesOrderIdFromDto() {

        assertEquals(salesOrderDto.getSalesOrderId(), salesOrder.getSalesOrderId());
    }

    @Test
    public void getsOrderDateFromDto() {

        assertEquals(salesOrderDto.getOrderDate(), salesOrder.getOrderDate());
    }

    @Test
    public void getsSCustomerIdFromDto() {

        assertEquals(salesOrderDto.getCustomerId(), salesOrder.getCustomerId());
    }

    @Test
    public void getsTotalFromDto() {

        assertEquals(salesOrderDto.getTotal(), salesOrder.getTotal());
    }

    @Test
    public void getsPaymentTypeIdFromDto() {

        assertEquals(salesOrderDto.getPaymentTypeId(), salesOrder.getPaymentTypeId());
    }

    @Test
    public void getsCardNumberFromDto() {

        assertEquals(salesOrderDto.getCardNumber(), salesOrder.getCardNumber());
    }

    @Test
    public void getCardExpiresFromDto() {

        assertEquals(salesOrderDto.getCardExpires(), salesOrder.getCardExpires());
    }

    @Test
    public void getFilledFromDto() {

        assertEquals(salesOrderDto.getFilled(), salesOrder.getFilled());
    }

    @Test
    public void assertsIsEqual() {

        SalesOrder newSalesOrder = new SalesOrder(salesOrderDto);

        assertEquals(salesOrder, newSalesOrder);
    }

    @Test
    public void assertsIsNotEqualWithDifferentSalesOrderId() {

        SalesOrder newSalesOrder = new SalesOrder(salesOrderDto);

        newSalesOrder.setSalesOrderId(2);
        assertNotEquals(salesOrder, newSalesOrder);
    }

    @Test
    public void assertsIsNotEqualWithDifferentOrderDate() {

        SalesOrder newSalesOrder = new SalesOrder(salesOrderDto);

        // Make sure the new date is at least one minute into the future so as not to collide.

        newSalesOrder.setOrderDate(new java.sql.Date(System.currentTimeMillis() + 600000));
        assertNotEquals(salesOrder, newSalesOrder);
    }

    @Test
    public void assertsIsNotEqualWithDifferentCustomerrId() {

        SalesOrder newSalesOrder = new SalesOrder(salesOrderDto);

        newSalesOrder.setCustomerId(2);
        assertNotEquals(salesOrder, newSalesOrder);
    }

    @Test
    public void assertsIsNotEqualWithDifferentTotal() {

        SalesOrder newSalesOrder = new SalesOrder(salesOrderDto);

        newSalesOrder.setSalesOrderId(2);
        assertNotEquals(salesOrder, newSalesOrder);
    }

    @Test
    public void assertsIsNotEqualWithDifferentPaymentTypeId() {

        SalesOrder newSalesOrder = new SalesOrder(salesOrderDto);

        newSalesOrder.setPaymentTypeId(2);
        assertNotEquals(salesOrder, newSalesOrder);
    }

    @Test
    public void assertsIsNotEqualWithDifferentCardNumber() {

        SalesOrder newSalesOrder = new SalesOrder(salesOrderDto);

        newSalesOrder.setCardNumber("2220991223630336");
        assertNotEquals(salesOrder, newSalesOrder);
    }

    @Test
    public void assertsIsNotEqualWithDifferentCardExpires() {

        SalesOrder newSalesOrder = new SalesOrder(salesOrderDto);

        // Make sure the new expiration data is at least one minute in the future to avoid collision.

        newSalesOrder.setCardExpires(new java.sql.Date(System.currentTimeMillis() + 600000));
        assertNotEquals(salesOrder, newSalesOrder);
    }

    @Test
    public void assertsIsNotEqualWithDifferentFilled() {

        SalesOrder newSalesOrder = new SalesOrder(salesOrderDto);

        newSalesOrder.setFilled(new java.sql.Date(System.currentTimeMillis()));
        assertNotEquals(salesOrder, newSalesOrder);
    }

    @Test
    public void assertsHashIsEqual() {

        SalesOrder newSalesOrder = new SalesOrder(salesOrderDto);

        assertEquals(salesOrder.hashCode(), newSalesOrder.hashCode());
    }

    @Test
    public void assertsHashIsNotEqualWithDifferentSalesOrderId() {

        SalesOrder newSalesOrder = new SalesOrder(salesOrderDto);

        newSalesOrder.setSalesOrderId(2);
        assertNotEquals(salesOrder.hashCode(), newSalesOrder.hashCode());
    }

    @Test
    public void assertsHashIsNotEqualWithDifferentOrderDate() {

        SalesOrder newSalesOrder = new SalesOrder(salesOrderDto);

        // Make sure the new date is at least one minute into the future so as not to collide.

        newSalesOrder.setOrderDate(new java.sql.Date(System.currentTimeMillis() + 600000));
        assertNotEquals(salesOrder.hashCode(), newSalesOrder.hashCode());
    }

    @Test
    public void assertsHashIsNotEqualWithDifferentCustomerrId() {

        SalesOrder newSalesOrder = new SalesOrder(salesOrderDto);

        newSalesOrder.setCustomerId(2);
        assertNotEquals(salesOrder.hashCode(), newSalesOrder.hashCode());
    }

    @Test
    public void assertsHashIsNotEqualWithDifferentTotal() {

        SalesOrder newSalesOrder = new SalesOrder(salesOrderDto);

        newSalesOrder.setSalesOrderId(2);
        assertNotEquals(salesOrder.hashCode(), newSalesOrder.hashCode());
    }

    @Test
    public void assertsHashIsNotEqualWithDifferentPaymentTypeId() {

        SalesOrder newSalesOrder = new SalesOrder(salesOrderDto);

        newSalesOrder.setPaymentTypeId(2);
        assertNotEquals(salesOrder.hashCode(), newSalesOrder.hashCode());
    }

    @Test
    public void assertsHashIsNotEqualWithDifferentCardNumber() {

        SalesOrder newSalesOrder = new SalesOrder(salesOrderDto);

        newSalesOrder.setCardNumber("2220991223630336");
        assertNotEquals(salesOrder.hashCode(), newSalesOrder.hashCode());
    }

    @Test
    public void assertsHashIsNotEqualWithDifferentCardExpires() {

        SalesOrder newSalesOrder = new SalesOrder(salesOrderDto);

        // Make sure the new expiration data is at least one minute in the future to avoid collision.

        newSalesOrder.setCardExpires(new java.sql.Date(System.currentTimeMillis() + 600000));
        assertNotEquals(salesOrder.hashCode(), newSalesOrder.hashCode());
    }

    @Test
    public void assertsHashIsNotEqualWithDifferentFilled() {

        SalesOrder newSalesOrder = new SalesOrder(salesOrderDto);

        newSalesOrder.setFilled(new java.sql.Date(System.currentTimeMillis()));
        assertNotEquals(salesOrder.hashCode(), newSalesOrder.hashCode());
    }
}
