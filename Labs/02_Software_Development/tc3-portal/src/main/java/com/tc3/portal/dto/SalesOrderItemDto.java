// SalesOrderItemDto.java
// Copyright © 2019 NextStep IT Training. All rights reserved.
//

package com.tc3.portal.dto;

import java.math.BigDecimal;

import com.tc3.core.models.SalesOrderItem;

public class SalesOrderItemDto {

    private long salesOrderItemId;
    private long salesOrderId;
    private long productId;
    private String name;
    private Integer quantity;
    private BigDecimal price;

    public SalesOrderItemDto() {
    }

    public SalesOrderItemDto(SalesOrderItem salesOrderItem) {

        this();

        setSalesOrderItemId(salesOrderItem.getSalesOrderItemId());
        setSalesOrderId(salesOrderItem.getSalesOrderId());
        setProductId(salesOrderItem.getProductId());
        setQuantity(salesOrderItem.getQuantity());
        setPrice(salesOrderItem.getPrice());
    }

    public long getSalesOrderItemId() {

        return salesOrderItemId;
    }

    public void setSalesOrderItemId(long salesOrderItemId) {

        this.salesOrderItemId = salesOrderItemId;
    }

    public long getSalesOrderId() {

        return salesOrderId;
    }

    public void setSalesOrderId(long salesOrderId) {

        this.salesOrderId = salesOrderId;
    }

    public long getProductId() {

        return productId;
    }

    public void setProductId(long productId) {

        this.productId = productId;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public Integer getQuantity() {

        return quantity;
    }

    public void setQuantity(Integer quantity) {

        this.quantity = quantity;
    }

    public BigDecimal getPrice() {

        return price;
    }

    public void setPrice(BigDecimal price) {

        this.price = price;
    }
}
