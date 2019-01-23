package com;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.UserService;


public class Main1 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		
		String xmlApplicationContext = "applicationContext.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(xmlApplicationContext);
		UserService userService = (UserService)ctx.getBean("userImpl");
		userService.save();
		System.out.println("------------------------");
		userService.update();
		System.out.println("------------------------");
		System.out.println();
		System.out.println();
		System.out.println();
		userService = (UserService)ctx.getBean("userImpl2");
		userService.save("zhangsan");
		System.out.println("------------------------");
		userService.update("zhangsan");
    }
}
