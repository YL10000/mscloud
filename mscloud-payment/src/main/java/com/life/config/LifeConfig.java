package com.life.config;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @Title: LifeConfig
 * @Description: life配置信息
 * @Author: yanglin
 * @Date: 2020年12月14日 17:12
 * @Copyright: 2020 All Rights Reserved.北京西天取经科技有限公司
 */
@Component
@Data
@ConfigurationProperties(prefix = "life")

public class LifeConfig implements Serializable {

    private String name;

    private Integer age;

    private String label;

    private String version;

    private String profile;

}
