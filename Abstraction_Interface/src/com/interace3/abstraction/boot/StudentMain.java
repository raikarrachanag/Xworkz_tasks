package com.interace3.abstraction.boot;

import com.interface3.abstraction.app.Course;
import com.interface3.abstraction.impl.Department;
import com.interface3.abstraction.impl.Lecture;

public class StudentMain {
	
		public static void main(String[] args) {
			Course course=new Department();
			
			Lecture lecture=new Lecture();
			lecture.setCourse(course);
			lecture.operate();

		}

	}

