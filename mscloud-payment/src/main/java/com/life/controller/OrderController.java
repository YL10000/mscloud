package com.life.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.life.config.LifeConfig;
import com.life.entity.Order;
import com.life.service.OrderService;
import com.life.vo.ResultVO;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Order)表控制层
 *
 * @author makejava
 * @since 2020-12-02 11:34:41
 */
@RestController
@RequestMapping("/payment/order")
@RefreshScope
public class OrderController{
    /**
     * 服务对象
     */
    @Resource
    private OrderService orderService;

    @Resource
    private LifeConfig lifeConfig;

    /**
     * 查询所有数据
     *
     * @param order 查询实体
     * @return 所有数据
     */
    @GetMapping
    public ResultVO selectAll(Order order) {
        return ResultVO.ok(this.orderService.list(new QueryWrapper<>(order)));
    }

    @GetMapping("hi")
    public ResultVO hi(String username){
        return  ResultVO.ok(lifeConfig);
        //return  ResultVO.ok(this.orderService.hi(username));
    }

    @GetMapping("acc")
    public ResultVO acc(Integer a,Integer b){
        return  ResultVO.ok(this.orderService.acc(a,b));
    }

    /**
     * 分页查询所有数据
     *
     * @param order 查询实体
     * @return 所有数据
     */
    @GetMapping("page/{num}/{size}")
    public ResultVO page(@PathVariable("num") Integer num, @PathVariable("size") Integer size, Order order) {
        return ResultVO.ok(this.orderService.page(new Page(num, size), new QueryWrapper<>(order)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResultVO selectOne(@PathVariable Serializable id) {
        return ResultVO.ok(this.orderService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param order 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResultVO insert(@RequestBody Order order) {
        return ResultVO.ok(this.orderService.save(order));
    }

    /**
     * 修改数据
     *
     * @param order 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResultVO update(@RequestBody Order order) {
        return ResultVO.ok(this.orderService.updateById(order));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public ResultVO delete(@RequestParam("idList") List<Long> idList) {
        return ResultVO.ok(this.orderService.removeByIds(idList));
    }
}