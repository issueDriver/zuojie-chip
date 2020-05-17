package com.zuojie.chip;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zuojie.chip.dao") //扫描持久层
@EnableDubbo //扫描要发布的服务
public class CardProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(CardProviderApplication.class,args);
    }

}
