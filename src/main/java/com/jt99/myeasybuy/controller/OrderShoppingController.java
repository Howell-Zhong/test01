package com.jt99.myeasybuy.controller;

import com.jt99.myeasybuy.entity.vo.OrderShoppingVo;
import com.jt99.myeasybuy.entity.vo.OrderVo;
import com.jt99.myeasybuy.service.OrderShoppingService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin(value = "*", maxAge = 3600)
@RestController
@RequestMapping("/shopping")
public class OrderShoppingController {
    @Resource
    OrderShoppingService orderShoppingService;

    @RequestMapping("getShopping")
    public OrderShoppingVo getShopping(Integer eodId){
     return    orderShoppingService.getOrderShoppingMapper(eodId);
    }
}
