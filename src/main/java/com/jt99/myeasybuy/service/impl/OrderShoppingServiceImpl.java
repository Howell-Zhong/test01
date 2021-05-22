package com.jt99.myeasybuy.service.impl;

import com.jt99.myeasybuy.dao.OrderShoppingMapper;
import com.jt99.myeasybuy.entity.vo.OrderShoppingVo;
import com.jt99.myeasybuy.entity.vo.OrderVo;
import com.jt99.myeasybuy.service.OrderShoppingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrderShoppingServiceImpl implements OrderShoppingService {
    @Resource
    OrderShoppingMapper orderShoppingMapper;


    public OrderShoppingVo getOrderShoppingMapper(Integer eodId) {

        return orderShoppingMapper.getOrderShoppingMapper(eodId);
    }

}
