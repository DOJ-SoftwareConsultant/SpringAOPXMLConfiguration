package com.doj.spring;

public class Colleges {
	
	String name[]={"Dr. K.N. Modi","MIET","KIET","SASIIT&R"};
	int collegeCode[]={101,102,103,104};
	String city[]={"Modinagar","Meerut","Muradnagar","Mohali"};
	
	public void collegeDetails()
	{
		System.out.println("\t\t\t College Code\t\t\t College Name\t\t\t College City");

		for(int i=0;i<name.length;i++)
		{
			System.out.println("\t\t\t "+collegeCode[i]+"\t\t\t\t "+name[i]+"\t\t\t "+city[i]);

		}
	}

}
