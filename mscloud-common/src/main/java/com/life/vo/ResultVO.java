package com.life.vo;

import com.life.constant.ResultCode;
import lombok.*;

import java.io.Serializable;

/**
 * @Title: Result
 * @Description: 通用返回值对象
 * @Author: yanglin
 * @Date: 2020年12月02日 14:03
 * @Copyright: 2020 All Rights Reserved.北京西天取经科技有限公司
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultVO<T> implements Serializable {

    private Long code;
    private String msg;
    private T data;

    public ResultVO(Long code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static  <T> ResultVO<T> ok(){
        return ok(null);
    }

    public static  <T> ResultVO<T> ok(T data){
        return new ResultVO<T>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(), data);
    }

    public static  <T> ResultVO<T> fail(Long code,String msg){
        return new ResultVO<>(code,msg);
    }

}
