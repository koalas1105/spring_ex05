import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import rml.model.User;
import rml.service.UserService;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class) // = extends SpringJUnit4ClassRunner
@ContextConfiguration(locations = {"classpath:conf/spring.xml", "classpath:conf/spring-mybatis.xml"})
public class TestMybatis {

	private static final Logger logger = Logger.getLogger(TestMybatis.class);

	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@Test
	public void test1() {
		
		List<User> list = userService.getAll();
		logger.info(JSON.toJSONStringWithDateFormat(list, "yyyy-MM-dd HH:mm:ss"));
	}
	
	@Test
	public void test2() {

		User user = new User();
		user.setId(11);
		user.setUserName("bbbb");
		user.setAge(1234);
		user.setPassword("ABCD");
		int i = userService.insert(user);
		logger.info(JSON.toJSONStringWithDateFormat("add "+i, "yyyy-MM-dd HH:mm:ss"));
	}
	
	@Test
	public void test3() {
		
		User user = new User();
		user.setId(10);
		user.setUserName("bbbb");
		user.setAge(1234);
		user.setPassword("ABCD");
		int i = userService.update(user);
		logger.info(JSON.toJSONStringWithDateFormat("update " +i, "yyyy-MM-dd HH:mm:ss"));
	}
}
