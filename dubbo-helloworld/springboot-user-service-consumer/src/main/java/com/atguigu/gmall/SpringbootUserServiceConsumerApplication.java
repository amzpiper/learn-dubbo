package com.atguigu.gmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

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
 * 3.使用暴漏服务注解
 *  @Reference
 *  注意引入包错误问题:import com.alibaba.dubbo.config.annotation.Reference;
 * @author 郭宇航
 */

@EnableDubbo
@SpringBootApplication
public class SpringbootUserServiceConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootUserServiceConsumerApplication.class, args);
    }

}
