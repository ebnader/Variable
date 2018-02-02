package methods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import return1.Model;
import return1.Return2;

public class objectprictice {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer> ();
		a.add(1);
		a.add(9);
		a.add(5);
		a.add(12);
		System.out.println("This is the first way"+a);
		System.out.println("//////////////////////////");
//		System.out.println(a.size());
////		a.remove(2);
//		System.out.println(a);
//		System.out.println(a.indexOf(1));
//		System.out.println(a.get(2));
		for(int i=0; i<a.size();i++){
			System.out.println("This is the secound way  "+a.get(i));
		}
		System.out.println("//////////////////////////");
		
		Iterator it=a.iterator();
		while(it.hasNext()){
			Object value=it.next();
			System.out.println("This is the third way  "+value);
		}
		
//		
		
	}
	


}
