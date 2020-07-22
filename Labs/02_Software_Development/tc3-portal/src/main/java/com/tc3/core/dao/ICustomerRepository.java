// ICustomerRepository.java
// Copyright © 2019 NextStep IT Training. All rights reserved.
//

package com.tc3.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tc3.core.models.Customer;

public interface ICustomerRepository extends JpaRepository<Customer, Long> { // or it could extend PagingAndSortingRepository<Account, Long>{

    Customer findCustomerByLogin(String login);
    Customer findCustomerByLoginAndPassword(String login, String password);
}
