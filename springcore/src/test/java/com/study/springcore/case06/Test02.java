package com.study.springcore.case06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext6.xml");
		 RoundBean round = ctx.getBean("roundBean" ,RoundBean.class);
		 System.out.println(round
				 
				 .getRoundArea());
		 
	}

}
