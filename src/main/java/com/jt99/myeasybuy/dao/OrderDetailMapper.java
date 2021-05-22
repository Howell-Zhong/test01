package com.jt99.myeasybuy.dao;



import com.jt99.myeasybuy.entity.OrderDetail;
import com.jt99.myeasybuy.entity.vo.OrderDetailVo;
import com.jt99.myeasybuy.query.OrderDetailQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderDetailMapper {

    // 通过订单号查询订单详情
    List<OrderDetailVo> getOrderDetail(Integer eoId);

    //统计所有数据的数量
    public int getOrderDetailCount(OrderDetailQuery orderDetailQuery);

    //分页查，与连表分页查的区别就在于实体类有没有引用类型属性
    public List<OrderDetail> getOrderDetailListBy(OrderDetailQuery orderDetailQuery);

    //连表分页查
    public List<OrderDetail> getOrderDetailInnerListBy(OrderDetailQuery orderDetailQuery);

    //查所有
    public List<OrderDetail> getOrderDetailList();

    //增
    public void addOrderDetail(OrderDetail orderDetail);

    //删
    public void deleteOrderDetailById(Integer id);

    //改
    public void updateOrderDetail(OrderDetail orderDetail);

    //查单个
    public OrderDetail getOrderDetailById(Integer id);

    //删多个
    public void deleteOrderDetailsByIds(Integer[] ids);
}
