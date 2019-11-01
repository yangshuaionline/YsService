package yang.shuai.ysservice.controller;

import com.google.protobuf.InvalidProtocolBufferException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import yang.shuai.ysservice.dao.User;
import yang.shuai.ysservice.proto.PersonMsg;
import yang.shuai.ysservice.utils.UpPhotoNameUtils;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;

/**
 * 前端控制层
 * **/
@RestController
@RequestMapping("/test")
public class TestController {
    private static String UPLOAD_PATH = "/Users/mac/img/";
    private static String WECAT_RES_PATH = "/Users/mac/Desktop/res/";

    @RequestMapping("/getResult")
    public String home(String account,String pw){
        System.out.print(account);
        System.out.print(pw);
        User user = new User();
        user.setAccount(account);
        user.setPw(pw);
        return user.toString();
    }
    /**
     * 上传图片接口
     * */
    @PostMapping("/upload")
    public String singleFileUpload(@RequestParam("file") MultipartFile file,
                                   HttpServletRequest request) {
        try {
            // Get the file and save it somewhere
            byte[] bytes = file.getBytes();
            String imageFileName = file.getOriginalFilename();
            String fileName = UpPhotoNameUtils.getPhotoName("img",imageFileName);
            Path path = Paths.get(UPLOAD_PATH + fileName);
            Files.write(path, bytes);
//            String returnUrl = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() +UPLOAD_PATH;//存储路径
            System.out.println(fileName+"\n");
            return fileName;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }

    //使用流将图片输出
    @GetMapping("/getImage/{name}")
    public void getImage(HttpServletResponse response, @PathVariable("name") String name) throws IOException {
        response.setContentType("image/jpeg;charset=utf-8");
        response.setHeader("Content-Disposition", "inline; filename=girls.png");
        ServletOutputStream outputStream = response.getOutputStream();
        outputStream.write(Files.readAllBytes(Paths.get(UPLOAD_PATH).resolve(name)));
        outputStream.flush();
        outputStream.close();
    }

    //微信小程序获取res文件（分为.json文件和.png文件）
    @RequestMapping("/getRes/res/{name1}/{name2}/{name3}")
    public void getRes(HttpServletResponse response
            ,@PathVariable("name1") String name1
            ,@PathVariable("name2") String name2
            ,@PathVariable("name3") String name3)throws IOException{
        //遍历文件夹，找到最底层
        response.setContentType("application/octet-stream;charset=utf-8");
        response.setHeader("Content-Disposition", "inline; filename=girls.png");
        ServletOutputStream outputStream = response.getOutputStream();
        //http://localhost:8888/test/getRes/res/{name1}/{name2}/{name3}
        System.out.print(name1+"/"+name2+"/"+name3+"\n");
        outputStream.write(Files.readAllBytes(Paths.get(WECAT_RES_PATH+name1+"/"+name2+"/").resolve(name3)));
        outputStream.flush();
        outputStream.close();
    }

    //测试protobuf数据的接口
    @PostMapping("/protobuf")
    public String getProtoBuf(@RequestParam(value = "id", defaultValue = "") String str){
        try {
//        //获取Person对象
//        Protos.UserCache.Builder builder =  Protos.UserCache.newBuilder();
//        //通过person的内部类builder提供了构建相关属性的set方法
//        builder.setUID(1);
//        builder.setName("张三");
//        builder.setHead(1);
//        //序列化对象
//        Protos.UserCache person = builder.build();
//        System.out.print("数据大小"+person.toByteString().size()+"\n");
////        再将封装有数据的对象实例，转换为字节数组，用户数据传输、存储
//        byte[] perByte = id.getBytes();
//        最终传输的字节数组
            System.out.print("打印传递参数111："+str+"\n");
            byte[] bytes =  Base64.getDecoder().decode(str);
            System.out.print("数据为222："+bytes+"\n");
//        解数据
            PersonMsg.Person p = null;
            try {
                p =  PersonMsg.Person.parseFrom(bytes);
                System.out.print("数据为333："+p.getId()+"\n");
                System.out.print("数据为444："+p.getName()+"\n");
                System.out.print("数据为555："+p.getEmail()+"\n");
            }catch (InvalidProtocolBufferException e){
                System.out.print("异常为："+e+"\n");
            }
            return str;
        }catch (Exception e){
            return e.toString();
        }

    }


}