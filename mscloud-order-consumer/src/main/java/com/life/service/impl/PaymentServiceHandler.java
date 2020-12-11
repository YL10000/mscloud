package com.life.service.impl;

import com.life.constant.ResultCode;
import com.life.service.PaymentService;
import com.life.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @Title: PaymentServiceHandler
 * @Description: 支付service fallback 处理类
 * @Author: yanglin
 * @Date: 2020年12月10日 19:41
 * @Copyright: 2020 All Rights Reserved.北京西天取经科技有限公司
 */
@Slf4j
@Component
public class PaymentServiceHandler implements PaymentService {
    @Override
    public ResultVO order(Serializable id) {
        return ResultVO.fail(ResultCode.FAILED.getCode(),"获取订单失败,id:"+id);
    }

    @Override
    public ResultVO hi(String username) {
        return ResultVO.fail(ResultCode.FAILED.getCode(),"获取订单失败,username:"+username);
    }

    @Override
    public ResultVO acc(Integer a, Integer b) {
        return ResultVO.fail(ResultCode.FAILED.getCode(),"计算失败,"+a+"/"+b);
    }
}
