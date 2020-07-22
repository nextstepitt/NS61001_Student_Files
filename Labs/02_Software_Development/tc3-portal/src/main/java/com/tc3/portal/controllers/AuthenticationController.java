package com.tc3.portal.controllers;

import com.tc3.core.services.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@Controller
public class AuthenticationController {

    private AuthenticationService authenticationService;
    private HttpSession httpSession;

    public AuthenticationController(AuthenticationService authenticationService) {

        this.authenticationService = authenticationService;
        this.httpSession = httpSession;
    }

    @GetMapping("/login")
    public String loginForm(Model model, HttpSession session) {

        if (session != null && session.getAttribute("username") != null) {

            return "forward:/";
        }

        model.addAttribute("error", false);
        model.addAttribute("username", "");
        return "login";
    }

    @PostMapping("/login")
    public String login(String username, String password, Model model, HttpSession session) {

        authenticationService.authenticate(username, password);

        if (session.getAttribute("username") != null) {

            return "redirect:/";

        } else {

            model.addAttribute("error", true);
            model.addAttribute("username", username);
            return "login";
        }
    }

    @GetMapping("/logout")
    public String logout() {

        authenticationService.logout();
        return "forward:/";
    }
}
