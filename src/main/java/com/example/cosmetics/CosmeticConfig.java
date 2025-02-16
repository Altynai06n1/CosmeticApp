package com.example.cosmetics;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CosmeticConfig {

    @Bean
    public Lipstick redLipstick() {
        Lipstick lipstick = new Lipstick();
        lipstick.setColor("Red");
        return lipstick;
    }

    @Bean
    public Lipstick pinkLipstick() {
        Lipstick lipstick = new Lipstick();
        lipstick.setColor("Violet");
        return lipstick;
    }

    @Bean
    public Skincare moisturizer() {
        Skincare skincare = new Skincare();
        skincare.setProductType("Moisturizer");
        return skincare;
    }

    @Bean
    public Skincare serum() {
        Skincare skincare = new Skincare();
        skincare.setProductType("Serum");
        return skincare;
    }
}
