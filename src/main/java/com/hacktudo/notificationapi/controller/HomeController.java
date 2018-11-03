package com.globo.hugofonseca.controller;

import com.globo.hugofonseca.service.JwtAuthenticationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/v1/home","/home"})
public class HomeController {

    private JwtAuthenticationService jwtAuthenticationService;

    public HomeController(JwtAuthenticationService jwtAuthenticationService) {
        this.jwtAuthenticationService = jwtAuthenticationService;
    }

    @GetMapping
    public String home(Model model) {
        String token = jwtAuthenticationService.createToken();
        model.addAttribute("token", token);
        return "index";
    }

}
