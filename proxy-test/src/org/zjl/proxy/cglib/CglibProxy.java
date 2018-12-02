package org.zjl.proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor{

	private Object target;
	
	
	public CglibProxy(Object target) {
		super();
		this.target = target;
	}

	public Object getProxyInstance() {
		Enhancer en = new Enhancer();
		en.setSuperclass(target.getClass());
		en.setCallback(this);
		return en.create();
	}

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("open transction!");
		method.invoke(target, args);
		System.out.println("close tansction!");
		return null;
	}

}
