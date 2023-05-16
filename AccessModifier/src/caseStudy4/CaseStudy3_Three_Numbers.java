package caseStudy4;

import java.util.Scanner;

public class CaseStudy3_Three_Numbers {

	public static void main(String[] args) {


		/*
		 * int a=10,b=15,c=13; int t,l;
		 * 
		 * t=a>b?a:b;
		 * 
		 * l=c>t?c:t;
		 * 
		 * System.out.println(l);
		 */
		
		
		Scanner s=new Scanner(System.in);

		System.out.println("Please enter three number");

		int a=s.nextInt();

		int b=s.nextInt();

		int c=s.nextInt();

		if((a>b)&&(a>c))

		{

		System.out.println("a is largest number");

		}

		else if(b>c)

		{

		System.out.println("b is largest number");

		}

		else

		{

		System.out.println("c is largest number");

		}

	}

}
