package com.study.springcore.case02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.springcore.case01.HelloTime;

public class Test1 {

	public static void main(String[] args) {
		ApplicationContext ctx =new  ClassPathXmlApplicationContext("applicationContext2.xml");
		LifeCycle lifeCycle = ctx.getBean("LifeCycle", LifeCycle.class);
		lifeCycle.service();
		
		((ClassPathXmlApplicationContext)ctx).close();
	}

}
