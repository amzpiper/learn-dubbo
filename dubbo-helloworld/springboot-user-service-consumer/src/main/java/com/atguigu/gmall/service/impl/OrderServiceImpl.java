package com.atguigu.gmall.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import gmall.bean.UserAddress;

import gmall.service.OrderService;
import gmall.service.UserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author guoyh
 * @date 2021/7/5
 */
@Service
@Component
public class OrderServiceImpl implements OrderService {

    //dubbo提供注解自动从注册中心来发现
    @Reference
    UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {
        System.out.println("用户id:" + userId);
        // 1、查询用户收获地址
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        return userAddressList;
    }
}
