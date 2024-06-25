package com.alex.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

public class SwaggerConfig implements WebMvcConfigurer {

    @Configuration
    public class Knife4jConfiguration {

        @Bean
        public Docket docket() {
            ApiInfo apiInfo = new ApiInfoBuilder()
                    .title("测试项目接口文档")
                    .version("2.0")
                    .description("测试项目接口文档")
                    .build();
            Docket docket = new Docket(DocumentationType.SWAGGER_2)
                    .apiInfo(apiInfo)
                    .select()
                    .apis(RequestHandlerSelectors.basePackage("com.alex.demo.controller"))
                    .paths(PathSelectors.any())
                    .build();
            return docket;
        }
    }

}