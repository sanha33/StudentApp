package com.todo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> al = new ArrayList<Student>();
		System.out.println("Student List (ordered by name)");
		Student s1 = new Student(1,"이산하",23);
		al.add(s1);
		Student s2 = new Student(2,"김하휼",24);
		al.add(s2);
		Student s3 = new Student(3,"이윤영",25);
		al.add(s3);
		Student s4 = new Student(3,"김동은",100);
		al.add(s4);
		Student s5 = new Student(3,"박예슬",60);
		al.add(s5);
		Student s6 = new Student(3,"김윤주",5);
		al.add(s6);
		Student s7 = new Student(3,"김성은",3);
		al.add(s7);
		Student s8 = new Student(3,"오예랑",18);
		al.add(s8);
		Student s9 = new Student(3,"김민석",28);
		al.add(s9);
		Student s10 = new Student(3,"김민식",25);
		al.add(s10);
		
		Collections.sort(al);
		
		for(Student s :al) {
			System.out.println(s.toString());
		}

		System.out.println("Student List(reverse ordered by name)");
		
		Collections.sort(al,  Collections.reverseOrder());
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i).toString());
	//		System.out.println(s.getNo()+s.getName()+s.getAge());
		
		}
	}

}
