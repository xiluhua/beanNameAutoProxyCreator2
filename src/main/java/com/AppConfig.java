package com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

import com.advice.LogAdvice;
import com.interceptor.LogInterceptor;
import com.service.impl.UserImpl;
import com.service.impl.UserImpl2;

@Configuration
public class AppConfig {
	
	/**
	 * 使用 BeanNameAutoProxyCreator 来创建代理
	 * @return
	 */
	@Bean
	public BeanNameAutoProxyCreator beanNameAutoProxyCreator(){
		BeanNameAutoProxyCreator beanNameAutoProxyCreator=new BeanNameAutoProxyCreator();
		// 设置要创建代理的那些Bean的名字
		List<String> list1 = new ArrayList<>();
		list1.add(this.uncap(UserImpl.class));
		list1.add(this.uncap(UserImpl2.class));
		String[] beanNames = list1.toArray(new String[list1.size()]);
		beanNameAutoProxyCreator.setBeanNames(beanNames);
		
		// 设置拦截链名字(这些拦截器是有先后顺序的)
		list1.clear();
		list1.add(this.uncap(LogAdvice.class));
		list1.add(this.uncap(LogInterceptor.class));
		String[] interceptors = list1.toArray(new String[list1.size()]);
		beanNameAutoProxyCreator.setInterceptorNames(interceptors);
		return beanNameAutoProxyCreator;
	}

	@SuppressWarnings("rawtypes")
	private String uncap(Class class1){
		return StringUtils.uncapitalize(class1.getSimpleName());
	}
	
}
