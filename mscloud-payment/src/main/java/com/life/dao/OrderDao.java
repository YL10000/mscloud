package com.life.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.life.entity.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * (Order)表数据库访问层
 *
 * @author makejava
 * @since 2020-12-01 05:16:37
 */
@Mapper
public interface OrderDao extends BaseMapper<Order> {

}