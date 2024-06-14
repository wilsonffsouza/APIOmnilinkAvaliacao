/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.omnilink.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 *
 * @author leonardo.costa
 */
@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
    
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/**");
    }
    
}
