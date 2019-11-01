package yang.shuai.ysservice.mapper;

import org.springframework.stereotype.Repository;
import yang.shuai.ysservice.dao.User;

@Repository//映射mapper文件，替代@mapper
public interface UserMapper {
    User Sel(int id);
}
