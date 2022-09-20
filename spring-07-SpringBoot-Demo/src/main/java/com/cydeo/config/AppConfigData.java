package com.cydeo.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class AppConfigData {
    @Value("${username}")
    private String userName;
    @Value("${password}")
    private String password;
    @Value("www.cydeo.com")//("${url}")
    private String url;
}
