package com.life.service;

/**
 * @Title: PaymentService
 * @Description: 支付service
 * @Author: yanglin
 * @Date: 2020年12月10日 17:53
 * @Copyright: 2020 All Rights Reserved.北京西天取经科技有限公司
 */

import com.life.service.impl.PaymentServiceHandler;
import com.life.vo.ResultVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.Serializable;

@Component
@FeignClient(value = "mscloud-payment",fallback = PaymentServiceHandler.class)
public interface PaymentService {

    @GetMapping("order/{id}")
    ResultVO order(@PathVariable Serializable id);

    @GetMapping("order/hi")
    ResultVO hi(@RequestParam("username") String username);

    @GetMapping("order/acc")
    ResultVO acc(@RequestParam("a") Integer a,@RequestParam("b") Integer b);
}
