package com.life.controller;

import com.life.service.MsgSendService;
import com.life.vo.ResultVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Title: MsgSendController
 * @Description: 发送消息controller
 * @Author: yanglin
 * @Date: 2020年12月15日 14:30
 * @Copyright: 2020 All Rights Reserved.北京西天取经科技有限公司
 */
@RestController
@RequestMapping(value ="/stream/send")
public class MsgSendController {

    @Resource
    private MsgSendService msgSendService;

    @GetMapping("{msg}")
    public ResultVO send(@PathVariable("msg") String msg){
        return ResultVO.ok(msgSendService.send(msg));
    }
}
