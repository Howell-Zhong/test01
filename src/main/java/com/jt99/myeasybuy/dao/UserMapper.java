package com.jt99.myeasybuy.dao;

import com.jt99.myeasybuy.entity.User;
import com.jt99.myeasybuy.query.UserQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    //统计所有数据的数量
    public int getUserCount(UserQuery userQuery);

    //分页查，与连表分页查的区别就在于实体类有没有引用类型属性
    public List<User> getUserListBy(UserQuery userQuery);

    //连表分页查
    public List<User> getUserInnerListBy(UserQuery userQuery);

    //查所有
    public List<User> getUserList();

    //增
    public void addUser(User user);

    //登录
    public User login(String euUserName);

    //删,以后记得参数命名要规范
    public void deleteUserById(Integer euId);

    //改
    public void updateUser(User user);

    //改密码
    public void updatePassWord(User user);

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

