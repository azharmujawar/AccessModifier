package VariableinJava;

public class LocalVariable {
	
	public void calculate()
	{
		int height=0;
		
		height=height+170;
		
		System.out.println("Height " +height+" cm");
	}

	public static void main(String[] args) {
	
		
		LocalVariable obj=new LocalVariable();
		obj.calculate();
	}

}
