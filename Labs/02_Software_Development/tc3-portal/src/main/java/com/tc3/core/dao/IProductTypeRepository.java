// IProductTypeRepository.java
// Copyright © 2019 NextStep IT Training. All rights reserved.
//

package com.tc3.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tc3.core.models.ProductType;

public interface IProductTypeRepository extends JpaRepository<ProductType, Long> { // or it could extend PagingAndSortingRepository<Account, Long>{
}
