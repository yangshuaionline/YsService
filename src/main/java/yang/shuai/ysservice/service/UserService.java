package yang.shuai.ysservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yang.shuai.ysservice.dao.User;
import yang.shuai.ysservice.mapper.UserMapper;

@Service//service标识
public class UserService {
    @Autowired//自动初始化对象
    UserMapper userMapper;
    public User Sel(int id){
        return userMapper.Sel(id);
    }
}
