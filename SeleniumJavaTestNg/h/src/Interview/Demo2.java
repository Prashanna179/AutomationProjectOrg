package Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo2 {

	public static void main(String[] args) {
		
		//Anonymous Inner Class 
		/*Demo1 d = new Demo1()
				{

					@Override
					public int add(int a, int b) {
						// TODO Auto-generated method stub
						return a+b;
					}

			
				};
		System.out.println(d.add(2, 3)); */
		
		Demo1 d = (a,b)->a+b;
		System.out.println(d.add(2,3)); 
		
		
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(4);
		l.add(7);
		l.add(-1);
		
		Comparator mc = new Comparator<Integer>()
				{

					@Override
					public int compare(Integer o1, Integer o2) {
						
						return o1.compareTo(o2);
					
					}
			
				};
				
		l.sort(mc);
		
		/*l.sort(new Comparator<Integer>()
				{

					@Override
					public int compare(Integer o1, Integer o2) {
								
								return o1.compareTo(o2);
						
					}
			
				});*/
		
		//l.sort((a,b)->a.compareTo(b));
		
		Comparator<Integer> c = (a,b)->b.compareTo(a);
		l.sort(c);
		
		System.out.println(l);
		
		
		

	}

}
