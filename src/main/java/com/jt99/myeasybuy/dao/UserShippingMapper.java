package com.jt99.myeasybuy.dao;

import com.jt99.myeasybuy.entity.UserShipping;
import com.jt99.myeasybuy.query.UserShippingQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserShippingMapper {

    //分页查询用户收货地址
    public List<UserShipping> getUserShipping(UserShippingQuery userShippingQuery);
    //统计收货地址总数
    public int getUserShippingCount(UserShippingQuery userShippingQuery);
    public UserShipping getUserShippingBy(Integer euId);

    //删除收货地址
    public void deleteUserShipping(Integer esaId);
    //查询用户收货地址
    public UserShipping getUserShippingById(Integer esaId);
    //修改用户收货地址
    public void updateUserShipping(UserShipping userShipping);
    //增加用户收货地址
    public void addUserShipping(UserShipping userShipping);

    public void updateUserEsaDefault(UserShipping userShipping);
    public void updateUserEsaDefaults(UserShipping userShipping);
}
