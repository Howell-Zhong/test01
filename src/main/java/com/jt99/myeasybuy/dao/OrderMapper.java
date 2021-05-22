package com.jt99.myeasybuy.dao;




import com.jt99.myeasybuy.entity.Order;
import com.jt99.myeasybuy.entity.vo.OrderVo;
import com.jt99.myeasybuy.query.OrderQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {

    // 分页查询订单
    List<OrderVo> getOrderByPage(OrderQuery orderQuery);

    // 查询订单数量
    int getOrderCount(OrderQuery orderQuery);

    // 删除订单
    void deleteOrder(Integer eoId);

    // 修改订单状态
    void updateOrderStatus(Integer eoId, String eoStatus);

    // 通过订单id查询订单信息
    OrderVo getOrderById(Integer eoId);

    //增
    public void addOrder(Order order);

    //用户个人订单信息
    List<OrderVo> getOrderList(OrderQuery orderQuery);
    int getOrderListCount(OrderQuery orderQuery);
}
