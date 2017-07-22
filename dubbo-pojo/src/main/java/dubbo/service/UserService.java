package dubbo.service;

import java.util.List;

import dubbo.pojo.User;

public interface UserService {
	List<User> queryAll();
	void print();
}
