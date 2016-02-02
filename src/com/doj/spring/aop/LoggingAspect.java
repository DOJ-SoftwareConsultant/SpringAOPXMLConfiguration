package com.doj.spring.aop;

public class LoggingAspect {
	
	public void myEducationAspectStart()
	{
		System.out.println("------Courses Details are here please go through these Details------");
	}
	
	public void myEducationAspectEnd()
	{
		System.out.println("------Courses Details are Ended please see above------");

	}
	
	public void myCollegesAspectStart()
	{
		System.out.println(" =======College Details are here please go through these Details==========");
	}
	
	public void myCollegesAspectEnd()
	{
		System.out.println(" =======College Details are Ended please see above==========");

	}

}
