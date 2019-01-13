package com.advice;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.stereotype.Service;

@Service
public class LogAdvice implements MethodBeforeAdvice, AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println(LogAdvice.class + ", return       : " + returnValue);
	}

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println(LogAdvice.class + ", target class : " + target.getClass().getName());
		System.out.println(LogAdvice.class + ", target Method: " + method.getName());
		for (int i = 0; i < args.length; i++) {
			System.out.println("arg" + i + " : " + args[i].toString());
		}
	}

}
