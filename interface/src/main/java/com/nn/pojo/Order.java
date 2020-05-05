package com.nn.pojo;

import java.io.Serializable;

/**
 * @ClassName Order
 * @Author nn
 * @Date 2020/5/5 13:18
 */

public class Order implements Serializable {
    private Integer id;
    private String orderNu;
    private Integer userId;

    public Order() {
    }

    public Order(Integer id, String orderNu, Integer userId) {
        this.id = id;
        this.orderNu = orderNu;
        this.userId = userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNu() {
        return orderNu;
    }

    public void setOrderNu(String orderNu) {
        this.orderNu = orderNu;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
