package com.jt99.myeasybuy.service.impl;

import com.jt99.myeasybuy.dao.UserShippingMapper;
import com.jt99.myeasybuy.entity.UserShipping;
import com.jt99.myeasybuy.query.UserShippingQuery;
import com.jt99.myeasybuy.service.UserShippingService;
import com.jt99.myeasybuy.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserShippingImpl implements UserShippingService {
    @Autowired
    private UserShippingMapper userShippingMapper;

    //查询用户收货地址
    public Page<UserShipping> getUserShipping(UserShippingQuery userShippingQuery){
        Page<UserShipping> page = new Page<UserShipping>();
        int totalCount = userShippingMapper.getUserShippingCount(userShippingQuery);
        List<UserShipping> list =userShippingMapper.getUserShipping(userShippingQuery);
        page.setTotalCount(totalCount);
        page.setPageNo(userShippingQuery.getPageNo());
        page.setPageSize(userShippingQuery.getPageSize());
        page.setList(list);

        return page;
    }
    public UserShipping getUserShippingBy(Integer euId){
        return userShippingMapper.getUserShippingBy(euId);
    }
    public void deleteUserShipping(Integer esaId){
        userShippingMapper.deleteUserShipping(esaId);
    }
    public UserShipping getUserShippingById(Integer esaId){
        return userShippingMapper.getUserShippingById(esaId);
    }
    public void updateUserShipping(UserShipping userShipping){
        userShippingMapper.updateUserShipping(userShipping);
    }
    public void addUserShipping(UserShipping userShipping){
        userShippingMapper.addUserShipping(userShipping);
    }

    public void updateUserEsaDefault(UserShipping userShipping){userShippingMapper.updateUserEsaDefault(userShipping);}
    public void updateUserEsaDefaults(UserShipping userShipping){userShippingMapper.updateUserEsaDefaults(userShipping);}
}
