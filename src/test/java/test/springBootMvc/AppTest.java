package test.springBootMvc;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import tc.entity.User;
import tc.mapper.UserMapper;

@RunWith(SpringJUnit4ClassRunner.class)

@SpringBootApplication  
@SpringApplicationConfiguration(classes = {Application.class})
//相当于  --spring.profiles.active=dev
@ActiveProfiles(value="dev")
@ComponentScan(basePackages={"tc.config","tc.controller"})
public class AppTest {
	
	@Autowired
	private UserMapper userMapper;
	@Test
	public void testInsert(){
		User user = new User();
		user.setUserName("张三");
		user.setAge(23);
		userMapper.save(user);
		List<User> queryAll = userMapper.queryAll();
		for (User user2 : queryAll) {
			System.out.println(user2.getUserName());
		}
		System.out.println("插入用户信息"+user.getUserName());
	}
}