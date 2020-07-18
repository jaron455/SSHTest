package com.sise.spring.lesson2.dao.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.sise.spring.lesson2.dao.PersonDao;

//@Component
@Repository
public class PersonDaoBean implements PersonDao {
	public void save() {
		System.out.println("持久化以上数据");
	}
}
