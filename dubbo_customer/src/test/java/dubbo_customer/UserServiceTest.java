package dubbo_customer;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dubbo.pojo.User;
import dubbo.service.UserService;

public class UserServiceTest {
	private UserService userService;

	@Before
	public void setUp() throws Exception {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:dubbo-customer.xml");
		this.userService = applicationContext.getBean(UserService.class);
	}

	@Test
	public void testQueryAll() {
		for (int a=0; a<10 ; a++) {
			
			List<User> users = this.userService.queryAll();
			for (User user : users) {
				System.out.println(user);
			}
		}
	}
	
	@Test
	public void testprint() {
		for (int a=0; a<10 ; a++) {
			
			userService.print();
			}
		}
	}
	





