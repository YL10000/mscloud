package com.life.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Title: GatewayConfig
 * @Description: gateway配置
 * @Author: yanglin
 * @Date: 2020年12月14日 14:15
 * @Copyright: 2020 All Rights Reserved.北京西天取经科技有限公司
 */
@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder){
        RouteLocatorBuilder.Builder routes = builder.routes();
        routes.route("baidu-route",r->r.path("life/**").uri("http://www.baidu.com"));
        return routes.build();
    }
}
