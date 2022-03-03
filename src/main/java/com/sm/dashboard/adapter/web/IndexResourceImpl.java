package com.sm.dashboard.adapter.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexResourceImpl {

    @GetMapping("/")
    public String index()   {
        return "index";
    }
}
