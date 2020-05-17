package com.zuojie.chip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2 //启用Swagger
public class CardConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CardConsumerApplication.class,args);
    }
}
