package com.nt.sdp;

public class Printer {
	int pages=0;
private static Printer Instance =new Printer();//private instance variable
//see variable starts with small letter like empName
//....Constance and final all letters capital     like INSTACE
private Printer() {

	System.out.println("0: param constructor");//0 param constructor
	
}
public static Printer getInstance() {
	if(Instance==null)
	{
		Instance=new Printer();
		return Instance;
		
	}
	else
		return Instance;
}
//buisness method 
public int printPage(int  page)
{
	//System.out.println("the printed pages are::"+page);
	return page;
	
}
}
