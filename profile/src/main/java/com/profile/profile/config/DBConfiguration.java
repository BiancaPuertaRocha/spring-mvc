package com.profile.profile.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
public class DBConfiguration {
    private String driverClassName;
    private String url;
    private String username;
    private String password;

    @Profile("dev")
    @Bean
    public String testDatabaseConection(){
        System.out.println("db connection dev");
        System.out.println(driverClassName);
        System.out.println(url);
        return "h2";
    }

    @Profile("prod")
    @Bean
    public String productionDatabaseConection(){
        System.out.println("db connection prod");
        System.out.println(driverClassName);
        System.out.println(url);
        return "mysql";
    }




}
