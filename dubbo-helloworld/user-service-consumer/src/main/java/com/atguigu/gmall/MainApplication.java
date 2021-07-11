package com.atguigu.gmall;

import gmall.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"consumer.xml"});
        OrderService orderService = context.getBean(OrderService.class);
        orderService.initOrder("1");

        System.out.println("调用结束");
        System.in.read();
    }
}
