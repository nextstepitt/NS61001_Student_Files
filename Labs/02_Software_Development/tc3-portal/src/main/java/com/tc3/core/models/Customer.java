// Customer.java
// Copyright © 2019 NextStep IT Training. All rights reserved.
//

package com.tc3.core.models;

import com.tc3.portal.dto.CustomerDto;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private long customerId;

    private String login;
    private String email;
    private String password;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

//    @OneToMany
//    @JoinColumn(name = "customerId", referencedColumnName = "customer_id", insertable = false, updatable = false)
//    private Collection<SalesOrder> salesOrders;

    public Customer()
    {

        // salesOrders = new ArrayList<SalesOrder>();
    }

    public Customer(CustomerDto customerDto) {

        this();

        setCustomerId(customerDto.getCustomerId());
        setLogin(customerDto.getLogin());
        setPassword(customerDto.getPassword());
        setEmail(customerDto.getEmail());
        setFirstName(customerDto.getFirstName());
        setLastName(customerDto.getLastName());
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

//    public Collection<SalesOrder> getSalesOrders() {
//
//        return salesOrders;
//    }
//
//    public void setSalesOrders(Collection<SalesOrder> salesOrders) {
//
//        this.salesOrders = salesOrders;
//    }

    @Override
    public boolean equals(Object o) {

        // The relationshipos are not part of the equivalence, look to the columns.

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return customerId == customer.customerId &&
                Objects.equals(login, customer.login) &&
                Objects.equals(password, customer.password) &&
                Objects.equals(email, customer.email) &&
                Objects.equals(firstName, customer.firstName) &&
                Objects.equals(lastName, customer.lastName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(customerId, login, password, email, firstName, lastName);
    }
}
