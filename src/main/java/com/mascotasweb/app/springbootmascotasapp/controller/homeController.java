package com.mascotasweb.app.springbootmascotasapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {

    @GetMapping({"/","/login"})
    public String index (){

        return "index";
    }

    @GetMapping("/inicio")
    public String inicio (){

        return "inicio";
    }

}
