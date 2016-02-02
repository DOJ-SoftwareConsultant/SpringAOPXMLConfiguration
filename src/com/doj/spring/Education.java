package com.doj.spring;

public class Education {
	String[] course={"B.tech","MCA","B.Phrma","M.Tech","MBA"};
	
	public void courseDetails()
	{
		for(int i=0;i<course.length;i++)
		System.out.println("\t\t\t "+course[i]);
	}

}
