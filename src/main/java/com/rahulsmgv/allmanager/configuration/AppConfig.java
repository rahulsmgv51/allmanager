package com.rahulsmgv.allmanager.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.rahulsmgv.allmanager.DB;
import com.rahulsmgv.allmanager.DevDB;
import com.rahulsmgv.allmanager.ProdDB;

@Configuration
public class AppConfig {
    @Bean
    @ConditionalOnProperty(name = "project.mode", havingValue = "development")
    public DB getUATDataBean(){
        return new DevDB();
    }

    @Bean
    @ConditionalOnProperty(name = "project.mode", havingValue = "production")
    public DB getProdDataBean(){
        return new ProdDB();
    }
}