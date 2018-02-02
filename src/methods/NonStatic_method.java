package methods;

public class NonStatic_method {
	
	 void m(){
		System.out.println("this is a non static method");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
		NonStatic_method m1=new NonStatic_method();
		m1.m();

	}
	
	
}
