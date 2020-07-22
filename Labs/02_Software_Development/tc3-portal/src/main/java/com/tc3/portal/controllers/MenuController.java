package com.tc3.portal.controllers;

import com.tc3.core.models.Product;
import com.tc3.core.services.ProductManager;
import com.tc3.portal.dto.ProductDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MenuController {

    private ProductManager productManager;

    public MenuController(ProductManager productManager) {

        this.productManager = productManager;
    }

    @GetMapping("/menu")
    public String menu(Model model) {

        List<Product> pastries = productManager.getPastries();
        List<Product> beverages = productManager.getBeverages();

        List<ProductDto> pastryDtos = new ArrayList<ProductDto>();
        List<ProductDto> beverageDtos = new ArrayList<ProductDto>();

        for (Product pastry : pastries) {

            pastryDtos.add(new ProductDto(pastry));
        }

        for (Product beverage : beverages) {

            beverageDtos.add(new ProductDto(beverage));
        }

        model.addAttribute("pastries", pastryDtos);
        model.addAttribute("beverages", beverageDtos);
        return "menu";
    }
}
