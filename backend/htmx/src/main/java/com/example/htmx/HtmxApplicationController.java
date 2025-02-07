package com.example.htmx;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class HtmxApplicationController {
    @GetMapping(value = "/index")
    public String index(Model model) {
        model.addAttribute("serverTime", new SimpleDateFormat().format(new Date()));
        return "index";
    }
}
