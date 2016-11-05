package com.oa.domain;

import java.util.Date;

public class Student {
	private Integer id;
	private String login_name;
	private String login_password;
	private String name;
	private Integer sex;
	private String school;
	private Date birthday;
	private String class_name;
	private String status;
	private Date time_begin;
	private String tel;
	private String email;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLogin_name() {
		return login_name;
	}
	public void setLogin_name(String login_name) {
		this.login_name = login_name;
	}
	public String getLogin_password() {
		return login_password;
	}
	public void setLogin_password(String login_password) {
		this.login_password = login_password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getTime_begin() {
		return time_begin;
	}
	public void setTime_begin(Date time_begin) {
		this.time_begin = time_begin;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Student() {
		super();
	}
	public Student(Integer id, String login_name, String login_password) {
		super();
		this.id = id;
		this.login_name = login_name;
		this.login_password = login_password;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", sex=" + sex + ", school=" + school + ", birthday=" + birthday
				+ ", class_name=" + class_name + ", status=" + status + ", time_begin=" + time_begin + ", tel=" + tel
				+ ", email=" + email + "]";
	}
	public Student(Integer id, String login_name) {
		super();
		this.id = id;
		this.login_name = login_name;
	}
	
	
}
