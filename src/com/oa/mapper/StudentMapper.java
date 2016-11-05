package com.oa.mapper;

import com.oa.domain.Student;

public interface StudentMapper {
	public Student findAll();
	
	public void insertStudent(Student student);
}
