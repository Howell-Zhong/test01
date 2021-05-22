package com.jt99.myeasybuy.service;

import com.jt99.myeasybuy.entity.ShippingAddress;
import com.jt99.myeasybuy.query.ShippingAddressQuery;

import java.util.List;

public interface ShippingAddressService {
    //统计所有数据的数量
    public int getShippingAddressCount(ShippingAddressQuery shippingAddressQuery);

    //分页查，与连表分页查的区别就在于实体类有没有引用类型属性
    public List<ShippingAddress> getShippingAddressListBy(ShippingAddressQuery shippingAddressQuery);

    //连表分页查
    public List<ShippingAddress> getShippingAddressInnerListBy(ShippingAddressQuery shippingAddressQuery);

    //查所有
    public List<ShippingAddress> getShippingAddressList();

    //增
    public void addShippingAddress(ShippingAddress shippingAddress);

    //删
    public void deleteShippingAddressById(Integer id);

    //改
    public void updateShippingAddress(ShippingAddress shippingAddress);

    //查单个
    public ShippingAddress getShippingAddressById(Integer id);

    //根据用户id查地址
    public List<ShippingAddress> getShippingAddressByEuId(Integer id);

    //删多个
    public void deleteShippingAddresssByIds(Integer[] ids);
}
