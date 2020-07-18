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
	this.name = "�ƿ���";
	this.age = 21;
}

	//ʹ������ע�뷽ʽע���������ֵ
	
	/*public void setName(String name) {
		this.name = name;
	}

	

	public void setAge(int age) {
		this.age = age;
	}


	public void setPersonDao(PersonDao personDao) {
		this.personDao = personDao;
	}*/
	
//������ע��
/*	public PersonServiceBean(String name,int age,PersonDao personDao)
	{
		this.name = name;
		this.age = age;
		this.personDao = personDao;
	}*/
	
	

	
	public void printMsg() {
		
		System.out.println("����:"+name + "\n" +"����:"+age);
	}

	public void add() {
	
		personDao.save();
	}
	
}
