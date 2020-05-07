package com.nn.service;

import com.nn.pojo.Order;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName SubOrderServiceImpl
 * @Author nn
 * @Date 2020/5/7 17:05
 *  本地存根类
 */
public class SubOrderServiceImpl implements OrderService {

    private OrderService orderService;

    public SubOrderServiceImpl(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public List<Order> queryAllOrder(Integer userId) {
        try {
            System.out.println(" 本地存根 执行。。。。SubOrderServiceImpl");
            return orderService.queryAllOrder(userId);
        }catch (Exception e){
            System.out.println("远程服务异常.....");
            return Arrays.asList(new Order(0,"本地存根:远程服务异常",11));
        }
    }
}
