package com.atguigu.gmall;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1.导入dobuuo-starter
 * 2.导入dobuuo的其他依赖
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
