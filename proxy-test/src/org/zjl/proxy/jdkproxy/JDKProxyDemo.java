package org.zjl.proxy.jdkproxy;

import org.zjl.proxy.IUserDao;
import org.zjl.proxy.UserDao;

public class JDKProxyDemo {

	public static void main(String[] args) {
		IUserDao dao = new UserDao();
		IUserDao proxy  = (IUserDao) new JDKProxy(dao).getProxyInstance();
		proxy.hello("zhoujl");
	}

}
