package com.life.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Title: FeignConfig
 * @Description: feign配置类
 * @Author: yanglin
 * @Date: 2020年12月10日 19:58
 * @Copyright: 2020 All Rights Reserved.北京西天取经科技有限公司
 */
@Configuration
public class FeignConfig {

    @Bean
    Logger.Level logLevel(){
        return Logger.Level.FULL;
    }
}
