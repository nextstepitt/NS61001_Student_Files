// Customer.java
// Copyright © 2019 NextStep IT Training. All rights reserved.
//
// Check the constructor, equals, and hashCode.
//

package com.tc3.core.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import com.tc3.portal.dto.CustomerDto;

public class CustomerTests {

    private CustomerDto customerDto;
    private Customer customer;

    @BeforeEach
    public void setup() {

        customerDto = new CustomerDto() {{
            setCustomerId(1);
            setLogin("jpublic");
            setEmail("john.public@wonderfulwidgets.com");
            setPassword("12345");
            setFirstName("John");
            setLastName("Public");
        }};

        customer = new Customer(customerDto);
    }

    @Test
    public void getsCustomerIdFromDto() {

        assertEquals(customerDto.getCustomerId(), customer.getCustomerId());
    }
    
    @Test
    public void getsLoginFromDto() {

        assertEquals(customerDto.getLogin(), customer.getLogin());
    }

    @Test
    public void getsEmailFromDto() {

        assertEquals(customerDto.getEmail(), customer.getEmail());
    }

    @Test
    public void getsPasswordFromDto() {

        assertEquals(customerDto.getPassword(), customer.getPassword());
    }

    @Test
    public void getsFirstNameFromDto() {

        assertEquals(customerDto.getFirstName(), customer.getFirstName());
    }

    @Test
    public void getsLastNameFromDto() {

        assertEquals(customerDto.getLastName(), customer.getLastName());
    }
    
    @Test
    public void assertsIsEqual() {
        
        Customer newCustomer = new Customer(customerDto);

        assertEquals(customer, newCustomer);
    }

    @Test
    public void assertsIsNotEqualWithDifferentCustomerId() {

        Customer newCustomer = new Customer(customerDto);

        newCustomer.setCustomerId(2);
        assertNotEquals(customer, newCustomer);
    }

    @Test
    public void assertsIsNotEqualWithDifferentLogin() {

        Customer newCustomer = new Customer(customerDto);

        newCustomer.setLogin("rroberts");
        assertNotEquals(customer, newCustomer);
    }

    @Test
    public void assertsIsNotEqualWithDifferentEmail() {

        Customer newCustomer = new Customer(customerDto);

        newCustomer.setEmail("rroberts@wonderfulwidgets.com");
        assertNotEquals(customer, newCustomer);
    }

    @Test
    public void assertsIsNotEqualWithDifferentPassword() {

        Customer newCustomer = new Customer(customerDto);

        newCustomer.setPassword("54321");
        assertNotEquals(customer, newCustomer);
    }

    @Test
    public void assertsIsNotEqualWithDifferentFirstName() {

        Customer newCustomer = new Customer(customerDto);

        newCustomer.setFirstName("Robert");
        assertNotEquals(customer, newCustomer);
    }

    @Test
    public void assertsIsNotEqualWithDifferentLastName() {

        Customer newCustomer = new Customer(customerDto);

        newCustomer.setLastName("Roberts");
        assertNotEquals(customer, newCustomer);
    }

    @Test
    public void assertsHashIsEqual() {

        Customer newCustomer = new Customer(customerDto);

        assertEquals(customer.hashCode(), newCustomer.hashCode());
    }

    @Test
    public void assertsHasIsNotEqualWithDifferentCustomerId() {

        Customer newCustomer = new Customer(customerDto);

        newCustomer.setCustomerId(2);
        assertNotEquals(customer.hashCode(), newCustomer.hashCode());
    }

    @Test
    public void assertsHasIsNotEqualWithDifferentLogin() {

        Customer newCustomer = new Customer(customerDto);

        newCustomer.setLogin("rroberts");
        assertNotEquals(customer.hashCode(), newCustomer.hashCode());
    }

    @Test
    public void assertsHasIsNotEqualWithDifferentEmail() {

        Customer newCustomer = new Customer(customerDto);

        newCustomer.setEmail("rroberts@wonderfulwidgets.com");
        assertNotEquals(customer.hashCode(), newCustomer.hashCode());
    }

    @Test
    public void assertsHasIsNotEqualWithDifferentPassword() {

        Customer newCustomer = new Customer(customerDto);

        newCustomer.setPassword("54321");
        assertNotEquals(customer.hashCode(), newCustomer.hashCode());
    }

    @Test
    public void assertsHasIsNotEqualWithDifferentFirstName() {

        Customer newCustomer = new Customer(customerDto);

        newCustomer.setFirstName("Robert");
        assertNotEquals(customer.hashCode(), newCustomer.hashCode());
    }

    @Test
    public void assertsHasIsNotEqualWithDifferentId() {

        Customer newCustomer = new Customer(customerDto);

        newCustomer.setLastName("Roberts");
        assertNotEquals(customer.hashCode(), newCustomer.hashCode());
    }
}
