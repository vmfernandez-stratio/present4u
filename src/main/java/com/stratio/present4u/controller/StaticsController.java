package com.stratio.present4u.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import springfox.documentation.annotations.ApiIgnore;


@Controller
public class StaticsController {

    @GetMapping("/swagger")
    @ApiIgnore
    public String home() {
        return "redirect:swagger-ui.html";
    }

}
