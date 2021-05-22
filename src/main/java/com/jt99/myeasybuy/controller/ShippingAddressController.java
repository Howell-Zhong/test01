package com.jt99.myeasybuy.controller;

import com.jt99.myeasybuy.entity.ShippingAddress;
import com.jt99.myeasybuy.query.ShippingAddressQuery;
import com.jt99.myeasybuy.service.ShippingAddressService;
import com.jt99.myeasybuy.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
@RequestMapping("/shippingAddress")
public class ShippingAddressController {
    @Autowired
    private ShippingAddressService shippingAddressService;

    //统计所有数据的数量
    @RequestMapping("/getShippingAddressCount")
    public ResponseResult<Integer> getShippingAddressCount(ShippingAddressQuery shippingAddressQuery) {
        return ResponseResult.createSuccess(shippingAddressService.getShippingAddressCount(shippingAddressQuery));
    }

    //分页查
    @RequestMapping("/getShippingAddressListBy")
    public ResponseResult<List<ShippingAddress>> getShippingAddressListBy(ShippingAddressQuery shippingAddressQuery) {
        return ResponseResult.createSuccess(shippingAddressService.getShippingAddressListBy(shippingAddressQuery));
    }

    //连表分页查
    @RequestMapping("/getShippingAddressInnerListBy")
    public ResponseResult<List<ShippingAddress>> getShippingAddressInnerListBy(ShippingAddressQuery shippingAddressQuery) {
        return ResponseResult.createSuccess(shippingAddressService.getShippingAddressInnerListBy(shippingAddressQuery));
    }

    //查所有
    @RequestMapping("/getShippingAddressList")
    public ResponseResult<List<ShippingAddress>> getShippingAddressList() {
        return ResponseResult.createSuccess(shippingAddressService.getShippingAddressList());
    }

    //增
    @RequestMapping("/addShippingAddress")
    public ResponseResult addShippingAddress(ShippingAddress shippingAddress) {
        System.out.println(shippingAddress);
        shippingAddressService.addShippingAddress(shippingAddress);
        return ResponseResult.createSuccess("操作成功");
    }

    //删
    @RequestMapping("/deleteShippingAddressById")
    public ResponseResult deleteShippingAddressById(Integer id) {
        shippingAddressService.deleteShippingAddressById(id);
        return ResponseResult.createSuccess("操作成功");
    }

    //改
    @RequestMapping("/updateShippingAddress")
    public ResponseResult updateShippingAddress(ShippingAddress shippingAddress) {
        shippingAddressService.updateShippingAddress(shippingAddress);
        return ResponseResult.createSuccess("操作成功");
    }

    //查单个
    @RequestMapping("/getShippingAddressById")
    public ResponseResult<ShippingAddress> getShippingAddressById(Integer id) {
        return ResponseResult.createSuccess(shippingAddressService.getShippingAddressById(id));
    }

    //根据用户id查地址
    @RequestMapping("/getShippingAddressByEuId")
    public ResponseResult<List<ShippingAddress>> getShippingAddressByEuId(Integer euId) {
        return ResponseResult.createSuccess(shippingAddressService.getShippingAddressByEuId(euId));
    }

    //删多个
    @RequestMapping("/deleteShippingAddresssByIds")
    public ResponseResult deleteShippingAddresssByIds(Integer[] ids) {
        shippingAddressService.deleteShippingAddresssByIds(ids);
        return ResponseResult.createSuccess("操作成功");
    }

}
