package com.atguigu.gmall;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"provider.xml"});
        context.start();

        //为了不让服务终止，在这阻塞读取一个字符
        System.in.read(); // 按任意键退出
    }
}
