// SalesOrderHandler.java
// Copyright © 2019 NextStep IT Training. All rights reserved.
//

package com.tc3.core.services;

import com.tc3.core.dao.ISalesOrderRepository;
import com.tc3.core.models.CardInfo;
import com.tc3.core.models.SalesOrder;
import com.tc3.core.models.SalesOrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class SalesOrderHandler {

    private IAuthorizationProvider authorizationProvider;
    // private ICreditCardValidator creditCardValidator;

    @Autowired
    public SalesOrderHandler() {

        this.authorizationProvider = new WidgetBankAuthorizationProvider();
        // this.creditCardValidator = new CreditCardValidator();
    }

    public boolean completeSale(SalesOrder salesOrder, CardInfo cardInfo) {

        boolean result = true;

        if (validateSale(salesOrder) == false) {

            result = false;

//        } else if (creditCardValidator.validateCardInfo(cardInfo) == false) {
//
//            result = false;

        } else if (authorizationProvider.authorize(totalSalesOrder(salesOrder), cardInfo) == null) {

            return false;
        }

        return result;
    }

    public BigDecimal totalSalesOrder(SalesOrder salesOrder) {

        BigDecimal total = new BigDecimal(0);

        for (SalesOrderItem item : salesOrder.getSalesOrderItems()) {

            BigDecimal price = item.getPrice() != null ? item.getPrice() : new BigDecimal(0);
            BigDecimal quantity = new BigDecimal(item.getQuantity() != null ? item.getQuantity() : 0);

            total = total.add(price.multiply(quantity));
        }

        return total;
    }

    private boolean validateSale(SalesOrder salesOrder) {

        BigDecimal total = totalSalesOrder(salesOrder);

        return total.compareTo(new BigDecimal(0)) > 0 && total.compareTo(new BigDecimal(250.00)) <= 0;
    }
}
