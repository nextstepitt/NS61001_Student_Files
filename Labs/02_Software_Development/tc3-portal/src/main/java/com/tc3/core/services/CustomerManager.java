// CustomerManager.java
// Copyright © 2019 NextStep IT Training. All rights reserved.
//

package com.tc3.core.services;

import com.tc3.core.dao.ICustomerRepository;
import com.tc3.core.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerManager {

    private ICustomerRepository customerRepository;

    public CustomerManager(ICustomerRepository customerRepository) {

        this.customerRepository = customerRepository;
    }

    public Customer findCustomerByLogin(String login) {

        return customerRepository.findCustomerByLogin(login);
    }

    public boolean updateCustomer(Customer customer) {

        boolean result = true;

        // Unelegant but simple: if the password is not set, we need to copy it from the original record.

        if (customer.getCustomerId() != 0 && customer.getPassword() == "") {

            Customer originalCustomer = customerRepository.getOne(customer.getCustomerId());

            customer.setPassword(originalCustomer.getPassword());
        }

        try {

            customerRepository.save(customer);
        }

        catch (Exception e) {

            System.out.println(e.toString());
            result = false;
        }

        return result;
    }
}
