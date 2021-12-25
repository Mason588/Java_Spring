package com.study.springcore.case01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.springcore.case01.HelloTime;

public class Test2 {

	public static void main(String[] args) {
		ApplicationContext ctx =new  ClassPathXmlApplicationContext("applicationContext.xml");
		HelloTime hello = ctx.getBean(HelloTime.class);
		System.out.println(hello.sayHi());
		
		HelloTime hello2 = ctx.getBean(HelloTime.class);
		System.out.println(hello2.sayHi());
	}

}
