// ISlesOrderRepository.java
// Copyright © 2019 NextStep IT Training. All rights reserved.
//

package com.tc3.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tc3.core.models.SalesOrder;

public interface ISalesOrderRepository extends JpaRepository<SalesOrder, Long> { // or it could extend PagingAndSortingRepository<Account, Long>{
}
