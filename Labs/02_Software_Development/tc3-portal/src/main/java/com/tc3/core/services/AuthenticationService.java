// CustomerManager.java
// Copyright © 2019 NextStep IT Training. All rights reserved.
//

package com.tc3.core.services;

import com.tc3.core.dao.ICustomerRepository;
import com.tc3.core.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Service
public class AuthenticationService {

    private ICustomerRepository customerRepository;
    private HttpSession httpSession;

    public AuthenticationService(ICustomerRepository customerRespository, HttpSession httpSession) {

        this.customerRepository = customerRespository;
        this.httpSession = httpSession;
    }

    public void authenticate(String username, String password) {

        Customer customer = customerRepository.findCustomerByLoginAndPassword(username, password);

        if (customer != null) {

            httpSession.setAttribute("username", username);
        }
    }

    public void logout() {

        httpSession.removeAttribute("username");
    }
}
