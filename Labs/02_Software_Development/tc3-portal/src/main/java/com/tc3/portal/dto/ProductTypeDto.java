// ProductType.java
// Copyright © 2019 NextStep IT Training. All rights reserved.
//

package com.tc3.portal.dto;

import com.tc3.core.models.ProductType;

public class ProductTypeDto {

    private long productTypeId;
    private String name;

    public ProductTypeDto() {
    }

    public ProductTypeDto(ProductType ProductType) {

        this();

        setProductTypeId(ProductType.getProductTypeId());
        setName(ProductType.getName());
    }

    public long getProductTypeId() {

        return productTypeId;
    }

    public void setProductTypeId(long id) {

        this.productTypeId = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
}
