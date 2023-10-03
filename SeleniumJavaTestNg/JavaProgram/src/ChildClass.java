
public class ChildClass extends Parentclass
{
	public static void main(String[] args) {
		
		
		ChildClass a = new ChildClass();
		a.colour();
		a.audio();
		a.gear();
		a.engine();
		a.thisColor();
	}
	
	public ChildClass()
	{
		
		System.out.println("Child class constructor");
		
	}
	
	public void thisColor()
	{
		String color = "red";
		System.out.println(color);
		System.out.println(this.color);
	}
	
	
	String color = "yellow";
	
	@Override
	public void audio()
	{
		super.audio();
		System.out.println("child class audio available");
	}
	
	public void engine()
	{
		System.out.println("Engine available");
	}
	
	public void colour()
	{
		System.out.println(color);
		System.out.println(super.color);
		
	}
}
