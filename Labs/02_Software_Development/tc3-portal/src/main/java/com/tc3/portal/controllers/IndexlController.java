package com.tc3.portal.controllers;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexlController {

    @GetMapping("/")
    public String home(Model model) {

        // Figure out the current time in Jamaica and set the landing page message accordingly.

        ZoneId jamaicaZoneId = ZoneId.of("America/Jamaica");
        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime nowInJamaica = now.atZone(jamaicaZoneId);

        String message = null;

        if (nowInJamaica.getHour() < 12) {

            message = "Good morning";

        } else if (nowInJamaica.getHour() < 17) {

            message = "Good afternoon";

        } else {

            message = "Good evening";
        }

        model.addAttribute("greeting", message);
        return "index";
    }

    @GetMapping("/index")
    public String index(Model model) {

        return home(model);
    }
}
