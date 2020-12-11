package com.life.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Title: ResultCode
 * @Description: 统一返回码
 * @Author: yanglin
 * @Date: 2020年12月02日 14:15
 * @Copyright: 2020 All Rights Reserved.北京西天取经科技有限公司
 */
@Getter
@AllArgsConstructor
public enum ResultCode {

    SUCCESS(200L,"成功"),

    FAILED(500L,"响应失败"),

    VALIDATE_FAILED(4001L,"参数校验失败"),
    ;
    private final Long code;

    private final String msg;
}
