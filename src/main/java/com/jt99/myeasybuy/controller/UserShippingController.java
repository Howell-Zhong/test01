package com.jt99.myeasybuy.controller;

import com.jt99.myeasybuy.entity.UserShipping;
import com.jt99.myeasybuy.query.UserShippingQuery;
import com.jt99.myeasybuy.service.UserShippingService;
import com.jt99.myeasybuy.util.Page;
import com.jt99.myeasybuy.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
@RequestMapping("/user")
public class UserShippingController {
    @Autowired
    private UserShippingService userShippingService;

    @RequestMapping("/getUserShipping")
    @ResponseBody
    //查询用户发货地址
    public ResponseResult<UserShipping> getUserShipping(Integer euId){
        return ResponseResult.createSuccess(userShippingService.getUserShippingBy(euId));
    }
    @RequestMapping("/getUserShippingList")
    @ResponseBody
    //查询用户发货地址
    public ResponseResult<Page<UserShipping>> getUserShippingList(UserShippingQuery userShippingQuery){
        Page<UserShipping>page =userShippingService.getUserShipping(userShippingQuery);
        return ResponseResult.createSuccess(page);
    }
    @RequestMapping("/deleteUserShipping")
    @ResponseBody
    //删除用户发货地址
    public int deleteUserShipping(Integer esaId){
        userShippingService.deleteUserShipping(esaId);
        return 1;
    }
    @RequestMapping("/getUserShippingById")
    @ResponseBody
    //查询用户收货地址
    public UserShipping getUserShippingById(Integer esaId){
        return userShippingService.getUserShippingById(esaId);
    }
    @RequestMapping("/updateUserShipping")
    @ResponseBody
    //修改用户收货地址
    public void updateUserShipping(UserShipping userShipping){

        userShippingService.updateUserShipping(userShipping);
    }
    @RequestMapping("/addUserShipping")
    @ResponseBody
    public void addUserShipping(UserShipping userShipping){

        userShippingService.addUserShipping(userShipping);
    }
    @RequestMapping("/updateUserEsaDefault")
    @ResponseBody
    public void updateUserEsaDefault(UserShipping userShipping){
        System.out.println(userShipping.getEuId());
        System.out.println(userShipping.getEsaId());
        userShippingService.updateUserEsaDefault(userShipping);
        userShippingService.updateUserEsaDefaults(userShipping);
    }
}
