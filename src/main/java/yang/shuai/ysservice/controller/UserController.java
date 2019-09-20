package yang.shuai.ysservice.controller;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yang.shuai.ysservice.service.UserService;


/**
 * 负责处理用户信息相关
 * */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    /**
     * 注册用户
     * */
    @RequestMapping("register")
    public String register(){
        return "123";
    }

}
