package com.zuojie.chip.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
@Configuration //配置文件
public class SwaggerConfig {
    /**
     * 创建文档说明
     * @return
     */
    public ApiInfo createAI(){
        ApiInfo apiInfo=new ApiInfoBuilder().title("SpringBoot+Dubbo实现的项目").
                description("基于Dubbo实现的二维码名片的一套后端接口").
                contact(new Contact("左杰","http://www.17feri.top","xingfei_work@163.com")).build();
        return apiInfo;
    }

    /**
     * 创建Swagger扫描信息
     * @return
     */
    @Bean
    public Docket createD(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(createAI()).select().
                apis(RequestHandlerSelectors.basePackage
                        ("com.zuojie.chip.controller")).build();
    }
}
