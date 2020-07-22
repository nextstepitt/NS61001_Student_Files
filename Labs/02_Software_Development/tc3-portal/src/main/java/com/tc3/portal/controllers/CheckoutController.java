package com.tc3.portal.controllers;

import com.tc3.core.models.CardInfo;
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
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CheckoutController {

    private ProductManager productManager;
    private SalesOrderHandler salesOrderHandler;

    public CheckoutController(ProductManager productManager, SalesOrderHandler salesOrderHandler) {

        this.productManager = productManager;
        this.salesOrderHandler = salesOrderHandler;
    }

    @GetMapping("/checkout")
    public String checkout(Model model, HttpSession session) {

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

        return "checkout";
    }

    @PostMapping("/checout")
    public String cart(String cardHolderName, String cardNumber, String cardExpires, String ccv, Model model, HttpSession session) {

        String result = "checkout";

        try {

            SalesOrder salesOrder = (SalesOrder) session.getAttribute("salesOrder");
            CardInfo cardInfo = new CardInfo() {{ setName(cardHolderName); setCardNumber(cardNumber); setCcv(Integer.parseInt(ccv)); }};
            SimpleDateFormat fromMvc = new SimpleDateFormat("dd/MM/yyyy");
            java.util.Date parsedDate = fromMvc.parse("01/" + cardExpires);

            cardInfo.setExpires(new java.sql.Date(parsedDate.getTime()));

            if (!salesOrderHandler.completeSale(salesOrder, cardInfo)) {

                model.addAttribute("cardDeclined", true);

            } else {

                result = "forward:/";
            }
        }

        catch (NumberFormatException e) {

            model.addAttribute("cardCcvParseError", true);
        }

        catch (ParseException e) {

            model.addAttribute("cardExpireParseError", true);
        }

        return result;
    }
}
