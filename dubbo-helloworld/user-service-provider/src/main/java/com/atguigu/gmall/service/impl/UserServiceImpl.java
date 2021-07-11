package com.atguigu.gmall.service.impl;


import gmall.bean.UserAddress;
import gmall.service.UserService;

import java.util.Arrays;
import java.util.List;


/**
 * 1、将服务提供者将服务注册到注册中心（暴漏服务）
 * 1) 导入dubbo依赖
 * 2、让服务消费者去注册中心订阅服务的服务地址
 *
 * @author guoyh
 * @date 2021/7/5
 */
public class UserServiceImpl implements UserService {

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress userAddressOne = new UserAddress();
        userAddressOne.setUserAddress("北京市区昌平");
        UserAddress userAddressTwo = new UserAddress();
        userAddressTwo.setUserAddress("天安门");
        return Arrays.asList(userAddressOne, userAddressTwo);
    }
}
