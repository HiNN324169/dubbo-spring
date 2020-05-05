package com.nn.service;

import com.nn.pojo.Order;

import java.util.List;

/**
 * @ClassName OrderService
 * @Author nn
 * @Date 2020/5/5 13:17
 */
public interface OrderService {

    public List<Order> queryAllOrder(Integer userId);
}
