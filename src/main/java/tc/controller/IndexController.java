package tc.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import tc.entity.Msg;
import tc.entity.User;
import tc.mapper.UserMapper;

@Controller
public class IndexController {
	@Autowired
	private UserMapper userMapper;
	
	@RequestMapping("/a")
	public String index() {
		List<User> queryAll = userMapper.queryAll();
		for (User user2 : queryAll) {
			System.out.println(user2.getUserName());
		}
		return "index.jsp";
	}
}
