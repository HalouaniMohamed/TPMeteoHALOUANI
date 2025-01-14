package com.example.halouani_mohamed_tp3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class FormAController {

    @GetMapping("/address")
    public String showAddressPage() {
        return "address";
    }
}
