package methods;

public class DynamicMethod {

	public static void main(String[] args, String password, String username) {
		// TODO Auto-generated method stub
		add(username,password);
		multi();

	}
	static void add(String x,String y){
		String result=( x+  y);
		System.out.println(result);
		
	}
	static void multi(){
		int a=20;
		int b=10;
		System.out.println(a*b);
		
	}

}
