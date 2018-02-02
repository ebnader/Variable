package var;

public class staticvar {
	public static int x=10;
	int m=2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticvar s1=new staticvar();
		staticvar s2=new staticvar();
		staticvar s3=new staticvar();
		System.out.println(s1.x);
		System.out.println(s2.x);
		System.out.println(s3.x);
		s2.x=20;
		System.out.println(s1.x);
		System.out.println(s2.x);
		System.out.println(s3.x);
		
		
		

	}

}
