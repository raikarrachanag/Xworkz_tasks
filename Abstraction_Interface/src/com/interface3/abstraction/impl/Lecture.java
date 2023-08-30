package com.interface3.abstraction.impl;

import com.interface3.abstraction.app.Course;

public class Lecture {
		private Course course;
		
		public void operate() {
			System.out.println("calling method in Course Class ......");
			this.course.information();
		}
		
		public void setCourse(Course course) {
			this.course = course;
		}
	}

