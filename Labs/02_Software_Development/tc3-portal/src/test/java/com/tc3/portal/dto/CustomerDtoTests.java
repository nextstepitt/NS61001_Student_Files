// CustomerDtoTests.java
// Copyright © 2019 NextStep IT Training. All rights reserved.
//
// Check that the password is blocked outbound in the constructor.
//

package com.tc3.portal.dto;

import com.tc3.core.models.Customer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CustomerDtoTests {

    private Customer customer;
    private CustomerDto customerDto;

    @BeforeEach
    public void setup() {

        customer = new Customer() {{
            setCustomerId(1);
            setLogin("jpublic");
            setEmail("john.public@wonderfulwidgets.com");
            setPassword("12345");
            setFirstName("John");
            setLastName("Public");
        }};

        this.customerDto = new CustomerDto(this.customer);
    }

    @Test
    public void getsCustomerIdFromDto() {

        assertEquals(this.customer.getCustomerId(), this.customerDto.getCustomerId());
    }

    @Test
    public void getsLoginFromDto() {

        assertEquals(this.customer.getLogin(), this.customerDto.getLogin());
    }

    @Test
    public void getsEmailFromDto() {

        assertEquals(this.customer.getEmail(), this.customerDto.getEmail());
    }

    @Test
    public void getsPasswordFromDto() {

        // The password is blocked.

        assertNull(this.customerDto.getPassword());
    }

    @Test
    public void getsFirstNameFromDto() {

        assertEquals(this.customer.getFirstName(), this.customerDto.getFirstName());
    }

    @Test
    public void getsLastNameFromDto() {

        assertEquals(this.customer.getLastName(), this.customerDto.getLastName());
    }
}
