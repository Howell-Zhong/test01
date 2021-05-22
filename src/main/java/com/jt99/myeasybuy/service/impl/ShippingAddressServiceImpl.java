package com.jt99.myeasybuy.service.impl;

import com.jt99.myeasybuy.dao.ShippingAddressMapper;
import com.jt99.myeasybuy.entity.ShippingAddress;
import com.jt99.myeasybuy.query.ShippingAddressQuery;
import com.jt99.myeasybuy.service.ShippingAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShippingAddressServiceImpl implements ShippingAddressService {

    @Autowired
    private ShippingAddressMapper shippingAddressMapper;

    //统计所有数据的数量
    @Override
    public int getShippingAddressCount(ShippingAddressQuery shippingAddressQuery) {
        return shippingAddressMapper.getShippingAddressCount(shippingAddressQuery);
    }

    //分页查
    @Override
    public List<ShippingAddress> getShippingAddressListBy(ShippingAddressQuery shippingAddressQuery) {
        return shippingAddressMapper.getShippingAddressListBy(shippingAddressQuery);
    }

    //连表分页查
    @Override
    public List<ShippingAddress> getShippingAddressInnerListBy(ShippingAddressQuery shippingAddressQuery) {
        return shippingAddressMapper.getShippingAddressInnerListBy(shippingAddressQuery);
    }

    //查所有
    @Override
    public List<ShippingAddress> getShippingAddressList() {
        return shippingAddressMapper.getShippingAddressList();
    }

    //增
    @Override
    public void addShippingAddress(ShippingAddress shippingAddress) {
        shippingAddressMapper.addShippingAddress(shippingAddress);
    }

    //删
    @Override
    public void deleteShippingAddressById(Integer id) {
        shippingAddressMapper.deleteShippingAddressById(id);
    }

    //改
    @Override
    public void updateShippingAddress(ShippingAddress shippingAddress) {
        shippingAddressMapper.updateShippingAddress(shippingAddress);
    }

    //查单个
    @Override
    public ShippingAddress getShippingAddressById(Integer id) {
        return shippingAddressMapper.getShippingAddressById(id);
    }

    @Override
    public List<ShippingAddress> getShippingAddressByEuId(Integer id) {
        return shippingAddressMapper.getShippingAddressByEuId(id);
    }

    //删多个
    @Override
    public void deleteShippingAddresssByIds(Integer[] ids) {
        shippingAddressMapper.deleteShippingAddresssByIds(ids);
    }
}
