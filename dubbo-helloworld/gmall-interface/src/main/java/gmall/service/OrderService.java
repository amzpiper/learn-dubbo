package gmall.service;

import gmall.bean.UserAddress;

import java.util.List;

/**
 * @author guoyh
 * @date 2021/7/5
 */
public interface OrderService {

    public List<UserAddress> initOrder(String userId);
}
