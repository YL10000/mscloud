package com.life;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Title: HystrixDashboardApp
 * @Description: hystrix 监控盘
 * @Author: yanglin
 * @Date: 2020年12月11日 20:18
 * @Copyright: 2020 All Rights Reserved.北京西天取经科技有限公司
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardApp {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashboardApp.class,args);
    }
}
