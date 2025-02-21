package com.example.htmx;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class HtmxApplicationController {
    @GetMapping(value = "/th-index")
    public String index(Model model) {
        System.out.println("HtmxApplicationController.index");
        serverTimeFragment(model);
        return "th-index";
    }

    @GetMapping(value = "/serverTimeFragment")
    public String serverTimeFragment(Model model) {
        System.out.println("HtmxApplicationController.serverTimeFragment");
        model.addAttribute("serverTime", new SimpleDateFormat().format(new Date()));
        return "fragments/fragment.html :: #serverTimeFragment";
    }

    @GetMapping("/th-hx-index")
    public String index() {
        return "th-hx-index";
    }

    @PostMapping("/furtherInfo")
    public String furtherInfo() {
        return "furtherInfo";
    }
}
