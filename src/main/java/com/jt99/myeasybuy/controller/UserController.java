package com.jt99.myeasybuy.controller;


import com.jt99.myeasybuy.entity.User;
import com.jt99.myeasybuy.query.UserQuery;
import com.jt99.myeasybuy.service.UserService;
import com.jt99.myeasybuy.util.Page;
import com.jt99.myeasybuy.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    //统计所有数据的数量,
    @RequestMapping("/getUserCount")
    public ResponseResult<Integer> getUserCount(UserQuery userQuery){
        return ResponseResult.createSuccess(userService.getUserCount(userQuery));
    }


    //分页查，与连表分页查的区别就在于实体类有没有引用类型属性
    @RequestMapping("/getUserListBy")
    public ResponseResult<Page<User>> getUserListBy(UserQuery userQuery){
        System.out.println(userQuery);
        return ResponseResult.createSuccess(userService.getUserListBy(userQuery));
    }

    //连表分页查
    @RequestMapping("/getUserInnerListBy")
    public ResponseResult<List<User>> getUserInnerListBy(UserQuery userQuery){
        return ResponseResult.createSuccess(userService.getUserInnerListBy(userQuery));
    }

    //查所有
    @RequestMapping("/getUserList")
    public ResponseResult<List> getUserList(){
        return ResponseResult.createSuccess(userService.getUserList());
    }

    //增,注册
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public ResponseResult addUser(@RequestBody User user){
        //必须设置用户状态，前端会检验用户是管理员还是普通会员。
        user.setEuType("1");
        user.setEuStatus("1");

        userService.addUser(user);
        return ResponseResult.createSuccess("操作成功");
    }

    //登录
    @RequestMapping("/login")
    public ResponseResult login(@RequestBody User user){
        System.out.println(user);
        User sqlUser = userService.login(user.getEuUserName());
        if(user.getEuPassword().equals(sqlUser.getEuPassword())){
            return ResponseResult.createSuccess(sqlUser);
        }else{
            return ResponseResult.createError();
        }
    }

    //删
    @RequestMapping("/deleteUserById")
    public ResponseResult deleteUserById(Integer id){
        userService.deleteUserById(id);
        return ResponseResult.createSuccess("操作成功");
    }

    //改
    @RequestMapping(value = "/updateUser", method = RequestMethod.POST)
    public ResponseResult updateUser(@RequestParam MultipartFile pic, User user, HttpServletRequest request){
        //2.获取保存到服务器的真实路径,根据真实路径和文件名创建目标文件对象
        String path = request.getServletContext().getRealPath("/resources/upload/user");
        System.out.println("path = " + path);
        //文件名: XLDKJV234R09SJDF.jpg
        String fileName = UUID.randomUUID() + pic.getOriginalFilename().substring(pic.getOriginalFilename().lastIndexOf("."));

        File file = new File(path + File.separator + fileName);
        //3.将上传文件的输入流写到目标文件对象中(文件的复制)
        try {
            pic.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //4.存储上传文件的路径到数据
        String picture = "/resources/upload/user/" + fileName;

        //5.传到后台
        user.setEuPicture(picture);
        userService.updateUser(user);

        //将新数据传回前端
        return ResponseResult.createSuccess(userService.getUserById(user.getEuId()));
    }

    //改密码
    //删多个
    @RequestMapping("/updatePassWord")
    public ResponseResult updatePassWord(User user,String newsPassWord){
        if(userService.updatePassWord(user,newsPassWord)=="00"){
            return ResponseResult.createSuccess("操作成功");
        }else {
            return ResponseResult.createError();
        }
    }


    //查单个
    @RequestMapping("/getUserById")
    public ResponseResult<User> getUserById(Integer euId){
        System.out.println(euId);
        return ResponseResult.createSuccess(userService.getUserById(euId));
    }

    //删多个
    @RequestMapping("/deleteUsersByIds")
    public ResponseResult deleteUsersByIds(Integer[] ids){
        userService.deleteUsersByIds(ids);
        return ResponseResult.createSuccess("操作成功");
    }

    //管理员修改用户状态（启用）,将使用状态改为1
    @RequestMapping("/startEuStatus")
    public ResponseResult startEuStatus(Integer euId){
        userService.startEuStatus(euId);
        return ResponseResult.createSuccess("操作成功");
    }

    //管理员修改用户状态（启用）,将使用状态改为2
    @RequestMapping("/stopEuStatus")
    public ResponseResult stopEuStatus(Integer euId){
        userService.stopEuStatus(euId);
        return ResponseResult.createSuccess("操作成功");
    }

    //查管理员
    @RequestMapping("/getManageById")
    public ResponseResult<User> getManageById(Integer euId){
        return ResponseResult.createSuccess(userService.getManageById(euId));
    }

}
