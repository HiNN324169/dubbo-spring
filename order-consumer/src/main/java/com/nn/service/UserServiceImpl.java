package com.nn.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.nn.pojo.Order;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName ConsumerService
 * @Author nn
 * @Date 2020/5/5 13:38
 */

@Service
public class UserServiceImpl {

    @Reference(timeout = 5000)
    private OrderService orderService;

//    public void setOrderService(OrderService orderService) {
//        this.orderService = orderService;
//    }


    public void queryOrderById(Integer userId) {
        List<Order> orders = orderService.queryAllOrder(userId);
        for (Order order : orders) {
            System.out.println(order.getId() + "  " + order.getOrderNu() + "  " + order.getUserId());
        }
    }
}
