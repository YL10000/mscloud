package com.life.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * (Order)表实体类
 *
 * @author makejava
 * @since 2020-12-01 05:11:04
 */
@EqualsAndHashCode(callSuper = true)
@Data
@SuppressWarnings("serial")
@TableName("t_order")
@AllArgsConstructor
@NoArgsConstructor
public class Order extends Model<Order> {

    /**
     * 主键
     */
    @TableId
    private String oid;

    /**
     * 账号ID
     */
    private String aid;

    /**
     * 下单时手机号
     */
    private String phone;
}