package com.tc3.portal.controllers;

import com.tc3.core.services.CustomerManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tc3.core.models.Customer;
import com.tc3.portal.dto.CustomerDto;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class CustomerController {

    private CustomerManager customerManager;

    public CustomerController(CustomerManager customerManager) {

        this.customerManager = customerManager;
    }

    @GetMapping("/register")
    public String register(Model model) {

        // Create a new customer account. It doesn't matter if someone is already logged in.

        model.addAttribute("profile", new CustomerDto());
        return "profile";
    }

    @PostMapping("/register")
    public String register(CustomerDto customerDto, Model model) {

        return "forward:/profile";
    }

    @GetMapping("/profile")
    public String profile(Model model, HttpSession session) {

        String username = (String)session.getAttribute("username");

        if (username == null) {

            return "forward:/";
        }

        Customer customer = customerManager.findCustomerByLogin(username);
        model.addAttribute("profile", new CustomerDto(customer));
        return "profile";
    }

    @PostMapping("/profile")
    public String profile(CustomerDto customerDto, Model model) {

        String result = "profile";

        if (customerDto.getPassword().equals(customerDto.getConfirmPassword()) == false) {

            model.addAttribute("errorPassword", true);
            model.addAttribute("profile", customerDto);

        } else if (customerManager.updateCustomer(new Customer(customerDto)) == false) {

            model.addAttribute("errorSave", true);
            model.addAttribute("profile", customerDto);

        } else {

            result = "redirect:/";
        }

        return result;
    }
}
