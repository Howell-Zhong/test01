package com.jt99.myeasybuy.service;



import com.jt99.myeasybuy.entity.Order;
import com.jt99.myeasybuy.entity.OrderDetail;
import com.jt99.myeasybuy.entity.vo.OrderVo;
import com.jt99.myeasybuy.query.OrderQuery;

import java.util.List;

public interface OrderService {

    // 分页查询订单
    List<OrderVo> getOrderByPage(OrderQuery orderQuery);

    int getOrderCount(OrderQuery orderQuery);


    // 删除订单
    void deleteOrder(Integer eoId);

    // 修改订单状态
    void updateOrderStatus(Integer eoId, String eoStatus);

    // 通过订单id查询订单信息
    OrderVo getOrderById(Integer eoId);

    //增
    public void addOrder(Order order);

    public void addOrder2(Order order, OrderDetail orderDetail);
    //用户个人订单信息
    List<OrderVo> getOrderList(OrderQuery orderQuery);
    int getOrderListCount(OrderQuery orderQuery);
}
