package com.study.springcore.case01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.*;

public class Test4 {

	public static void main(String[] args) {
		ApplicationContext ctx =new  ClassPathXmlApplicationContext("applicationContext.xml");
		
		CPU  cpu3= ctx.getBean("cpu3", CPU.class);
		CPU  cpu4 = ctx.getBean("cpu4", CPU.class);
		CPU  cpu5 = ctx.getBean("cpu5", CPU.class);
		CPU  cpu6 = ctx.getBean("cpu6", CPU.class);
		
		RAM ram1 = ctx.getBean("ram1", RAM.class);
		RAM ram2 = ctx.getBean("ram1", RAM.class);
		RAM ram3 = ctx.getBean("ram3", RAM.class);
		RAM ram4 = ctx.getBean("ram4", RAM.class);
		
		HD hd1 = ctx.getBean("hd1", HD.class);
		HD hd2 = ctx.getBean("hd2", HD.class);
		HD hd3 = ctx.getBean("hd3", HD.class);
		
		//DIY自組電腦
		Computer com = ctx.getBean("computer", Computer.class);
		com.setCpu(cpu6);
		com.setRam(ram4);
		com.setHd(hd3);
		System.out.println(com);
		//品牌電腦
		Computer acer = ctx.getBean("acer", Computer.class);
		System.out.println(acer);
		Computer ibm = ctx.getBean("ibm", Computer.class);
		System.out.println(ibm);
		
		//電腦陣列
		Computer[] computers	= {com, acer, ibm};
		//求總價, 限用 Java8 lambda/streame語法 
		double total = Arrays.stream(computers).mapToDouble(Computer::getPrice).sum();
		System.out.println("total" +  total);
		
		}
	

}
