package com.study.springcore.case04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test001 {

	public static void main(String[] args) {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext4.xml");
		
		Currency usd = ctx.getBean("usd", USD.class);
		Currency jpy = ctx.getBean("jpy", JPY.class);
		System.out.println(usd.getvalue());
		System.out.println(jpy.getvalue());
		
		((ClassPathXmlApplicationContext)ctx).close();

	}

}
