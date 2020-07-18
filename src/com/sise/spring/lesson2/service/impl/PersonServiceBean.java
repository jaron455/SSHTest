package com.sise.spring.lesson2.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sise.spring.lesson2.dao.PersonDao;
import com.sise.spring.lesson2.service.PersonService;
@Service("personService")
//@Scope("prototype")
public class PersonServiceBean implements PersonService {
	private String name;
	private int age;
@Resource
private PersonDao personDao;
public PersonServiceBean() {
	this.name = "黄俊健";
	this.age = 21;
}

	//使用设置注入方式注入各个属性值
	
	/*public void setName(String name) {
		this.name = name;
	}

	

	public void setAge(int age) {
		this.age = age;
	}


	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}*/
	
//构造器注入
/*	public PersonServiceBean(String name,int age,PersonDao personDao)
	{
		this.name = name;
		this.age = age;
		this.personDao = personDao;
	}*/
	
	

	
	public void printMsg() {
		
		System.out.println("姓名:"+name + "\n" +"年龄:"+age);
	}

	public void add() {
	
		personDao.save();
	}
	
}
