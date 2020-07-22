package com.tc3.portal.controllers;

import com.tc3.core.models.Product;
import com.tc3.core.models.SalesOrder;
import com.tc3.core.models.SalesOrderItem;
import com.tc3.core.services.ProductManager;
import com.tc3.core.services.SalesOrderHandler;
import com.tc3.portal.dto.SalesOrderDto;
import com.tc3.portal.dto.SalesOrderItemDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ShoppingCartController {

    private ProductManager productManager;
    private SalesOrderHandler salesOrderHandler;

    public ShoppingCartController(ProductManager productManager, SalesOrderHandler salesOrderHandler) {

        this.productManager = productManager;
        this.salesOrderHandler = salesOrderHandler;
    }

    @GetMapping("/cart")
    public String cart(Model model, HttpSession session) {

        SalesOrder salesOrder = (SalesOrder)session.getAttribute("salesOrder");
        BigDecimal total = salesOrder != null ? salesOrderHandler.totalSalesOrder(salesOrder) : null;
        SalesOrderDto salesOrderDto = null;
        List<SalesOrderItemDto> salesOrderItemDtos = new ArrayList<SalesOrderItemDto>();

        if (salesOrder != null) {

            salesOrderDto = new SalesOrderDto(salesOrder);

            for (SalesOrderItem salesOrderItem : salesOrder.getSalesOrderItems()) {

                SalesOrderItemDto salesOrderItemDto = new SalesOrderItemDto(salesOrderItem);
                Product product = productManager.getProduct(salesOrderItem.getProductId());

                salesOrderItemDto.setName(product.getName());
                salesOrderItemDtos.add(salesOrderItemDto);
            }

            model.addAttribute("salesOrder", salesOrderDto);
            model.addAttribute("salesOrderItems", salesOrderItemDtos);
            model.addAttribute("salesOrderTotal", total);
        }

        return "cart";
    }

    @GetMapping("/cart/{productId}")
    public String cart(@PathVariable("productId") long productId, Model model, HttpSession session) {

        SalesOrder salesOrder = (SalesOrder)session.getAttribute("salesOrder");

        if (salesOrder == null) {

            salesOrder = new SalesOrder();
            session.setAttribute("salesOrder", salesOrder);
        }

        Product product = productManager.getProduct(productId);
        SalesOrderItem salesOrderItem = new SalesOrderItem() {{ setProductId(productId); setQuantity(1); setPrice(product.getPrice()); }};

        salesOrder.getSalesOrderItems().add(salesOrderItem);
        return "forward:/cart";
    }
}
