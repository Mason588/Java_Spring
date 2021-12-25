package com.study.springcore.case02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		ApplicationContext ctx =new  ClassPathXmlApplicationContext("applicationContext2.xml");

		Paper paper2 = ctx.getBean("paper2",  Paper.class);
		System.out.println(paper2);
		
	    Paper paper3 = ctx.getBean("paper3",  Paper.class);
		System.out.println(paper3);
		
	}

}
