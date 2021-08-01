package com.atguigu.gmall;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * 1.导入依赖
 *  1).导入dobuuo-starter
 *          <dependency>
 *             <groupId>com.alibaba.boot</groupId>
 *             <artifactId>dubbo-spring-boot-starter</artifactId>
 *             <version>0.2.0</version>
 *         </dependency>
 *  2).导入dobuuo的其他依赖
 * 2.配置application.properties
 * 3.暴漏服务注解
 * @Service
 *
 * @author 郭宇航
 */

//开启基于注解的dubbo功能
@EnableDubbo
@SpringBootApplication
public class SpringBootUserServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootUserServiceProviderApplication.class, args);
    }

}
