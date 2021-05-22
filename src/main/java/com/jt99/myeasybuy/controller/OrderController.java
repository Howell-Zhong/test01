package com.jt99.myeasybuy.controller;


import com.jt99.myeasybuy.entity.Order;
import com.jt99.myeasybuy.entity.OrderDetail;
import com.jt99.myeasybuy.entity.Product;
import com.jt99.myeasybuy.entity.vo.OrderVo;
import com.jt99.myeasybuy.query.OrderQuery;
import com.jt99.myeasybuy.service.OrderDetailService;
import com.jt99.myeasybuy.service.OrderService;
import com.jt99.myeasybuy.service.ProductService;
import com.jt99.myeasybuy.util.Page;
import com.jt99.myeasybuy.util.ResponseResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: OrderController
 * @Description: 订单启动类
 * @Author: 70886
 * @Date: 2021/5/10 15:10
 * @Version 1.0
 **/
@CrossOrigin(value = "*", maxAge = 3600)
@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    OrderService orderService;

    @RequestMapping("/getOrderByPage")
    public ResponseResult<Page<OrderVo>> getOrderByPage(OrderQuery orderQuery){
        int totalCount = orderService.getOrderCount(orderQuery);
        List<OrderVo> orders = orderService.getOrderByPage(orderQuery);
        Page<OrderVo> page = new Page<OrderVo>();
        page.setTotalCount(totalCount);
        page.setList(orders);
        page.setPageSize(orderQuery.getPageSize());
        page.setPageNo(orderQuery.getPageNo());
        return ResponseResult.createSuccess(page);
    }

    @RequestMapping("/deleteOrder")
    public ResponseResult deleteOrder(Integer eoId){
        orderService.deleteOrder(eoId);
        return ResponseResult.createSuccess("ok");
    }

    @RequestMapping("/updateOrderStatus")
    public ResponseResult updateOrderStatus(Integer eoId, String eoStatus){
        orderService.updateOrderStatus(eoId, eoStatus);
        return ResponseResult.createSuccess("ok");
    }

    @RequestMapping("/getOrderById")
    public ResponseResult<OrderVo> getOrderById(Integer eoId){
        OrderVo orderVo = orderService.getOrderById(eoId);
        return ResponseResult.createSuccess(orderVo);
    }

    //通过购物车增加订单
    @RequestMapping("/addOrder")
    public ResponseResult addOrder(Order order) {
        orderService.addOrder(order);
        return ResponseResult.createSuccess("操作成功");
    }

    //不通过购物车增加订单
    @RequestMapping("/addOrder2")
    public ResponseResult addOrder2(Order order, OrderDetail orderDetail) {
        //添加订单
        orderService.addOrder2(order,orderDetail);
        return ResponseResult.createSuccess("操作成功");
    }
    @RequestMapping("/getOrderList")
    public ResponseResult<Page<OrderVo>> getOrderList(OrderQuery orderQuery){
        int totalCount2 = orderService.getOrderListCount(orderQuery);
        List<OrderVo> orders = orderService.getOrderList(orderQuery);
        Page<OrderVo> pages = new Page<OrderVo>();
        pages.setTotalCount(totalCount2);
        pages.setList(orders);
        pages.setPageSize(orderQuery.getPageSize());
        pages.setPageNo(orderQuery.getPageNo());
        return ResponseResult.createSuccess(pages);
    }
}
