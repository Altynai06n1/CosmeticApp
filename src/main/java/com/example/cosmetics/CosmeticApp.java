package com.example.cosmetics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CosmeticApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.example.cosmetics");

        Lipstick lipstick = context.getBean(Lipstick.class);
        Skincare skincare = context.getBean(Skincare.class);

        System.out.println("Lipstick Color: " + lipstick.getColor());
        System.out.println("Skincare Product: " + skincare.getProductType());
    }
}
