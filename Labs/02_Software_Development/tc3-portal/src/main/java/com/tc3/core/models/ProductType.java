// ProductType.java
// Copyright © 2019 NextStep IT Training. All rights reserved.
//

package com.tc3.core.models;

import java.util.Objects;
import javax.persistence.*;

import com.tc3.portal.dto.ProductTypeDto;

@Entity
@Table(name = "product_types")
public class ProductType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_type_id")
    private long productTypeId;
    private String name;

    public ProductType() {
    }

    public ProductType(ProductTypeDto productTypeDto) {

        this();

        setProductTypeId(productTypeDto.getProductTypeId());
        setName(productTypeDto.getName());
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductType that = (ProductType) o;
        return productTypeId == that.productTypeId &&
                name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productTypeId, name);
    }
}
