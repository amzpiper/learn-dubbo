package com.atguigu.gmall.service.impl;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.service.UserService;

import java.util.Arrays;
import java.util.List;


/**
 * @date 2021/7/5
 * @author guoyh
 */
public class UserServiceImpl implements UserService {

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress userAddressOne = new UserAddress();
        UserAddress userAddressTwo = new UserAddress();

        return Arrays.asList(userAddressOne, userAddressTwo);
    }
}
