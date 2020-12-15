package com.life;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Title: ConfigApp
 * @Description: 配置中心
 * @Author: yanglin
 * @Date: 2020年12月14日 15:21
 * @Copyright: 2020 All Rights Reserved.北京西天取经科技有限公司
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigApp {

    public static void main(String[] args) {
        SpringApplication.run(ConfigApp.class,args);
    }
}
