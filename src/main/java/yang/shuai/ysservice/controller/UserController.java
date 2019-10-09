package yang.shuai.ysservice.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


/**
 * 跳转页面
 * */
@Controller
public class UserController {
    /**
     * 跳转html页面详细配置：
     * https://blog.csdn.net/yangshuaionline/article/details/90447754
     * */
    @GetMapping("/html")
    public String index(HttpServletRequest request){
        System.out.print("html\n");
        request.setAttribute("key","hello world");
        return "/test_html";
    }
    /**
     * 跳转jsp页面详细配置：
     * https://blog.csdn.net/yangshuaionline/article/details/90447754
     * */
    @RequestMapping("/jsp")
    public String hello() {
        System.out.print("jsp\n");
        return "test_jsp";
    }

}
