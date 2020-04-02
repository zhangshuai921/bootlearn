package com.boot.redis.config;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import com.google.common.collect.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.SecurityScheme;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @program: springboot-demo
 * @description:
 * @author: zhangshuai
 * @create: 2020-03-27 13:31
 **/
@Configuration
@EnableSwagger2
@EnableSwaggerBootstrapUI
public class SwaggerConfiguration {

    @Bean
    public Docket buildDocket() {

        Docket docket=new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(buildApiInf())
                .groupName("redis")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.boot.redis.controller"))
                //.apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any()).build();
        return docket;
    }


    private ApiInfo buildApiInf() {

        return new ApiInfoBuilder()
                .title("Redis Docs")//文档标题
                .description("redis测试文档")//文档描述
                .contact("")//联系人
                .version("1.0")//版本号
                //.license("")//更新此API的许可证信息
                //.licenseUrl("")//更新此API的许可证Url
                //.termsOfServiceUrl("")//更新服务条款URL
                .build();

    }
}