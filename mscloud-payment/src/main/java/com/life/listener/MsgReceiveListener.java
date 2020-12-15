package com.life.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @Title: MsgReceiveListener
 * @Description: 接受消息
 * @Author: yanglin
 * @Date: 2020年12月15日 18:18
 * @Copyright: 2020 All Rights Reserved.北京西天取经科技有限公司
 */
@Component
@EnableBinding(Sink.class)
@Slf4j
public class MsgReceiveListener {

    @StreamListener(Sink.INPUT)
    public void receive(Message<Object> message){
        log.info("接受到消息：{}",message);
    }
}
