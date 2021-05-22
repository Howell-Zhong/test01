package com.jt99.myeasybuy.service;


import com.jt99.myeasybuy.entity.User;
import com.jt99.myeasybuy.query.UserQuery;
import com.jt99.myeasybuy.util.Page;

import java.util.List;

public interface UserService {

    //统计所有数据的数量,命名规则：getUserCount
    public int getUserCount(UserQuery userQuery);

    //分页查，与连表分页查的区别就在于实体类有没有引用类型属性
    public Page<User> getUserListBy(UserQuery userQuery);

    //连表分页查
    public List<User> getUserInnerListBy(UserQuery userQuery);

    //查所有
    public List<User> getUserList();

    //增
    public void addUser(User user);

    //登录
    public User login(String euUserName);

    //删
    public void deleteUserById(Integer id);

    //改
    public void updateUser(User user);

    //改密码
    public String updatePassWord(User user, String newsPassWord);

    //查单个
    public User getUserById(Integer id);

    //删多个
    public void deleteUsersByIds(Integer[] ids);

    //管理员修改用户状态（启用）,将使用状态改为1
    public void startEuStatus(Integer euId);
    //管理员修改用户状态（启用）,将使用状态改为2
    public void  stopEuStatus(Integer euId);

    //获取管理员头像
    public User getManageById(Integer id);
}
