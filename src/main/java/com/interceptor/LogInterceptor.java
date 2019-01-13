package com.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Service;

@Service
public class LogInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println(LogInterceptor.class + ", 调用方法前: "+invocation.getClass());
		System.out.println(LogInterceptor.class + ", 调用方法前: "+invocation.getMethod());
		System.out.println(LogInterceptor.class + ", 调用方法前: "+invocation.getArguments());
		Object ret = invocation.proceed();
		System.out.println(LogInterceptor.class + ", 调用方法后： "+ret);
		return ret;
	}

}