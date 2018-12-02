package org.zjl.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy {

	private Object target;

	public JDKProxy(Object target) {
		super();
		this.target = target;
	}
	
	public Object getProxyInstance() {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("open transction!");
				method.invoke(target, args);
				System.out.println("close transction!");
				return null;
			}
		});
	}
}
