package com.life.service;

/**
 * @Title: MsgSendService
 * @Description: 消息发送接口
 * @Author: yanglin
 * @Date: 2020年12月15日 14:12
 * @Copyright: 2020 All Rights Reserved.北京西天取经科技有限公司
 */
public interface MsgSendService {

    /**
     * 发送消息
     * @param msg
     * @return
     */
    Boolean send(Object msg);
}
