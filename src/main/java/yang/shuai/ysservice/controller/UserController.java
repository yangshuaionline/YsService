package yang.shuai.ysservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import yang.shuai.ysservice.service.UserService;


/**
 * user
 * */
@RestController//controller标识
@RequestMapping("/abc")//请求路径
public class UserController{
    @Autowired//自动初始化对象
    UserService userService;
    @GetMapping("/getUser/{id}")//请求路径
    public String getUser(@PathVariable("id") int id){
        System.out.print("id = "+id);
        return userService.Sel(id).toString();
    }
}
