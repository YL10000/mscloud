package com.life.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.life.entity.Order;

/**
 * (Order)表服务接口
 *
 * @author makejava
 * @since 2020-12-01 05:11:07
 */
public interface OrderService extends IService<Order> {

    public String hi(String username);

    String acc(Integer a,Integer b);

}