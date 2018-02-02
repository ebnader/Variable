package return1;

public class Return2 {

	public static void main(String[] args) {
		int z=5;
		Return2 re=new Return2();
		int a=re.add(20, 30);
		System.out.println(a+z);
		int b=re.multi(2, 3);
		System.out.println(b+z);
		
	
		

	}
	public  int add(int a, int b){
		int c=a+b;
		System.out.println(c);
		return c;
		
	}
	public int  multi(int x, int y){
		int result=x*y;
		System.out.println(result);
		return result ;
		
	}

}
