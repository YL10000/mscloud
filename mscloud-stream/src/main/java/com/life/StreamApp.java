package com.life;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Title: StreamApp
 * @Description: spring stream 发送消息
 * @Author: yanglin
 * @Date: 2020年12月15日 14:06
 * @Copyright: 2020 All Rights Reserved.北京西天取经科技有限公司
 */
@SpringBootApplication
@EnableDiscoveryClient
public class StreamApp {
    public static void main(String[] args) {
        SpringApplication.run(StreamApp.class,args);
    }
}
