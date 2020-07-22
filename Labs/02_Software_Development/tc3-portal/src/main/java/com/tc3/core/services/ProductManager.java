// CustomerManager.java
// Copyright © 2019 NextStep IT Training. All rights reserved.
//

package com.tc3.core.services;

import com.tc3.core.dao.ICustomerRepository;
import com.tc3.core.dao.IProductRepository;
import com.tc3.core.models.Customer;
import com.tc3.core.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager {

    private IProductRepository productRepository;

    public ProductManager(IProductRepository productRepository) {

        this.productRepository = productRepository;
    }

    public Product getProduct(long productId) {

        return productRepository.getOne(productId);
    }

    public List<Product> getPastries() {

        return productRepository.getProductsByProductTypeId(1);
    }

    public List<Product> getBeverages() {

        return productRepository.getProductsByProductTypeId(2);
    }
}
