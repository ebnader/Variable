package var;

public class instance {
	int z=30;
	int c=60;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		instance n1=new instance ();
		instance n2=new instance ();
		instance n3=new instance ();
		System.out.println(n1.z);
		System.out.println(n2.z);
		System.out.println(n3.z);
		n2.z=50;
		System.out.println(n1.z);
		System.out.println(n2.z);
		System.out.println(n3.z);
		
	}

}
