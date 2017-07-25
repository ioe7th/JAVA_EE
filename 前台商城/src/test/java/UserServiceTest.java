

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import org.fkit.domain.User;
import org.fkit.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceTest extends BaseJunitTest{
	@Autowired
	private UserService userService;
	//测试登录和注册
	@Test
	public void testlogin()throws Exception{
		User user=userService.login("xijian", "237251");
		assertEquals("2965452",user.getTelphone());
		System.out.println(user.getTelphone());
	}
	@Test
	public void testregist()throws Exception{
		userService.register("liujianguo", "jianguo", "18852140185", "4135413@hotmail.com", "413413");
		System.out.println("注册成功");
	}
}
