package com.example.cosmetics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CosmeticApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CosmeticConfig.class);

        Lipstick redLipstick = context.getBean("redLipstick", Lipstick.class);
        Lipstick pinkLipstick = context.getBean("pinkLipstick", Lipstick.class);

        Skincare moisturizer = context.getBean("moisturizer", Skincare.class);
        Skincare serum = context.getBean("serum", Skincare.class);

        System.out.println("First Lipstick Color: " + redLipstick.getColor());
        System.out.println("Second Lipstick Color: " + pinkLipstick.getColor());
        System.out.println("First Skincare Product: " + moisturizer.getProductType());
        System.out.println("Second Product: " + serum.getProductType());
    }
}
