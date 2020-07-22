// SalesOrderHandlerTests.cs
// Copyright © 2019 NextStep IT Training. All rights reserved.
//

package com.tc3.core.services;

import com.tc3.core.__mocks__.AuthorizationProviderMock;
import com.tc3.core.dao.ISalesOrderRepository;
import com.tc3.core.models.CardInfo;
import com.tc3.core.models.SalesOrder;
import com.tc3.core.models.SalesOrderItem;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

public class SalesOrderHandlerTests {

    private CardInfo cardInfo;
    private SalesOrder salesOrder;
    private SalesOrderHandler salesOrderHandler;

    @BeforeEach
    public void setup() {

        salesOrderHandler = new SalesOrderHandler();

        // The shared cardInfo is initialzed to valid data. The test methods will replace one value at a time
        // with invalid data to test it. Test doubles are not required to stand in for data objects, only for
        // objects that provide business logic.

        this.cardInfo = new CardInfo();

        this.cardInfo.setName("John Q Public");
        this.cardInfo.setCardNumber("378282246310005");
        this.cardInfo.setExpires(new java.sql.Date(System.currentTimeMillis()));
        this.cardInfo.setCcv(68);

        // The shared salesOrder is initialized with valid data per the requirement: 0 < total <= 250.

        salesOrder = new SalesOrder();
        salesOrder.getSalesOrderItems().add(new SalesOrderItem() {{ setPrice(new BigDecimal(50.00)); setQuantity(2); }});
        salesOrder.getSalesOrderItems().add(new SalesOrderItem() {{ setPrice(new BigDecimal(50.00)); setQuantity(2); }});
    }

    @Test
    public void acceptsValidSalesOrderAndCardIsAuthorized() {

        cardInfo.setCardNumber("378282246310005");
        assertTrue(salesOrderHandler.completeSale(salesOrder, cardInfo));
    }

    @Test
    public void rejectsEmptySalesOrderWithValidCard() {

        salesOrder.getSalesOrderItems().clear();
        assertFalse(salesOrderHandler.completeSale(salesOrder, cardInfo));
    }

    @Test
    public void rejectsGt250SalesOrderWithValidCard() {

        salesOrder.getSalesOrderItems().get(0).setQuantity(4);
        assertFalse(salesOrderHandler.completeSale(salesOrder, cardInfo));
    }

    @Test
    public void rejectsValidSalesOrderWithInvalidCard() {

        cardInfo.setCardNumber("378282246310006");
        assertFalse(salesOrderHandler.completeSale(salesOrder, cardInfo));
    }

    @Test
    public void rejectsValidSalesOrderButValidCardIsNotAuthorized() {

        cardInfo.setCardNumber("2221001223630333");
        assertFalse(salesOrderHandler.completeSale(salesOrder, cardInfo));
    }
}
