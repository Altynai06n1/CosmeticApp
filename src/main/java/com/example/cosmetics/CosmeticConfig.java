package com.example.cosmetics;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class CosmeticConfig {

    @Bean
    @Primary
    public Lipstick redLipstick() {
        Lipstick lipstick = new Lipstick();
        lipstick.setColor("Red");
        return lipstick;
    }

    @Bean
    public Lipstick pinkLipstick() {
        Lipstick lipstick = new Lipstick();
        lipstick.setColor("Pink");
        return lipstick;
    }

    @Bean
    @Primary
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