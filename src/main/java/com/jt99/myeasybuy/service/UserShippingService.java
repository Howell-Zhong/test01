package com.jt99.myeasybuy.service;

import com.jt99.myeasybuy.entity.UserShipping;
import com.jt99.myeasybuy.query.UserShippingQuery;
import com.jt99.myeasybuy.util.Page;

public interface UserShippingService {
    //查询用户收货地址
    public Page<UserShipping> getUserShipping(UserShippingQuery userShippingQuery);

    public  UserShipping getUserShippingBy(Integer euId);

    //删除用户收货地址
    public  void deleteUserShipping(Integer esaId);
    //根据收货地址编号查找
    public  UserShipping getUserShippingById(Integer esaId);
    //修改用户收货地址
    public void updateUserShipping(UserShipping userShipping);
    //增加用户收货地址
    public  void addUserShipping(UserShipping userShipping);
    //修改用户默认收货
    public void updateUserEsaDefault(UserShipping userShipping);
    public void updateUserEsaDefaults(UserShipping userShipping);
}
