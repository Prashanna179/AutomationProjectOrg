
public class corejava3 {

	public static void main(String[] args) {
		//string is an object
		
		String s  = "Prashan";
		String s1="Prashan";
		
		String s2=new String("Prashan");
		
		String s3="Java Python CSS";
		String x[] = s3.split(" ");
		
		System.out.println(s3);
		
		for(int i=0;i<x.length;i++)
		System.out.println(x[i]);
		
		String s4="Java Python CSS";
		String y[] = s4.split("Python");
		
		System.out.println(y[1]);
		System.out.println(y[1].trim());
		//
		String s5="Prashanna";
		System.out.println(s5.length());
		
		for(int i=0;i<s5.length();i++)
		{
			System.out.println(s5.charAt(i));
		}
		System.out.println("***************");
		for(int i=s5.length()-1;i>=0;i--)
		{
			System.out.println(s5.charAt(i));
		}
		
		String s6[]= {"Prashanna","Dhivyan","Letchu"};
		System.out.println(s6.length);
		
		Methods aaa = new Methods();
		aaa.getData();
		
		
		

	}

}
