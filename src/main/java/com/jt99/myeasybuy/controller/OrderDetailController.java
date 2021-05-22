package com.jt99.myeasybuy.controller;


import com.jt99.myeasybuy.entity.OrderDetail;
import com.jt99.myeasybuy.entity.vo.OrderDetailVo;
import com.jt99.myeasybuy.query.OrderDetailQuery;
import com.jt99.myeasybuy.service.OrderDetailService;
import com.jt99.myeasybuy.util.ResponseResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: OrderDetailController
 * @Description: 订单详情启动类
 * @Author: 70886
 * @Date: 2021/5/11 14:40
 * @Version 1.0
 **/
@CrossOrigin(value = "*", maxAge = 3600)
@RestController
@RequestMapping("/orderDetail")
public class OrderDetailController {
    @Resource
    OrderDetailService orderDetailService;

    @RequestMapping("/getOrderDetail")
    public ResponseResult<List<OrderDetailVo>> getOrderDetail(Integer eoId){
        List<OrderDetailVo> orderDetailVo = orderDetailService.getOrderDetail(eoId);
        return ResponseResult.createSuccess(orderDetailVo);
    }

    //统计所有数据的数量
    @RequestMapping("/getOrderDetailCount")
    public ResponseResult<Integer> getOrderDetailCount(OrderDetailQuery orderDetailQuery) {
        return ResponseResult.createSuccess(orderDetailService.getOrderDetailCount(orderDetailQuery));
    }

    //分页查，与连表分页查的区别就在于实体类有没有引用类型属性
    @RequestMapping("/getOrderDetailListBy")
    public ResponseResult<List<OrderDetail>> getOrderDetailListBy(OrderDetailQuery orderDetailQuery) {
        return ResponseResult.createSuccess(orderDetailService.getOrderDetailListBy(orderDetailQuery));
    }

    //连表分页查
    @RequestMapping("/getOrderDetailInnerListBy")
    public ResponseResult<List<OrderDetail>> getOrderDetailInnerListBy(OrderDetailQuery orderDetailQuery) {
        return ResponseResult.createSuccess(orderDetailService.getOrderDetailInnerListBy(orderDetailQuery));
    }

    //查所有
    @RequestMapping("/getOrderDetailList")
    public ResponseResult<List<OrderDetail>> getOrderDetailList() {
        return ResponseResult.createSuccess(orderDetailService.getOrderDetailList());
    }

    //增
    @RequestMapping("/addOrderDetail")
    public ResponseResult addOrderDetail(OrderDetail orderDetail) {
        orderDetailService.addOrderDetail(orderDetail);
        return ResponseResult.createSuccess("操作成功");
    }

    //删
    @RequestMapping("/deleteOrderDetailById")
    public ResponseResult deleteOrderDetailById(Integer id) {
        orderDetailService.deleteOrderDetailById(id);
        return ResponseResult.createSuccess("操作成功");
    }

    //改
    @RequestMapping("/updateOrderDetail")
    public ResponseResult updateOrderDetail(OrderDetail orderDetail) {

        orderDetailService.updateOrderDetail(orderDetail);
        return ResponseResult.createSuccess("操作成功");
    }

    //查单个
    @RequestMapping("/getOrderDetailById")
    public ResponseResult<OrderDetail> getOrderDetailById(Integer id) {
        return ResponseResult.createSuccess(orderDetailService.getOrderDetailById(id));
    }

    //删多个
    @RequestMapping("/deleteOrderDetailsByIds")
    public ResponseResult deleteOrderDetailsByIds(Integer[] ids) {
        orderDetailService.deleteOrderDetailsByIds(ids);
        return ResponseResult.createSuccess("操作成功");
    }


}
