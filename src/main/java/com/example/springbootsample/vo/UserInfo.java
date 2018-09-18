package com.example.springbootsample.vo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:userinfo.properties")
@ConfigurationProperties(prefix = "userinfo")
@Getter
@Setter
public class UserInfo {
    private Integer id;

    private String name;
}
