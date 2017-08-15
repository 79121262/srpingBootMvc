package tc.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import tc.entity.User;  
@Mapper
public interface UserMapper {  
      
    int save(User user);  
      
    User selectById(Integer id);  
      
    int updateById(User user);  
      
    int deleteById(Integer id);  
      
    List<User> queryAll();  
      
}  