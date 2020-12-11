package com.life.controller;

import com.life.service.PaymentService;
import com.life.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Title: OrderConsumerController
 * @Description: 订单消费者controller
 * @Author: yanglin
 * @Date: 2020年12月02日 13:43
 * @Copyright: 2020 All Rights Reserved.北京西天取经科技有限公司
 */
@RestController
@RequestMapping("consumer/order")
@Slf4j
public class OrderConsumerController{

    @Resource
    private RestTemplate restTemplate;

    @Resource
    private DiscoveryClient discoveryClient;

    @Resource
    private PaymentService paymentService;

    @GetMapping("{oid}")
    public ResultVO order(@PathVariable("oid") String oid){
        //zookeeper作为注册中心时，服务名称必须使用小写
        //return restTemplate.getForObject("http://mscloud-payment/order/"+oid,ResultVO.class);
        return  paymentService.order(oid);
    }

    @GetMapping("hi")
    public ResultVO hi(String username){
        return  paymentService.hi(username);
    }

    @GetMapping("acc")
    public ResultVO acc(Integer a,Integer b){
        return  paymentService.acc(a,b);
    }


    @GetMapping
    public ResultVO list(){
        List<String> services = discoveryClient.getServices();
        services.forEach(s -> {
            log.info("服务名称:{}",s);
            List<ServiceInstance> instances = discoveryClient.getInstances(s);
            instances.forEach(i->{
                log.info("----实例名称：{}",i.getInstanceId());
            });

        });
        return ResultVO.ok();
    }
}
