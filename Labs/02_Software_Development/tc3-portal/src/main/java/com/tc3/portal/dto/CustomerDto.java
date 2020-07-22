// Customer.java
// Copyright © 2019 NextStep IT Training. All rights reserved.
//

package com.tc3.portal.dto;

import com.tc3.core.models.Customer;

public class CustomerDto {

    private long customerId;
    private String login;
    private String email;
    private String password;
    private String confirmPassword;
    private String firstName;
    private String lastName;

    public CustomerDto()
    {
    }

    public CustomerDto(Customer customer) {

        this();

        // Password is not allowed out.

        setCustomerId(customer.getCustomerId());
        setLogin(customer.getLogin());
        // setPassword(customer.getPassword());
        setEmail(customer.getEmail());
        setFirstName(customer.getFirstName());
        setLastName(customer.getLastName());
    }

    public long getCustomerId() {

        return customerId;
    }

    public void setCustomerId(long customerId) {

        this.customerId = customerId;
    }

    public String getLogin() {

        return login;
    }

    public void setLogin(String login) {

        this.login = login;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public String getConfirmPassword() {

        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {

        this.confirmPassword = confirmPassword;
    }

    public String getFirstName() {

        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public void setLastName(String lastName) {

        this.lastName = lastName;
    }
}
