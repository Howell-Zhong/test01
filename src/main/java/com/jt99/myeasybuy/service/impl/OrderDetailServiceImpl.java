package com.jt99.myeasybuy.service.impl;


import com.jt99.myeasybuy.dao.OrderDetailMapper;
import com.jt99.myeasybuy.entity.OrderDetail;
import com.jt99.myeasybuy.entity.vo.OrderDetailVo;
import com.jt99.myeasybuy.query.OrderDetailQuery;
import com.jt99.myeasybuy.service.OrderDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * @ClassName: OrderDetailServiceImpl
 * @Description: 订单详情实现类
 * @Author: 70886
 * @Date: 2021/5/11 14:39
 * @Version 1.0
 **/
@Service
public class OrderDetailServiceImpl implements OrderDetailService {

    @Resource
    OrderDetailMapper orderDetailMapper;

    @Override
    public List<OrderDetailVo> getOrderDetail(Integer eoId) {
        return orderDetailMapper.getOrderDetail(eoId);
    }

    //统计所有数据的数量
    @Override
    public int getOrderDetailCount(OrderDetailQuery orderDetailQuery) {
        return orderDetailMapper.getOrderDetailCount(orderDetailQuery);
    }

    //分页查，与连表分页查的区别就在于实体类有没有引用类型属性
    @Override
    public List<OrderDetail> getOrderDetailListBy(OrderDetailQuery orderDetailQuery) {
        return orderDetailMapper.getOrderDetailListBy(orderDetailQuery);
    }

    //连表分页查
    @Override
    public List<OrderDetail> getOrderDetailInnerListBy(OrderDetailQuery orderDetailQuery) {
        return orderDetailMapper.getOrderDetailInnerListBy(orderDetailQuery);
    }

    //查所有
    @Override
    public List<OrderDetail> getOrderDetailList() {
        return orderDetailMapper.getOrderDetailList();
    }

    //增
    @Override
    public void addOrderDetail(OrderDetail orderDetail) {
        orderDetailMapper.addOrderDetail(orderDetail);
    }

    //删
    @Override
    public void deleteOrderDetailById(Integer id) {
        orderDetailMapper.deleteOrderDetailById(id);
    }

    //改
    @Override
    public void updateOrderDetail(OrderDetail orderDetail) {
        orderDetailMapper.updateOrderDetail(orderDetail);
    }

    //查单个
    @Override
    public OrderDetail getOrderDetailById(Integer id) {
        return orderDetailMapper.getOrderDetailById(id);
    }

    //删多个
    @Override
    public void deleteOrderDetailsByIds(Integer[] ids) {
        orderDetailMapper.deleteOrderDetailsByIds(ids);
    }
}
