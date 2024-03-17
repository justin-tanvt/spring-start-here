package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping("/home/{colorInPath}")
    public String home(
            @PathVariable String colorInPath,
            Model page) {
        page.addAttribute("nameAttr", "Katy");
        page.addAttribute("colorAttr", colorInPath);
        return "home.html";
    }
}
