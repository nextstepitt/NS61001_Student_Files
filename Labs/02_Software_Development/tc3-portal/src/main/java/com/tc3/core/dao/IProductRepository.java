// IProductRepository.java
// Copyright © 2019 NextStep IT Training. All rights reserved.
//

package com.tc3.core.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tc3.core.models.Product;

import java.util.List;

public interface IProductRepository extends JpaRepository<Product, Long> { // or it could extend PagingAndSortingRepository<Account, Long>{

    List<Product> getProductsByProductTypeId(long productTypeId);
}
