package com;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.UserService;


public class Main2 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		
		String xmlApplicationContext = "applicationContext.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(xmlApplicationContext);
		UserService userService = (UserService)ctx.getBean("userImpl");
		// BeanNameAutoProxyCreator 不支持，内部采用 JDK 创建代理对象
		// 所以，此 demo 没法用上
		// UserImpl userService = ctx.getBean("userImpl", UserImpl.class);
		userService.save();
		System.out.println("------------------------");
		userService.update();
		System.out.println("------------------------");
    }
}
