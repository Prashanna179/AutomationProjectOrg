package nm;

public class Program {

	public static void main(String args[])

	{
		int n=1000;
		
		int count=0;
		for(int i=2;i<n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(i+" ");
			}
			count=0;
		}
	}
}
