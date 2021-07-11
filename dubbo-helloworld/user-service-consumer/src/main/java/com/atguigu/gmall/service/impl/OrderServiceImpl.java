package com.atguigu.gmall.service.impl;

import gmall.bean.UserAddress;
import gmall.service.OrderService;
import gmall.service.UserService;

import java.util.List;

/**
 * @date 2021/7/5
 * @author guoyh
 */
public class OrderServiceImpl implements OrderService {

    UserService userService;

    @Override
    public void initOrder(String userId) {
        // 1、查询用户收获地址
        List<UserAddress> userAddressList = userService.getUserAddressList(userId);
        System.out.println(userAddressList);

    }
}
