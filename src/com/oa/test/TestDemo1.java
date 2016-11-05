package com.oa.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.oa.domain.Student;
import com.oa.mapper.StudentMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring.xml")
public class TestDemo1 {
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	@Test
	public void test1(){
		SqlSession  session=sqlSessionFactory.openSession();
		StudentMapper studentMapper =session.getMapper(StudentMapper.class);
		Student student =new Student(-1,"ycx");
		studentMapper.insertStudent(student);;
		System.out.println(">>>"+student);
	}
}
