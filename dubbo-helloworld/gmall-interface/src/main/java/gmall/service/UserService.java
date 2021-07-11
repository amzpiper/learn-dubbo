package gmall.service;

import gmall.bean.UserAddress;

import java.util.List;

/**
 * @date 2021/7/5
 * @author guoyh
 */
public interface UserService {

    /**
     * 按照用户id返回所有收货地址
     * @param userId
     * @return List<UserAddress>
     */
    public List<UserAddress> getUserAddressList(String userId);

}
