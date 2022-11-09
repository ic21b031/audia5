package com.example.audia5;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Audia5Controller {

    public int ps = 190;
    public String color = "Grün";

    @GetMapping("/moreowerbaby")
    public String tune(int a) {
        this.ps += a;
        return "Dein Audi A5 hat " + (a + ps);
    }

    @GetMapping("/color")
    public String changeColor(String c){
        this.color = c;
        return this.color;
    }

}
