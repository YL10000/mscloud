package com.life.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Title: MybatisPlusConfig
 * @Description: mybatisplus配置类
 * @Author: yanglin
 * @Date: 2020年12月02日 11:14
 * @Copyright: 2020 All Rights Reserved.北京西天取经科技有限公司
 */
@Configuration
@MapperScan("com.life.dao")
public class MybatisPlusConfig {

    @Bean
    public PaginationInterceptor paginationInterceptor(){
        return new PaginationInterceptor();
    }
}
