package org.zjl.proxy.cglib;

import org.zjl.proxy.UserDao;

public class CglibProxyTest {

	public static void main(String[] args) {
		UserDao dao = new UserDao();
		UserDao proxy = (UserDao) new CglibProxy(dao).getProxyInstance();
		proxy.hello("cglib.proxy");
	}
}
