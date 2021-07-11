package com.atguigu.gmall.controller;

import gmall.bean.UserAddress;
import gmall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class OrderController {

    @Autowired
    OrderService orderService;

    @ResponseBody
    @RequestMapping("/initOrder")
    public List<UserAddress> initOrder() {
        List<UserAddress> userAddresses = orderService.initOrder("1");
        return userAddresses;
    }
}
