package com.example.cosmetics;

import org.springframework.stereotype.Component;

@Component
public class Lipstick {
    private String color = "Red";

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
