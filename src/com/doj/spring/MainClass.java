package com.doj.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("Bean.xml");
		Education education= (Education)context.getBean("education");
		Colleges colleges=(Colleges)context.getBean("colleges");
		//System.out.println("Education's method is calling.....");
		education.courseDetails();
		//System.out.println("Colleges's method is calling.......");
		colleges.collegeDetails();
	}

}
