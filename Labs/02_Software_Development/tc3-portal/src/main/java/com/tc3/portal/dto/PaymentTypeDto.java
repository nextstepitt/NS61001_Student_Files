// PaymentType.java
// Copyright © 2019 NextStep IT Training. All rights reserved.
//

package com.tc3.portal.dto;

import com.tc3.core.models.PaymentType;

public class PaymentTypeDto {

    private long paymentTypeId;
    private String name;

    public PaymentTypeDto() {
    }

    public PaymentTypeDto(PaymentType paymentType) {

        this();

        setPaymentTypeId(paymentType.getPaymentTypeId());
        setName(paymentType.getName());
    }

    public long getPaymentTypeId() {

        return paymentTypeId;
    }

    public void setPaymentTypeId(long paymentTypeId) {

        this.paymentTypeId = paymentTypeId;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
}
