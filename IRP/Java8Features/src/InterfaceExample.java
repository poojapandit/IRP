
interface MyInterface
{
	/*public static final int a=45;
	
	public abstract void display();
	class A{}*/
	
	default void print()
	{
		System.out.println("default print");
	}
	static void show()
	{
		System.out.println("static show");
	}
	
}

class Test implements MyInterface
{
	public void print()
	{
	//	MyInterface.super.print();
		MyInterface.super.print();
		System.out.println("excel print");
	}
	
	static void show()
	{
		MyInterface.show();
		System.out.println("static show");
	}
	
}
public class InterfaceExample {
	
	public static void main(String[] args) {
		MyInterface m=new Test();
		
		m.print();
		//MyInterface.show();
		//Test.show();
	}

}
