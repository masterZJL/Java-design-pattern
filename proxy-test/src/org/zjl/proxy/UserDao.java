package org.zjl.proxy;

public class UserDao implements IUserDao {

	@Override
	public void save() {
		System.out.println("save user!");
	}

	@Override
	public void hello(String username) {
		System.out.println("hello---" + username);
	}

}
