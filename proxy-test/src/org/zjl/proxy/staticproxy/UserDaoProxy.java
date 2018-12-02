package org.zjl.proxy.staticproxy;

import org.zjl.proxy.IUserDao;

public class UserDaoProxy implements IUserDao {

	private IUserDao dao;
	
	
	public UserDaoProxy(IUserDao dao) {
		super();
		this.dao = dao;
	}


	@Override
	public void save() {
		System.out.println("start transction!");
		dao.save();
		System.out.println("close transction!");
	}


	@Override
	public void hello(String username) {
		// TODO Auto-generated method stub
		
	}

}
