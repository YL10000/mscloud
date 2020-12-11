package com.life;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Title: EurekaServerApp
 * @Description: eureka注册中心
 * @Author: yanglin
 * @Date: 2020年12月02日 17:55
 * @Copyright: 2020 All Rights Reserved.北京西天取经科技有限公司
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApp {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApp.class,args);
    }
}
