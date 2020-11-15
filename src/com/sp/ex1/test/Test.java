package com.sp.ex1.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sp.ex1.Coach;



public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/com/sp/ex1/test/application-context.xml");
		Coach coach = ctx.getBean("baseball",Coach.class);
		String result = coach.instruct();
		System.out.println(result);
	}	

}
