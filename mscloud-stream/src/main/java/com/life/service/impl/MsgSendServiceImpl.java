package com.life.service.impl;

/**
 * @Title: MsgSendServiceImpl
 * @Description: spring stream 发送消息实现类
 * @Author: yanglin
 * @Date: 2020年12月15日 14:20
 * @Copyright: 2020 All Rights Reserved.北京西天取经科技有限公司
 */

import com.life.service.MsgSendService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
@EnableBinding(Source.class)
@Slf4j
public class MsgSendServiceImpl implements MsgSendService {

    /**
     * 注入配置的发送消息的通道
     */
    @Resource
    private MessageChannel output;

    @Override
    public Boolean send(Object msg) {
        log.info("发送消息,{}",msg);
        return output.send(MessageBuilder.withPayload(msg).build());
    }
}
