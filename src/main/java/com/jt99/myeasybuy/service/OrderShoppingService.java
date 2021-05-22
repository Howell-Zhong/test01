package com.jt99.myeasybuy.service;

import com.jt99.myeasybuy.entity.vo.OrderShoppingVo;
import com.jt99.myeasybuy.entity.vo.OrderVo;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface OrderShoppingService {



    public OrderShoppingVo getOrderShoppingMapper(Integer eodId);
}
