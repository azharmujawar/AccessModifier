package CaseStudy;

 class CPrivate {
	
	int a=200;
	
	private void sum() {
		
		System.out.println("Private");
		
	}
	
	protected int b=100;
	
	public void A_Public()
	{
		
	}

}	
	public class Case_Study1_Privte_Access_Modifier {
		
	
	public static void main(String[] args) {
		
		CPrivate obj=new CPrivate();
		System.out.println(obj.a);
		
		obj.A_Public();
		System.out.println(obj.b);
		

	}

}
