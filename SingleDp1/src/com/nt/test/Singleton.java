package com.nt.test;

import java.lang.reflect.Constructor;

import com.nt.sdp.Printer;

public class Singleton {

	public static void main(String[] args) {
		Printer p1=null,p2=null;
		 Object pin=null;
		
	//	Object obj=null;
		
		try {
		Class clzz=Class.forName("com.nt.sdp.Printer");//loading class 
		Constructor con=clzz.getDeclaredConstructor();
	       con.setAccessible(true);    
		pin=con.newInstance();
		//creating object naa SingleTon class Not allowed to create obj see
		//constructor 2 times called two oects created  construcor not private
		System.out.println(" printer 3 object created");
		System.out.println("printer 3 hascode::"+pin.hashCode());
				}
		
		catch(ClassNotFoundException e) {
		e.getMessage();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		p1=Printer.getInstance();
		p2=Printer.getInstance();
		try {
		if((p1!=null)||(p2!=null)||(pin!=null)){
		System.out.println("(p1==p2==pin?::)"+((p1==p2)&&(p1==pin)));
		System.out.println(p1.hashCode()+"="+p2.hashCode()+"="+pin.hashCode());
		}
		}
		catch(Exception e)
		{
			System.out.println(" error occur");
		}
		 int pages=p1.printPage(10);
	int pages1=	p2.printPage(20);
	System.out.println("pages printed by printer 1::"+pages);
	System.out.println("pages printed by printer 2::"+pages1);
		

	}

}
