package com.jt99.myeasybuy.dao;

import com.jt99.myeasybuy.entity.vo.OrderShoppingVo;
import com.jt99.myeasybuy.entity.vo.OrderVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderShoppingMapper {
    public OrderShoppingVo getOrderShoppingMapper(Integer eodId);
}

