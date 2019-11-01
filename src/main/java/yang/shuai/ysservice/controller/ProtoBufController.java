package yang.shuai.ysservice.controller;

import com.google.protobuf.InvalidProtocolBufferException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yang.shuai.ysservice.proto.Protos;
import yang.shuai.ysservice.service.UserService;

import java.util.Base64;


@RestController//controller标识
@RequestMapping("/proto")//请求路径
public class ProtoBufController {
    @Autowired//自动初始化对象
            UserService userService;

    @GetMapping("/buf")//请求路径
    public void getUser() {

//        Date d = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
//        System.out.println(sdf.format(d)+"\n");
//        double a = 1;
//        for(int i =10;i<10000;i++){
//            for(int j =10;j<10000;j++){
//                a = a+i*j;
//            }
//        }
//        Date dd = new Date();
//        SimpleDateFormat ddd = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
//        System.out.println(ddd.format(dd)+"\n");
//        getProfit(5,0.1,10);
//        getProfit(5,0.1,20);
//        getProfit(5,0.1,30);
//        getProfit(5,0.04,40);
//        getProfit(5,0.04,50);
//        getProfit(5,0.04,60);
//        getProfit(5,0.04,70);
//        getProfit(5,0.04,80);
        //获取Person对象
//        PersonMsg.Person.Builder builder = PersonMsg.Person.newBuilder();
//        //通过person的内部类builder提供了构建相关属性的set方法
//        builder.setId("1");
//        builder.setName("张三");
//        builder.setEmail("没有");
        //序列化对象
//        PersonMsg.Person person = builder.build();
//        System.out.print("数据大小"+person.toByteString().size()+"\n");
//        //再将封装有数据的对象实例，转换为字节数组，用户数据传输、存储
//        byte[] perByte = person.toByteArray();
//        //最终传输的字节数组
//        System.out.print("数据为："+perByte+"\n");
//        //解数据
//        PersonMsg.Person p = null;
//        try {
//            p = PersonMsg.Person.parseFrom(perByte);
//            System.out.print("数据为："+p.getId()+"\n");
//            System.out.print("数据为："+p.getName()+"\n");
//            System.out.print("数据为："+p.getEmail()+"\n");
//        }catch (InvalidProtocolBufferException e){
//            System.out.print("异常为："+e+"\n");
//        }
        Protos.UserCache.Builder builder = Protos.UserCache.newBuilder();
        Protos.UserCache person = builder.build();

        byte[] perByte = Base64.getDecoder().decode("CgQIARAKEgQIAhAFGgQIAhAK");

//            ss = new String(ss.getBytes(),"UTF-8");
//            byte[] perByte= ss.getBytes();
        System.out.print("数据为：111" + perByte + "\n");

        try {
//            Protos.UserCache userCache = null;
//            userCache = Protos.UserCache.parseFrom(perByte);
//            System.out.print("数据为："+userCache.getUID()+"\n");
//            System.out.print("数据为："+userCache.getName()+"\n");
//            System.out.print("数据为："+userCache.getVIP()+"\n");
//            System.out.print("数据为："+userCache.getHead()+"\n");

            Protos.Resource resource = null;
            resource = Protos.Resource.parseFrom(perByte);
            System.out.print("数据为：222" + resource.getType() + "\n");
            System.out.print("数据为：333" + resource.getNum() + "\n");

            Protos.Resources resources = null;
            resources = Protos.Resources.parseFrom(perByte);
            System.out.print("数据为：444" + resources.getAdd(0) + "\n");
            System.out.print("数据为：555" + resources.getDel(0) + "\n");
            System.out.print("数据为：666" + resources.getAll(0) + "\n");
        } catch (InvalidProtocolBufferException e) {
            System.out.print("异常为：" + e + "\n");
        }

    }

    private static void getProfit(double principal, double rate, int year) {
        if (year == 0) {
            System.out.print("最终资金为： " + principal + "\n");
            return;
        }
        principal = principal + principal * rate;
        year--;
        getProfit(principal, rate, year);
    }
}
