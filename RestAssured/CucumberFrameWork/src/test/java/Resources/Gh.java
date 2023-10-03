package Resources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Gh {

	public static void main(String[] args) 
	{
		
		int a[]={4,4,5,6,7,4,5};
		Set<Integer> si = new HashSet<Integer>();
		ArrayList all = new ArrayList<>();
		for(Integer aa : a)
		{
			if(!si.contains(aa))
			{	
			si.add(aa);
			}
			else
			{
				if(!all.contains(aa))
				all.add(aa);
			}
		}
		
		System.out.println("Set"+ si);
		System.out.println("Duplicate Values"+ all);
		
		ArrayList<Integer>  al = new ArrayList<Integer>();
		int count= 1;
		for(int i=0;i<a.length;i++)
		{
		if(!al.contains(a[i]))
		{	
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				count++;
			}
		}
		if(count>1)
		{
		al.add(a[i]);
		}
		count = 1;
		}
		}
		
		    System.out.println(al);
		
	        int[] numbers = {4,4,5,6,7,4,5};

	        Set<Integer> set = new HashSet<Integer>();
	        List<Integer> duplicates = new ArrayList<Integer>();

	        for (int num : numbers) 
	        {
	        	if (!set.add(num)) 
	            {
	  
	                duplicates.add(num);
	            }
	        }

	        System.out.println("Duplicate numbers: " + duplicates);
	
	        String s = "Prashanna";

	        HashMap<Character,Integer> h = new HashMap<Character,Integer>();

	        int count1 =1;
	
	        for(int i=0;i<s.length();i++)
	        {
	        	if(!h.containsKey(s.charAt(i)))
	        	{
	        		h.put(s.charAt(i), count);
	        	}
	        	else
	        	{
	        		int count2 = h.get(s.charAt(i));
	        		count2++;
	        		h.put(s.charAt(i),count2);
	        	}
	        		count=1;
	        }
	
	        System.out.println(h);
	        
	      int n =4;
	      //Upper Part
	      for(int i=1;i<=n;i++)
	      {
	    	  //space printing
	    	  for(int j=n;j>i;j--)
	    	  {
	    		  System.out.print("  ");
	    	  }
	    	  //First Element Printing
	    	  System.out.print(i+" ");
	    	  
	    	  //space printing
	    	  for(int x=1 ;x<(i-1)*2 ;x++)
	    	  {
	    		  System.out.print("  ");
	    	  }
	    	  
	    	  //Second Element Printing
	    	  if(i==1)
	    	  {
	    	    System.out.println();
	    	  }
	    	  else
	    	  {
	    		System.out.print(i+" ");
		    	System.out.println();
	    	  }
	      }
	      
	      //Lower Part
	      for(int i=n-1;i>0;i--)
	      {
	    	  //space printing
	    	  for(int j=i;j<n;j++)
	    	  {
	    		  System.out.print("  ");
	    	  }
	    	  //First Element Printing
	    	  System.out.print(i+" ");
	    	  
	    	  
	    	  //space printing
	    	  for(int x=1 ;x<(i-1)*2 ;x++)
	    	  {
	    		  System.out.print("  ");
	    	  }
	    	  
	    	  //Second Element Printing
	    	  if(i==1)
	    	  {
	    	    System.out.println();
	    	  }
	    	  else
	    	  {
	    		System.out.print(i+" ");
		    	System.out.println();
	    	  }
	      }
	      
	       
	
	
}
}
	

