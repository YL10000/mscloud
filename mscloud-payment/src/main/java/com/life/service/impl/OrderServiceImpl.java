package com.life.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.life.dao.OrderDao;
import com.life.entity.Order;
import com.life.service.OrderService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * (Order)表服务实现类
 *
 * @author makejava
 * @since 2020-12-01 05:11:08
 */
@Slf4j
@Service("orderService")
// 配置默认的服务降级的方法
@DefaultProperties(defaultFallback = "defaultHandler")
public class OrderServiceImpl extends ServiceImpl<OrderDao, Order> implements OrderService {

    @Override
    //配置服务降级方法和条件
    @HystrixCommand(fallbackMethod = "hiHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000")
    })
    public String hi(String username) {
        try{Thread.sleep(3000);}catch (Exception e){e.printStackTrace();}
        return "hi "+username;
    }

    @Override
    @HystrixCommand //需要服务降级的方法
    public String acc(Integer a, Integer b) {
        return String.valueOf(a/b);
    }

    /**
     * 具体的服务降级的方法
     * @param username
     * @return
     */
    public String hiHandler(String username){
        log.info("hi fallback ...{username:{}}",username);
        return "hi fallbak:"+username;
    }

    /**
     * 默认的服务降级的方法
     * @return
     */
    public String defaultHandler(){
        log.info("defaultHandler ...}");
        return "defaultHandler";
    }
}