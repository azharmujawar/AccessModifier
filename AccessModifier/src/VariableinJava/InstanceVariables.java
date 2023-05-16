package VariableinJava;

public class InstanceVariables {
	
	public int rollNo;
	public String name;
	public int totalmarks;
	public int number;


	public static void main(String[] args) {
		
		InstanceVariables obj=new InstanceVariables();
		
		obj.rollNo=1000;
		obj.name="Test Engineer";
		obj.totalmarks=510;
		obj.number=123456;
		
		
		
		System.out.println(obj.rollNo);
		System.out.println(obj.name);
		System.out.println(obj.totalmarks);
		System.out.println(obj.number);
		
		
		
	}

}
