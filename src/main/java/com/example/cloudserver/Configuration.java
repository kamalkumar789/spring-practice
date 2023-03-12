package com.example.cloudserver;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("data-use")
public class Configuration {


    private String username;

    public String getUsername(){
        return this.username;
    }
    public void setUsername(String v){
        this.username = v;
    }
}
