package CaseStudy2;

public class Case_Study2_All_Operators {
	public static void main(String[] args) {
		
int x=10;
		
		int y=20;
		
		
		System.out.println(	"//==========================Unary======================================//");
		int result= +x;
		System.out.println("+x " + result);
		
		result= -y;
		
		System.out.println("-y  " + result);
		
		result= ++x;
		System.out.println("++x " + result);
		
		result= --y;
		System.out.println("--x " + result);
		
		
		boolean ok =false;
		
		System.out.println(ok);
		System.out.println(!ok);
		
		System.out.println(	"//===========================Arithmetic======================================//");
		
result =x+y;
		
		System.out.println("x + y ="+result);
		
 result =x-y;
		
		System.out.println("x - y ="+result);
		
		
 result =x*y;
		
		System.out.println("x * y ="+result);
		
		
		
 result =x%y;
		
		System.out.println("x % y ="+result);
		
		
	System.out.println(	"//===============Bitwise and Shift===============//");
		
 result =x<<2;
		
		System.out.println("Before left Shift "+x);
		System.out.println("After left Shift "+result);
		
		
		System.out.println(	"//===========================Relational======================================//");
		
		boolean result1 = x==y;
		System.out.println("x==y? " + result1);
		
		
		result1= x!=y;
		
	System.out.println("x!=y " + result1);
	
	
	result1= x>y;
	
	System.out.println("x>y " + result1);
	
	
	result1= x>=y;
	
	System.out.println("x>=y " + result1);
	
	
	result1= x<y;
	
	System.out.println("x<y " + result1);
	
result1= x<=y;
	
	System.out.println("x<=y " + result1);
		
	
	
	System.out.println(	"//===========================Logical======================================//");
	
	System.out.println((5>3) && (8>5));
	System.out.println((5>3) && (8<5));
	
	System.out.println((5>3) || (8>5));
	System.out.println((5>3) || (8<5));
	
	System.out.println(!(5==3));
	System.out.println(!(5>3));
	
	
	System.out.println(	"//===========================Assignment======================================//");
	
	int var;
	
	int a1=4;
	var=a1;
	
	System.out.println("var using =:" +var);
	
	
var+=a1;
	
	System.out.println("var using +:" +var);
	
var*=a1;
	
	System.out.println("var using *:" +var);

		
	}
	
	
	

}
