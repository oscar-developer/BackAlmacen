package com.oscar.springboot.almacen.springboot_api.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class UserController {
    @GetMapping("/")
    public String details(Model model) {
        model.addAttribute("title", "Hola Mundo");
        model.addAttribute("name", "Oscar");
        model.addAttribute("lastname", "Clemente");

        return "details";
    }
}
