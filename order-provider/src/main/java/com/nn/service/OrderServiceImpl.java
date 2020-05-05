package com.nn.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.nn.pojo.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName OrderServiceImpl
 * @Author nn
 * @Date 2020/5/5 13:25
 */

@Service
public class OrderServiceImpl implements OrderService {

    private static List<Order> orderList = new ArrayList<>();

    static {
        orderList.add(new Order(1,"99999999999",1));
        orderList.add(new Order(2,"66666666666",1));
        orderList.add(new Order(3,"33333333333",1));
    }

    @Override
    public List<Order> queryAllOrder(Integer userId) {
        return orderList;
    }
}
