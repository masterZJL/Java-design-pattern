package org.zjl.proxy.staticproxy;

import org.zjl.proxy.IUserDao;
import org.zjl.proxy.UserDao;

public class StaticProxyDemo {

	public static void main(String[] args) {

		IUserDao dao = new UserDao();
		UserDaoProxy proxy = new UserDaoProxy(dao);
		proxy.save();
	}

}
