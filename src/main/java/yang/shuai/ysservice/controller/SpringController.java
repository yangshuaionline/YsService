package yang.shuai.ysservice.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yang.shuai.ysservice.entity.InitSpring1;

@RestController//controller标识
@RequestMapping("/spring")//请求路径
public class SpringController {
    @GetMapping("/getSpring")//请求路径
    public void getSpring(){
        //放在src目录下
        ApplicationContext context =
                new FileSystemXmlApplicationContext("classpath:inject/testSpring.xml");
        InitSpring1 te = (InitSpring1) context.getBean("spring1");
        te.logOut();
    }
}
