// PaymentTypeTests.java
// Copyright © 2019 NextStep IT Training. All rights reserved.
//
// Check constructor.
//

package com.tc3.portal.dto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.tc3.core.models.PaymentType;

public class PaymentTypeDtoTests {

    private PaymentType paymentType;
    private PaymentTypeDto paymentTypeDto;

    @BeforeEach
    public void setup() {

        paymentType = new PaymentType() {{
            setPaymentTypeId(1);
            setName("Credit");
        }};

        paymentTypeDto = new PaymentTypeDto(paymentType);
    }

    @Test
    public void getsPaymentTypeIdFromDto() {

        assertEquals(paymentType.getPaymentTypeId(), paymentTypeDto.getPaymentTypeId());
    }

    @Test
    public void getsNameFromDto() {

        assertEquals(paymentType.getName(), paymentTypeDto.getName());
    }
}
