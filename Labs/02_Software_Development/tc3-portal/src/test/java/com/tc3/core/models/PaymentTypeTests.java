// PaymentTypeTests.java
// Copyright © 2019 NextStep IT Training. All rights reserved.
//
// Check constructor, equals, and hashCode.
//

package com.tc3.core.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import com.tc3.portal.dto.PaymentTypeDto;

public class PaymentTypeTests {

    private PaymentTypeDto paymentTypeDto;
    private PaymentType paymentType;

    @BeforeEach
    public void setup() {

        paymentTypeDto = new PaymentTypeDto() {{
            setPaymentTypeId(1);
            setName("Credit");
        }};

        paymentType = new PaymentType(paymentTypeDto);
    }

    @Test
    public void getsPaymentTypeIdFromDto() {

        assertEquals(paymentTypeDto.getPaymentTypeId(), paymentType.getPaymentTypeId());
    }

    @Test
    public void getsNameFromDto() {

        assertEquals(paymentTypeDto.getName(), paymentType.getName());
    }

    @Test
    public void assertsIsEqual() {

        PaymentType newPaymentType = new PaymentType(paymentTypeDto);

        assertEquals(paymentType, newPaymentType);
    }

    @Test
    public void assertsIsNotEqualWithDifferentPaymentTypeId() {

        PaymentType newPaymentType = new PaymentType(paymentTypeDto);

        newPaymentType.setPaymentTypeId(2);
        assertNotEquals(paymentType, newPaymentType);
    }

    @Test
    public void assertsIsNotEqualWithDifferentName() {

        PaymentType newPaymentType = new PaymentType(paymentTypeDto);

        newPaymentType.setName("Cash");
        assertNotEquals(paymentType, newPaymentType);
    }

    @Test
    public void assertsSameHashIsEqual() {

        PaymentType newPaymentType = new PaymentType(paymentTypeDto);

        assertEquals(paymentType.hashCode(), newPaymentType.hashCode());
    }

    @Test
    public void assertsHashIsNotEqualWithDifferentPaymentTypeId() {

        PaymentType newPaymentType = new PaymentType(paymentTypeDto);

        newPaymentType.setPaymentTypeId(2);
        assertNotEquals(paymentType.hashCode(), newPaymentType.hashCode());
    }

    @Test
    public void assertsHashIsNotEqualWithDifferentName() {

        PaymentType newPaymentType = new PaymentType(paymentTypeDto);

        newPaymentType.setName("Cash");
        assertNotEquals(paymentType.hashCode(), newPaymentType.hashCode());
    }
}
