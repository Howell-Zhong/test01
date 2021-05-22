package com.jt99.myeasybuy.service.impl;


import com.jt99.myeasybuy.dao.UserMapper;
import com.jt99.myeasybuy.entity.User;
import com.jt99.myeasybuy.query.UserQuery;
import com.jt99.myeasybuy.service.UserService;
import com.jt99.myeasybuy.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    //统计所有数据的数量,命名规则：getUserCount
    public int getUserCount(UserQuery userQuery){
        return userMapper.getUserCount(userQuery);
    }

    //分页查，与连表分页查的区别就在于实体类有没有引用类型属性
    public Page<User> getUserListBy(UserQuery userQuery){
        Page<User> page = new Page<User>();
        int totalCount = userMapper.getUserCount(userQuery);
        List<User> list = userMapper.getUserListBy(userQuery);
        page.setPageNo(userQuery.getPageNo());
        page.setPageSize(userQuery.getPageSize());
        page.setTotalCount(totalCount);
        page.setList(list);
        return page;
    }

    //连表分页查
    public List<User> getUserInnerListBy(UserQuery userQuery){
        return userMapper.getUserInnerListBy(userQuery);
    }

    //查所有
    public List<User> getUserList(){
        return userMapper.getUserList();
    }

    //增
    public void addUser(User user){
        userMapper.addUser(user);
    }

    //登录
    public User login(String euUserName){
        return userMapper.login(euUserName);

    }

    //删
    public void deleteUserById(Integer id){
        userMapper.deleteUserById(id);
    }

    //改
    public void updateUser(User user){
        userMapper.updateUser(user);
    }

    //改密码
    public String updatePassWord(User user, String newsPassWord){
        //将传过来的user中的密码加密
        String mdPassWord = user.getEuPassword();
        //先查出旧密码
        User myUser = userMapper.getUserById(user.getEuId());

        //判断旧密码是否与传过来的密码相同
        if(myUser.getEuPassword().equals(mdPassWord)){
            //相同则将新密码加密
            String mdNewsPassWord = newsPassWord;
            //添加进入对象中
            myUser.setEuPassword(mdNewsPassWord);
            //update对象，更新密码
            userMapper.updatePassWord(myUser);
            return "00";
        }else {
            return "-1";
        }
    }

    //查单个
    public User getUserById(Integer id){
        return userMapper.getUserById(id);
    }

    //删多个
    public void deleteUsersByIds(Integer[] ids){
        userMapper.deleteUsersByIds(ids);
    }

    //管理员修改用户状态（启用）,将使用状态改为1
    @Override
    public void startEuStatus(Integer euId) {
        userMapper.startEuStatus(euId);
    }

    //管理员修改用户状态（启用）,将使用状态改为2
    @Override
    public void stopEuStatus(Integer euId) {
        userMapper.stopEuStatus(euId);
    }


    //获取管理员头像
    @Override
    public User getManageById(Integer id){
        return userMapper.getManageById(id);
    }
}
