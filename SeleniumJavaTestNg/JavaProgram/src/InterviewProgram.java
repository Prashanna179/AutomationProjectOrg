import java.util.HashMap;

public class InterviewProgram {

	
	
	public static void main(String args[])
	{
		System.out.println("Print the count of each vowels present in a String");
		String s = "abbccc";
		int count = 0;
		String a[]= {"a","e","i","o","u"};
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<s.length();j++)
			{
				if(a[i].equals(String.valueOf(s.charAt(j))))
				{
					count++;
				}
			}

			System.out.println(a[i] + "" + count);
			count = 0;
		}
		
		System.out.println("Print the count of each characters present in a String");
		//1st Approach
	/*	int counts=1;
		String str = "Prashanna";
		HashMap<String,Integer> h = new HashMap<String,Integer>();
		for(int i=0;i<s.length();i++)
		{
			if(!h.containsKey(String.valueOf(str.charAt(i))))
			{
			for(int j=i+1;j<str.length();j++)
			{
				if(String.valueOf(str.charAt(i)).equalsIgnoreCase(String.valueOf(str.charAt(j))))
					{
					   counts++;
					}
			}
 			h.put(String.valueOf(str.charAt(i)), Integer.valueOf(counts));
			counts=1;
			}	
		}
			System.out.println(h);*/
			
			//2nd Approach
			
	
			String str = "abbcccda";
			HashMap<Character,Integer> h = new HashMap<Character,Integer>();
			for(int i=0;i<str.length();i++)
			{
				if(h.containsKey(str.charAt(i)))
				{
				int count1 =	h.get(str.charAt(i));
				count1 = count1+1;
				
				h.put(Character.valueOf(str.charAt(i)) ,Integer.valueOf(count1));		  
				}
				else
				{
					h.put(Character.valueOf(str.charAt(i)) ,1);		  

				}	
				
			}
				System.out.println(h);
				
	}
	
}


