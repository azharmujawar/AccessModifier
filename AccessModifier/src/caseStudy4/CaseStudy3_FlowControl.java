package caseStudy4;

import java.util.Scanner;

public class CaseStudy3_FlowControl {

	
	public void ifDemo()
	{
		
		int x=10;
		int y=12;
		
		if(x+y>20)
		{
			System.out.println("X+y greater than 20");
		}
	}
	
	public void if_else()
	{
		int a=10;
		int b=12;
		
		
		if (a+b<10)
		{
			System.out.println("a+b is less than 20");
		}
		else
		{
			System.out.println("a+b is greater than 20");
		}
	}
	
	public void if_else_if()
	{

		String city="India";
		
		if(city=="Meerut")
		{
			
			System.out.println("City is Meerut");
		} else if(city=="Noida")
		{
			System.out.println("City is Noida");
		}
	      else if(city=="Agra")
	{
		System.out.println("City is Agra");
	}
	      else
	  	{
	  		System.out.println(city);
	  	}
		
		
		
		}

	public void nestedIf()
	{
		
		String address="Delhi, India";
		if(address.endsWith("India"))
		{
			if (address.contains("Meerut"))
			{
				System.out.println("your city is Merut");
			} else if(address.contains("Noida"))
			{
				System.out.println("your city is Noida");
			}else 
				
			{
				System.out.println(address.split(",")[1]);
			}
			
			
		}
		else
		{
			System.out.println("Your living in India");	
		}
		
		
		
		
	}
	
	
	public void Switch_demo()
	{
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Month");
		
		int month=sc.nextInt();
		
		switch (month) {
		case 1: {
			
			System.out.println("January");break;
		}


case 2: {
	
	System.out.println("Feb");break;
}

case 3: {
	
	System.out.println("March");break;
}

case 4: {
	
	System.out.println("April");break;
}
case 5: {
	
	System.out.println("May");break;
}
case 6: {
	
	System.out.println("Jun");break;
}
case 7: {
	
	System.out.println("July");break;
}
case 8: {
	
	System.out.println("Aug");break;
}
case 9: {
	
	System.out.println("Sept");break;
}
case 10: {
	
	System.out.println("Oct");break;
}
case 11: {
	
	System.out.println("Nov");break;
}

case 12: {
	
	System.out.println("December");break;
}
		default:
			
			System.out.println("Invalid Input");
			
		}

	}
	public static void main(String[] args) {
		
		CaseStudy4_FlowControl obj=new CaseStudy4_FlowControl();
		
		
		System.out.println("---------If Demo---------");
		System.out.println("");
		obj.ifDemo();
		
		System.out.println("---------If Else---------");
		System.out.println("");
		
		obj.if_else();
		
		System.out.println("---------If Else If---------");
		System.out.println("");
		
		obj.if_else_if();
		System.out.println("---------Nested If---------");
		System.out.println("");
		
		obj.nestedIf();
		System.out.println("---------Switch Demo---------");
		System.out.println("");
		
		obj.Switch_demo();
	
		
		

	}

}
