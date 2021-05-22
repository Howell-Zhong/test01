package com.jt99.myeasybuy.service.impl;


import com.jt99.myeasybuy.dao.OrderDetailMapper;
import com.jt99.myeasybuy.dao.OrderMapper;
import com.jt99.myeasybuy.dao.ProductMapper;
import com.jt99.myeasybuy.dao.ShoppingCartMapper;
import com.jt99.myeasybuy.entity.Order;
import com.jt99.myeasybuy.entity.OrderDetail;
import com.jt99.myeasybuy.entity.Product;
import com.jt99.myeasybuy.entity.ShoppingCart;
import com.jt99.myeasybuy.entity.vo.OrderVo;
import com.jt99.myeasybuy.query.OrderQuery;
import com.jt99.myeasybuy.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @ClassName: OrderServiceImpl
 * @Description: 订单实现类
 * @Author: 70886
 * @Date: 2021/5/10 15:09
 * @Version 1.0
 **/
@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    OrderMapper orderMapper;
    @Resource
    private OrderDetailMapper orderDetailMapper;
    @Resource
    private ShoppingCartMapper shoppingCartMapper;
    @Resource
    private ProductMapper productMapper;

    @Override
    public List<OrderVo> getOrderByPage(OrderQuery orderQuery) {
        return orderMapper.getOrderByPage(orderQuery);
    }

    @Override
    public int getOrderCount(OrderQuery orderQuery) {
        return orderMapper.getOrderCount(orderQuery);
    }

    @Override
    public void deleteOrder(Integer eoId) {
        orderMapper.deleteOrder(eoId);
    }

    @Override
    public void updateOrderStatus( Integer eoId, String eoStatus) {
        orderMapper.updateOrderStatus(eoId, eoStatus);
    }

    @Override
    public OrderVo getOrderById(Integer eoId) {
        return orderMapper.getOrderById(eoId);
    }

    //通过购物车增加订单
    @Override
    public void addOrder(Order order) {
        order.setEoOrderTime(new Date());
        order.setEoStatus("2");
        //获取购物车总金额
        List<ShoppingCart> list = shoppingCartMapper.getTotalPriceByEuId(order.getEuId());
        double sum = 0.00;
        for(ShoppingCart sc : list){
            sum += sc.getEscQuantity()*sc.getProduct().getEpPrice();
        }
        //设置订单总金额
        order.setEoCost(sum);
        //生成订单
        orderMapper.addOrder(order);

        int eoId = order.getEoId();
        //一个商品就一个商品购物车，生成一个订单详情
        for(ShoppingCart sc : list){
            OrderDetail orderDetail = new OrderDetail();
            orderDetail.setEpId(sc.getEpId());
            orderDetail.setEodQuantity(sc.getEscQuantity());
            orderDetail.setEoId(eoId);
            orderDetailMapper.addOrderDetail(orderDetail);
        }
    }

    //不通过购物车增加订单
    @Override
    public void addOrder2(Order order, OrderDetail orderDetail) {
        order.setEoOrderTime(new Date());
        order.setEoStatus("2");
        //获取商品价格
        Product product = productMapper.getProductById(orderDetail.getEpId());
        //计算顶端价格
        double totalPrice = orderDetail.getEodQuantity()*product.getEpPrice();
        order.setEoCost(totalPrice);
        //生成订单
        orderMapper.addOrder(order);

        //获得订单id
        int eoId = order.getEoId();
        orderDetail.setEoId(eoId);
        //生成订单详情
        orderDetailMapper.addOrderDetail(orderDetail);

    }
    //用户个人订单信息
    @Override
    public List<OrderVo> getOrderList(OrderQuery orderQuery) {
        return orderMapper.getOrderList(orderQuery);
    }

    @Override
    public int getOrderListCount(OrderQuery orderQuery) {
        return orderMapper.getOrderListCount(orderQuery);
    }


}
