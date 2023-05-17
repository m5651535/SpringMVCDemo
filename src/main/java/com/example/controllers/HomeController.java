package com.example.controllers;

import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    private OpenAPI openAPI;

    HomeController(OpenAPI openAPI){
        this.openAPI = openAPI;
    }

    @RequestMapping("/test")
    @ResponseBody
    public String home() {

        return "version : " + openAPI.getInfo().getVersion();
    }
}
