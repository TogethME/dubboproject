package dubbo.service.impl;

import java.util.ArrayList;
import java.util.List;

import dubbo.pojo.User;
import dubbo.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public List<User> queryAll() {
		List<User> result = new ArrayList<User>();
		User u1 =new User();
		u1.setAge(13);
		u1.setId(1l);
		u1.setPassword("1213313");
		u1.setUsername("wangzebang");
		
		User u2 =new User();
		u2.setAge(3);
		u2.setId(3l);
		u2.setPassword("1213313");
		u2.setUsername("dongzebang");
		
		result.add(u1);
		result.add(u2);
		return result;
	}

	@Override
	public void print() {
		System.out.println("lalala-----justprint-----nothing");
		
	}

}
