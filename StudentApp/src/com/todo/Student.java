package com.todo;

import java.util.Date;

public class Student implements Comparable<Student>{
	private int no;
 private String name;
	private int age;
//	private Student current_student;
	
	
    public Student(int no,String name, int age){
    	super();
        this.no=no;
        this.name=name;
        this.age=age;
        
    }

    
	public int getNo() {
		return no;
	}



	public void setNo(int no) {
		this.no = no;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return name.compareTo(o.name);
	}
	

}
