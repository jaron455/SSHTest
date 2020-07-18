package com.sise.spring.lesson2.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sise.spring.lesson2.service.PersonService;

public class SpringTest {
	public static void main(String[] args) {
		ApplicationContext ctx =new ClassPathXmlApplicationContext("applicationContext.xml");
		PersonService personService=(PersonService)ctx.getBean("personService");
		
		personService.printMsg();
		personService.add();
	}
}
