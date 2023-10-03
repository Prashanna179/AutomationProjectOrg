package Interview;

import java.lang.reflect.Method;

 class ABC
{
	private String a;
	private String b;
	public void add()
	{
		System.out.println("Add");
	}
}

 class JVMDEMO {

	public static void main(String[] args) throws Exception {
	
	Class<?> c = Class.forName("ABC");
	Method m[]	= c.getDeclaredMethods();
	for(Method x : m)
	{
		System.out.println(x);
	}
c.getDeclaredFields();

	}

}
